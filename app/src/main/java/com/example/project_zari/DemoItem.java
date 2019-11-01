package com.example.project_zari;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.RatingBar;

public class DemoItem {
    public String title;
    public String desc;
    public Drawable icon;
    public float rating;

    public DemoItem(String title, String d, Drawable i, float r) {
        this.title = title;
        this.desc = d;
        this.icon = i;
        this.rating = r;
    }

}
