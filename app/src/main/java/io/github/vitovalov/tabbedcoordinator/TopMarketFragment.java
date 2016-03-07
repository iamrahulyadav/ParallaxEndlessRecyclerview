package io.github.vitovalov.tabbedcoordinator;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import cz.msebera.android.httpclient.Header;
import cz.msebera.android.httpclient.client.params.ClientPNames;

/**
 * Created by dharam on 3/1/2016.
 */
public class TopMarketFragment extends Fragment {

    private RecyclerView mRecyclerView;
    MultipleRowAdapter mAdapter;
    private List<MyPojo> studentList;
    ArrayList<ResultData> data;
    AsyncHttpClient client;
    final static int DEFAULT_TIMEOUT = 15 * 1000;
    int page = 1;
    RelativeLayout rel1;
    ArrayList<Item> items = new ArrayList<>();
    ArrayList<Item> items1 = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.myitmelist, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.fragment_list_rv);
        rel1 = (RelativeLayout) view.findViewById(R.id.rel1);
        rel1.setVisibility(View.GONE);
        client = ClientHttp.getInstance(getActivity());

        getData();
        items.clear();
        items1.clear();
        return view;
    }

    public void getData() {

        String url = "http://www.zakoopi.com/api/Common/all_top_market.json?page=" + page;
        client.getHttpClient().getParams()
                .setParameter(ClientPNames.ALLOW_CIRCULAR_REDIRECTS, true);
        client.setTimeout(DEFAULT_TIMEOUT);

        client.get(url, new AsyncHttpResponseHandler() {

            @Override
            public void onStart() {
                // called before request is started

            }

            @Override
            public void onSuccess(int statusCode, Header[] headers,
                                  byte[] response) {

                try {

                    BufferedReader br = new BufferedReader(
                            new InputStreamReader(new ByteArrayInputStream(
                                    response)));
                    String st = "";
                    String st1 = "";
                    while ((st = br.readLine()) != null) {

                        st1 = st1 + st;
                        // Log.e("success", "success");

                    }
                    Log.e("RES_LOGIN", st1);
                    showStoreData(st1);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers,
                                  byte[] errorResponse, Throwable e) {
                // called when response HTTP status is "4XX" (eg. 401, 403, 404)
                Log.e("FAIL", "FAIl" + statusCode);

            }

            @Override
            public void onRetry(int retryNo) {
                // called when request is retried
            }
        });

    }

    public void showStoreData(String st) {

        Gson gson = new Gson();
        JsonReader reader = new JsonReader(new StringReader(st));
        reader.setLenient(true);
        TopMarketDetailsmodel details = gson.fromJson(reader, TopMarketDetailsmodel.class);
        ArrayList<ResultData> data = details.getData();
        if (data.size() > 0) {

            new getProductList().execute(data);

        }

    }

    public class getProductList extends AsyncTask<ArrayList<ResultData>, Void, Void> {
        @Override
        protected Void doInBackground(ArrayList<ResultData>... params) {

            data = new ArrayList<>();
            data.clear();
            data = params[0];
            studentList = new ArrayList<>();
            studentList.clear();

            for (int i = 0; i < data.size(); i++) {

                String area = data.get(i).getSub_area_name();
                ArrayList<StoreData> stores = data.get(i).getStores();

                items.add(new SectionItem(area));

                for (int k = 0; k < stores.size(); k++) {
                    items.add(new MyTestPojo(stores.get(k).getStore_name()));
                }

            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);

            mRecyclerView.setHasFixedSize(true);
            mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
            mAdapter = new MultipleRowAdapter(getActivity(),items,mRecyclerView);
            mRecyclerView.setAdapter(mAdapter);

            mAdapter.setOnLoadMoreListener(new MultipleRowAdapter.OnLoadMoreListener() {
                @Override
                public void onLoadMore() {

                    items.add(null);
                    mAdapter.notifyItemInserted(items.size() - 1);
                    page++;
                    getData1(page);
                }
            });

        }
    }


    public void getData1(int page) {

        String url = "http://www.zakoopi.com/api/Common/all_top_market.json?page=" + page;
        client.getHttpClient().getParams()
                .setParameter(ClientPNames.ALLOW_CIRCULAR_REDIRECTS, true);
        client.setTimeout(DEFAULT_TIMEOUT);

        client.get(url, new AsyncHttpResponseHandler() {

            @Override
            public void onStart() {
                // called before request is started
                rel1.setVisibility(View.GONE);
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers,
                                  byte[] response) {

                try {

                    BufferedReader br = new BufferedReader(
                            new InputStreamReader(new ByteArrayInputStream(
                                    response)));
                    String st = "";
                    String st1 = "";
                    while ((st = br.readLine()) != null) {

                        st1 = st1 + st;
                        // Log.e("success", "success");
                    }

                    Log.e("RES_LOGIN", st1);
                    showStoreData1(st1);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers,
                                  byte[] errorResponse, Throwable e) {
                // called when response HTTP status is "4XX" (eg. 401, 403, 404)
                Log.e("FAIL", "FAIl" + statusCode);
                rel1.setVisibility(View.GONE);
            }

            @Override
            public void onRetry(int retryNo) {
                // called when request is retried
            }
        });

    }

    public void showStoreData1(String st) {

        Gson gson = new Gson();
        JsonReader reader = new JsonReader(new StringReader(st));
        reader.setLenient(true);
        TopMarketDetailsmodel details = gson.fromJson(reader, TopMarketDetailsmodel.class);
        ArrayList<ResultData> data = details.getData();

        if (data.size() > 0) {

            items.remove(items.size() - 1);
            mAdapter.notifyItemRemoved(items.size());

            for (int i = 0; i <=data.size(); i++) {

                String area = data.get(i).getSub_area_name();
                ArrayList<StoreData> stores = data.get(i).getStores();
                items.add(new SectionItem(area));

                for (int k = 0; k < stores.size(); k++) {
                    items.add(new MyTestPojo(stores.get(k).getStore_name()));
                }

               mAdapter.notifyItemInserted(items.size());

            }

            mAdapter.setLoaded();
            rel1.setVisibility(View.GONE);

        }else{

            rel1.setVisibility(View.GONE);
            mAdapter.setLoaded();
        }

    }

}
