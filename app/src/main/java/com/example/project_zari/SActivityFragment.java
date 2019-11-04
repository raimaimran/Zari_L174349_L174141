package com.example.project_zari;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SActivityFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_seller_activity,container,false);

        int id;
        Drawable d;
        String s;
        float f;

        ImageView bestimg1 = view.findViewById(R.id.bestsellimg1);
        ImageView bestimg2 = view.findViewById(R.id.bestsellimg2);
        ImageView bestimg3 = view.findViewById(R.id.bestsellimg3);

        id = getResources().getIdentifier("shopitem6","drawable","com.example.project_zari");
        d=getResources().getDrawable(id);
        bestimg1.setImageDrawable(d);

        id = getResources().getIdentifier("shopitem2","drawable","com.example.project_zari");
        d=getResources().getDrawable(id);
        bestimg2.setImageDrawable(d);

        id = getResources().getIdentifier("shopitem3","drawable","com.example.project_zari");
        d=getResources().getDrawable(id);
        bestimg3.setImageDrawable(d);


        TextView besttext1 = view.findViewById(R.id.bestselltext1);
        TextView besttext2 = view.findViewById(R.id.bestselltext2);
        TextView besttext3 = view.findViewById(R.id.bestselltext3);

        s="255"+" sold";
        besttext1.setText(s);
        s="324"+" sold";
        besttext2.setText(s);
        s="127"+" sold";
        besttext3.setText(s);


        ImageView topimg1 = view.findViewById(R.id.topimg1);
        ImageView topimg2 = view.findViewById(R.id.topimg2);
        ImageView topimg3 = view.findViewById(R.id.topimg3);

        id = getResources().getIdentifier("shopitem1","drawable","com.example.project_zari");
        d=getResources().getDrawable(id);
        topimg1.setImageDrawable(d);

        id = getResources().getIdentifier("shopitem4","drawable","com.example.project_zari");
        d=getResources().getDrawable(id);
        topimg2.setImageDrawable(d);

        id = getResources().getIdentifier("shopitem5","drawable","com.example.project_zari");
        d=getResources().getDrawable(id);
        topimg3.setImageDrawable(d);


        RatingBar toprating1 = view.findViewById(R.id.toprating1);
        RatingBar toprating2 = view.findViewById(R.id.toprating2);
        RatingBar toprating3 = view.findViewById(R.id.toprating3);

        f=5;
        toprating1.setRating(f);
        f=4;
        toprating2.setRating(f);
        f=5;
        toprating3.setRating(f);


        ImageView mostimg1 = view.findViewById(R.id.mostimg1);
        ImageView mostimg2 = view.findViewById(R.id.mostimg2);
        ImageView mostimg3 = view.findViewById(R.id.mostimg3);

        id = getResources().getIdentifier("shopitem2","drawable","com.example.project_zari");
        d=getResources().getDrawable(id);
        mostimg1.setImageDrawable(d);

        id = getResources().getIdentifier("shopitem6","drawable","com.example.project_zari");
        d=getResources().getDrawable(id);
        mostimg2.setImageDrawable(d);

        id = getResources().getIdentifier("shopitem4","drawable","com.example.project_zari");
        d=getResources().getDrawable(id);
        mostimg3.setImageDrawable(d);


        TextView mosttext1 = view.findViewById(R.id.mosttext1);
        TextView mosttext2 = view.findViewById(R.id.mosttext2);
        TextView mosttext3 = view.findViewById(R.id.mosttext3);

        s="1,241"+" views";
        mosttext1.setText(s);
        s="2,936"+" views";
        mosttext2.setText(s);
        s="1,644"+" views";
        mosttext3.setText(s);

        return view;
    }
}
