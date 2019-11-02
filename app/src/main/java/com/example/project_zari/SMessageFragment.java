package com.example.project_zari;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SMessageFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_seller_message,container,false);

        RecyclerView msgitemslist = view.findViewById(R.id.message_recyclerview);
        msgitemslist.setLayoutManager(new LinearLayoutManager(getContext()));

        List<DemoMsgItem> msgitems=new ArrayList<>();
        int id;
        String n;
        String m;
        Drawable d;

        id = getResources().getIdentifier("person_placeholder","drawable","com.example.project_zari");
        d=getResources().getDrawable(id);
        DemoMsgItem newitem=new DemoMsgItem("John Smith","Hello, I am contacting you regarding whatever blah lols",d);
        msgitems.add(newitem);

        newitem=new DemoMsgItem("Sana Basharat","Hi, I hope this app works, otherwise I'm gonna cut someone.",d);
        msgitems.add(newitem);

        newitem=new DemoMsgItem("Raima Imran","Hola! I don't know why I said Hola.",d);
        msgitems.add(newitem);

        newitem=new DemoMsgItem("Mrs. Doubtfire","Hi dear, please be careful, thanks.",d);
        msgitems.add(newitem);

        msgitemslist.setAdapter(new sellerMsgAdapter(msgitems,getContext()));
        return view;
    }
}
