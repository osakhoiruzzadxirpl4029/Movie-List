package id.sch.smktelkom_mlg.privateassignment.xirpl429.marvelinfo2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by SUPER USER on 13/06/2017.
 */

public class LatestAdapter extends RecyclerView.Adapter<LatestAdapter.ViewHolder> {
    private List<LatestListItem> latestListItemList;
    private Context context;

    public LatestAdapter(List<LatestListItem> latestListItems, Context context) {
        this.latestListItemList = latestListItems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.latest_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final LatestListItem latestListItem = latestListItemList.get(position);

        holder.textViewJudul3.setText(latestListItem.getJudul());

        Glide
                .with(context)
                .load(latestListItem.getBackdrop())
                .into(holder.imageViewBackDrop3);

    }

    @Override
    public int getItemCount() {
        return latestListItemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewJudul3;
        public ImageView imageViewBackDrop3;
        public LinearLayout linearLayout3;

        public ViewHolder(View itemView) {
            super(itemView);

            textViewJudul3 = (TextView) itemView.findViewById(R.id.textViewJudul3);
            imageViewBackDrop3 = (ImageView) itemView.findViewById(R.id.imageViewBackDrop3);
            linearLayout3 = (LinearLayout) itemView.findViewById(R.id.LinearLayout3);

        }
    }
}
