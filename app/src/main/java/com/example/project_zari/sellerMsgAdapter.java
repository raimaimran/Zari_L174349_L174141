package com.example.project_zari;

import android.content.Context;
import android.content.res.Resources;
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

public class sellerMsgAdapter extends RecyclerView.Adapter<sellerMsgAdapter.MsgViewHolder> {

    private List<DemoMsgItem> items;
    private Context context;

    public sellerMsgAdapter(List<DemoMsgItem> i, Context context) {
        this.items = i;
        this.context = context;
    }

    @NonNull
    @Override
    public sellerMsgAdapter.MsgViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.msg_item_layout,parent,false);
        return new sellerMsgAdapter.MsgViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull sellerMsgAdapter.MsgViewHolder holder, int position) {
       // sellerMsgAdapter.MsgViewHolder myholder = holder;
        String n = items.get(position).msgname;
        holder.msgname.setText(n);
        Drawable i = items.get(position).msgicon;
        int id = context.getResources().getIdentifier("circle","drawable","com.example.project_zari");
        Drawable d=context.getResources().getDrawable(id);
        holder.msgicon.setImageDrawable(d);
        holder.msgicon.setBackground(i);
        n = items.get(position).msg;
        holder.msg.setText(n);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    public class MsgViewHolder extends RecyclerView.ViewHolder{
        TextView msgname;
        TextView msg;
        ImageView msgicon;
        public MsgViewHolder(@NonNull View itemView) {
            super(itemView);
            msgname = itemView.findViewById(R.id.person_name);
            msg= itemView.findViewById(R.id.person_msg);
            msgicon = itemView.findViewById(R.id.person_icon);
        }
    }
}
