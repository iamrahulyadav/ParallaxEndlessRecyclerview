package io.github.vitovalov.tabbedcoordinator;

/**
 * Created by dharam on 3/5/2016.
 */
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

/**
 * Created by nitesh on 10/14/2015.
 */
public class MultipleRowViewHolder extends RecyclerView.ViewHolder {

    public TextView multipleContent;
    private int type;

    public MultipleRowViewHolder(View itemView, int type) {
        super(itemView);

        if (type == Vairiables.FIRST_ROW){
            multipleContent = (TextView)itemView.findViewById(R.id.textView7);
        }else if(type == Vairiables.OTHER_ROW) {
            multipleContent = (TextView)itemView.findViewById(R.id.textView6);

        }else{

            Vairiables.progressBar = (ProgressBar) itemView.findViewById(R.id.progressBar1);
            Vairiables.progressBar.setVisibility(View.VISIBLE);
        }
    }
}