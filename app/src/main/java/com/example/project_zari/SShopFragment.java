package com.example.project_zari;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class SShopFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_seller_shop,container,false);

        RecyclerView shopitemslist = view.findViewById(R.id.shop_recyclerview);
        shopitemslist.setLayoutManager(new GridLayoutManager(getContext(),2));

        List<DemoItem> shopitems=new ArrayList<>();
        int id;
        String s;
        Drawable d;

        id = getResources().getIdentifier("shopitem1","drawable","com.example.project_zari");
        d=getResources().getDrawable(id);
        DemoItem newitem=new DemoItem("Red Lehnga","Beautiful embroidered lehnga with long kameez and dupatta.",d,5);
        shopitems.add(newitem);

        id = getResources().getIdentifier("shopitem2","drawable","com.example.project_zari");
        d=getResources().getDrawable(id);
        newitem=new DemoItem("Mehndi dress","Yellow garara with green shirt, perfect for Mehndi or Dholki..",d,4);
        shopitems.add(newitem);

        id = getResources().getIdentifier("shopitem3","drawable","com.example.project_zari");
        d=getResources().getDrawable(id);
        newitem=new DemoItem("Cream colored dress","Traditional maxi, cream colored.",d,3);
        shopitems.add(newitem);

        id = getResources().getIdentifier("shopitem4","drawable","com.example.project_zari");
        d=getResources().getDrawable(id);
        newitem=new DemoItem("White long dress","White dress with golden embroidered dupatta.",d,1);
        shopitems.add(newitem);

        id = getResources().getIdentifier("shopitem5","drawable","com.example.project_zari");
        d=getResources().getDrawable(id);
        newitem=new DemoItem("Diamond earrings","Diamond earrings with neat finish..",d,2);
        shopitems.add(newitem);

        id = getResources().getIdentifier("shopitem6","drawable","com.example.project_zari");
        d=getResources().getDrawable(id);
        newitem=new DemoItem("Navy blue dress","Gold embroidered blue lehnga with net dupatta, very elegant",d,5);
        shopitems.add(newitem);

        shopitemslist.setAdapter(new sellerShopAdapter(shopitems,getContext()));
        return view;
    }
}
