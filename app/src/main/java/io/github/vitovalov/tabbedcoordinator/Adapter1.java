package io.github.vitovalov.tabbedcoordinator;

/**
 * Created by dharam on 3/2/2016.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Adapter1 extends RecyclerView.Adapter<Adapter1.CustomViewHolder> {
    private List<Student> feedItemList;
    private Context mContext;

    public Adapter1(Context context, List<Student> feedItemList) {

        this.feedItemList = feedItemList;
        this.mContext = context;

    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.myrow_items, null);
        CustomViewHolder viewHolder = new CustomViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder customViewHolder, int i) {
        Student feedItem = feedItemList.get(i);
        customViewHolder.textid.setText(feedItem.getUser_id());

    }

    public  void addItems(List<Student> newItems) {
        if (null == newItems || newItems.size() <= 0) {
            return;
        }

        if (null == feedItemList) {
            feedItemList = new ArrayList<Student>();
        }
        try {
            feedItemList.addAll(newItems);
            notifyDataSetChanged();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        return (null != feedItemList ? feedItemList.size() : 0);
    }


    public class CustomViewHolder extends RecyclerView.ViewHolder {
        protected TextView textid;
        protected TextView textView;

        public CustomViewHolder(View view) {
            super(view);
            this.textid = (TextView) view.findViewById(R.id.textView);
            this.textView = (TextView) view.findViewById(R.id.textView5);
        }
    }
}