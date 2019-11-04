package com.example.project_zari;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class sellerShopAdapter extends RecyclerView.Adapter<sellerShopAdapter.ShopViewHolder> {

    private List<DemoItem> items;
    private Context context;

    public sellerShopAdapter(List<DemoItem> i, Context context) {
        this.items = i;
        this.context = context;
    }

    @NonNull
    @Override
    public ShopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.shop_item_layout,parent,false);
        return new ShopViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull sellerShopAdapter.ShopViewHolder holder, int position) {
        String t = items.get(position).title;
        holder.prodtitle.setText(t);
        Drawable i = items.get(position).icon;
        holder.prodimg.setImageDrawable(i);
        float r = items.get(position).rating;
        holder.rating.setRating(r);
        t = items.get(position).desc;
        holder.proddesc.setText(t);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    public class ShopViewHolder extends RecyclerView.ViewHolder{
        ImageView prodimg;
        TextView prodtitle;
        RatingBar rating;
        TextView proddesc;
        public ShopViewHolder(@NonNull View itemView) {
            super(itemView);
            prodimg = itemView.findViewById(R.id.prod_icon);
            prodtitle = itemView.findViewById(R.id.prod_name);
            rating = itemView.findViewById(R.id.ratingBar);
            proddesc = itemView.findViewById(R.id.prod_desc);
        }
    }
}
