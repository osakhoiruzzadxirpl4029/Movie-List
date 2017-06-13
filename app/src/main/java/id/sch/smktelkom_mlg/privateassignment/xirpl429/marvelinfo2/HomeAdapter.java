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

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {

    private List<HomeListItem> homeListItems;
    private Context context;
    public HomeAdapter(List<HomeListItem> homeListItems, Context context) {
        this.homeListItems = homeListItems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.home_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final HomeListItem homeListItem = homeListItems.get(position);

        holder.textViewJudul.setText(homeListItem.getJudul());

        Glide
                .with(context)
                .load(homeListItem.getBackdrop())
                .into(holder.imageViewBackDrop);

    }


    @Override
    public int getItemCount() {

        return homeListItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        public TextView textViewJudul;
        public ImageView imageViewBackDrop;
        public LinearLayout linearLayout;

        public ViewHolder(View itemView) {
            super(itemView);

            textViewJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
            imageViewBackDrop = (ImageView) itemView.findViewById(R.id.imageViewBackDrop);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.LinearLayout);

        }
    }
}