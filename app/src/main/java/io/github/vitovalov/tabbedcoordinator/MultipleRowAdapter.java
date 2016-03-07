package io.github.vitovalov.tabbedcoordinator;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by dharam on 3/5/2016.
 */
public class MultipleRowAdapter extends RecyclerView.Adapter<MultipleRowViewHolder> {

    private LayoutInflater inflater = null;
    private List<Item> multipleRowModelList;
    private OnLoadMoreListener onLoadMoreListener;
    private int visibleThreshold = 2;
    private int lastVisibleItem, totalItemCount;
    private boolean loading;

    public MultipleRowAdapter(Context context, List<Item> multipleRowModelList, RecyclerView recyclerView){
        this.multipleRowModelList = multipleRowModelList;
        inflater = LayoutInflater.from(context);

        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {

            final LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                    super.onScrolled(recyclerView, dx, dy);

                    totalItemCount = linearLayoutManager.getItemCount();
                    lastVisibleItem = linearLayoutManager.findLastVisibleItemPosition();

                    if (!loading && totalItemCount < (lastVisibleItem + visibleThreshold)) {

                        if (onLoadMoreListener != null) {

                            onLoadMoreListener.onLoadMore();

                        }
                        loading = true;

                    }
                }
            });
        }
    }

    public void setLoaded() {

        loading = false;

    }

    @Override
    public MultipleRowViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = null;

        if (viewType == Vairiables.FIRST_ROW)
            view = inflater.inflate(R.layout.myviewitem, parent, false);
        else if (viewType == Vairiables.OTHER_ROW)
            view = inflater.inflate(R.layout.view_header, parent, false);
        else
            view = inflater.inflate(R.layout.progressbar_item, parent, false);

        return new MultipleRowViewHolder(view, viewType);
    }

    @Override
    public void onBindViewHolder(MultipleRowViewHolder holder, int position) {

        final Item i = multipleRowModelList.get(position);
        if (i != null) {
            if (i.isSection()) {
                SectionItem si = (SectionItem) i;

                holder.multipleContent.setText(si.getTitle());

            } else {

                MyTestPojo ei = (MyTestPojo) i;
                holder.multipleContent.setText(ei.getHead());

            }
        }
    }

    @Override
    public int getItemCount() {

        return (multipleRowModelList != null && multipleRowModelList.size() > 0 ) ? multipleRowModelList.size() : 0;
    }

    @Override
    public int getItemViewType(int position) {

        Item multipleRowModel = multipleRowModelList.get(position);

        if (multipleRowModel != null)

            if(multipleRowModel.isSection() == true){

                return 1;

            }else{

                return 2;
            }


        return super.getItemViewType(position);
    }

    public void setOnLoadMoreListener(OnLoadMoreListener onLoadMoreListener) {
        this.onLoadMoreListener = onLoadMoreListener;
    }

    public interface OnLoadMoreListener {
        void onLoadMore();
    }

}