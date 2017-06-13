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

public class NowPlayingAdapter extends RecyclerView.Adapter<NowPlayingAdapter.ViewHolder> {
    private List<NowPlayingListItem> nowPlayingListItems;
    private Context context;

    public NowPlayingAdapter(List<NowPlayingListItem> nowPlayingListItems, Context context) {
        this.nowPlayingListItems = nowPlayingListItems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.nowplaying_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final NowPlayingListItem nowPlayingListItem = nowPlayingListItems.get(position);

        holder.textViewJudul2.setText(nowPlayingListItem.getJudul());
        holder.textViewDeskripsi2.setText(nowPlayingListItem.getOverview());

        Glide
                .with(context)
                .load(nowPlayingListItem.getBackdrop())
                .into(holder.imageViewBackDrop2);

    }

    @Override
    public int getItemCount() {
        return nowPlayingListItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewJudul2;
        public ImageView imageViewBackDrop2;
        public LinearLayout linearLayout2;
        public TextView textViewDeskripsi2;

        public ViewHolder(View itemView) {
            super(itemView);

            textViewJudul2 = (TextView) itemView.findViewById(R.id.textViewJudul2);
            textViewDeskripsi2 = (TextView) itemView.findViewById(R.id.textViewDeskripsi2);
            imageViewBackDrop2 = (ImageView) itemView.findViewById(R.id.imageViewBackDrop2);
            linearLayout2 = (LinearLayout) itemView.findViewById(R.id.LinearLayout2);

        }
    }
}
