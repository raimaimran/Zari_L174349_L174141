package com.example.project_zari;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class buyerHomeFragment extends Fragment {

    List<DemoItem2> items;
    TextView txt;

    public buyerHomeFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


    }

    public static buyerHomeFragment newInstance() {
        buyerHomeFragment fragment = new buyerHomeFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view = inflater.inflate(R.layout.fragment_blank_bhome, container, false);
        RecyclerView rv = view.findViewById(R.id.buyerhomerecycleview);

        SharedPreferences preferences = this.getActivity().getSharedPreferences("buyersignin", Context.MODE_PRIVATE);


        String cust_name = preferences.getString("name", "Name: ");
        txt = (TextView) view.findViewById(R.id.welcome);
        txt.setText("Welcome " + cust_name );


        ImageButton btn = (ImageButton) view.findViewById(R.id.cart);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), buyer_cart.class);
                startActivity(intent);
            }
        });

        items = new ArrayList<>();

        items.add(new DemoItem2("Kapra 1", "125", "It is a cloth", R.drawable.shopitem1, 2));
        items.add(new DemoItem2("Kapra 2", "2345", "It is a cloth", R.drawable.shopitem2, 2));
        items.add(new DemoItem2("Kapra 3", "350", "It is a cloth", R.drawable.shopitem3, 3));
        items.add(new DemoItem2("Kapra 4", "400", "It is a cloth", R.drawable.shopitem4, 5));
        items.add(new DemoItem2("Kapra 1", "600", "It is a cloth", R.drawable.shopitem1, 2));
        items.add(new DemoItem2("Kapra 2", "650", "It is a cloth", R.drawable.shopitem2, 2));
        items.add(new DemoItem2("Kapra 3", "870", "It is a cloth", R.drawable.shopitem3, 3));
        items.add(new DemoItem2("Kapra 4", "90", "It is a cloth", R.drawable.shopitem4, 5));
        items.add(new DemoItem2("Kapra 1", "200", "It is a cloth", R.drawable.shopitem1, 2));
        items.add(new DemoItem2("Kapra 2", "265", "It is a cloth", R.drawable.shopitem2, 2));
        items.add(new DemoItem2("Kapra 3", "285", "It is a cloth", R.drawable.shopitem3, 3));
        items.add(new DemoItem2("Kapra 4", "325", "It is a cloth", R.drawable.shopitem4, 5));

        rv.setLayoutManager(new GridLayoutManager(getContext() , 2));
        rv.setAdapter(new bhome_Adapter(items, getContext()));
        return view;
    }



}
