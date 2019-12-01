package com.example.project_zari;


import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class buyerFavFragment extends Fragment {

    List<DemoItem2> items;
    private ItemViewModel itemmodel;

    public buyerFavFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        itemmodel = ViewModelProviders.of(this).get(ItemViewModel.class);
        itemmodel.init();
    }

    public static buyerFavFragment newInstance() {
        buyerFavFragment fragment = new buyerFavFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_blank_bfav, container, false);
        RecyclerView rv = view.findViewById(R.id.buyerfavrecycleview);

        items = new ArrayList<>();



        rv.setLayoutManager(new GridLayoutManager(getContext() , 1));

        rv.setAdapter(new bfav_Adapter(itemmodel.getItems(), getContext())); //get value problem
        return view;
    }



}
