package com.example.android.tourguide;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Reshaud Ally on 1/22/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private ArrayList<LocationData> data;

    public RecyclerAdapter(ArrayList<LocationData> locationData) {
        this.data = locationData;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //create a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_layout, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.imgView.setImageResource(data.get(position).getImg());
        holder.titleView.setText(data.get(position).getTitle());
        holder.descripView.setText(data.get(position).getDescrip());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    // Provide a reference to the views for each data item
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private ImageView imgView;
        private ImageView moreInfo;
        private TextView titleView;
        private TextView descripView;

        public ViewHolder(View itemView) {
            super(itemView);

            imgView = (ImageView) itemView.findViewById(R.id.card_image);
            titleView = (TextView) itemView.findViewById(R.id.card_title);
            descripView = (TextView) itemView.findViewById(R.id.card_description);
            moreInfo = (ImageView) itemView.findViewById(R.id.more_info);

            //set OnClickListener
            moreInfo.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if(v.getId() == moreInfo.getId()){
                if (descripView.getVisibility() == View.VISIBLE) {
                    descripView.setVisibility(View.GONE);
                    moreInfo.setImageResource(R.drawable.ic_keyboard_arrow_down_black_36dp);
                } else if (descripView.getVisibility() == View.GONE) {
                    descripView.setVisibility(View.VISIBLE);
                    moreInfo.setImageResource(R.drawable.ic_keyboard_arrow_up_black_36dp);
                }

            }

        }
    }
}
