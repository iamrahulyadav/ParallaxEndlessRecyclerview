package io.github.vitovalov.tabbedcoordinator;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
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
public class MyFragment2 extends Fragment {

    private RecyclerView mRecyclerView;
    Adapter2 mAdapter;
    protected Handler handler;
    private List<Student> studentList;
   // ArrayList<ReviewDataModel> data;
    AsyncHttpClient client;
    final static int DEFAULT_TIMEOUT = 15 * 1000;
    int page = 1;
    RelativeLayout rel1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.myitmelist, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.fragment_list_rv);
        rel1 = (RelativeLayout) view.findViewById(R.id.rel1);
        studentList = new ArrayList<>();
        studentList.clear();
        handler = new Handler();
        client = ClientHttp.getInstance(getActivity());
       getData();

        return view;
    }

    public void getData() {

        String url = "http://www.zakoopi.com/api/stores/my_view_review/1110.json?page=" + page;
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
      /*  ReviewDetailsModel details = gson.fromJson(reader, ReviewDetailsModel.class);
        ArrayList<ReviewDataModel> data = details.getReview();
        if (data.size() > 0) {

            new getProductList().execute(data);

        }*/

    }

    /*public class getProductList extends AsyncTask<ArrayList<ReviewDataModel>, Void, Void> {
        @Override
        protected Void doInBackground(ArrayList<ReviewDataModel>... params) {

            data = new ArrayList<>();
            data.clear();
            data = params[0];
            for (int i = 0; i < data.size(); i++) {

                String st1 = data.get(i).getUser_id();
                String st2 = data.get(i).getReview();
                Student stu = new Student(st1, st2);
                studentList.add(stu);

            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);

            mRecyclerView.setHasFixedSize(true);
            mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
            mAdapter = new Adapter2(getActivity(), studentList);
            mRecyclerView.setAdapter(mAdapter);


        }
    }
*/
}
