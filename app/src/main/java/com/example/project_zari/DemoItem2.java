package com.example.project_zari;

import android.graphics.drawable.Drawable;

public class DemoItem2 {
    public String title;
    public String price;
    public int icon;
    public float rating;
    public String Desc;

    public DemoItem2(String title, String p, String d,int i, float r) {
        this.title = title;
        this.price = p;
        this.icon = i;
        this.rating = r;
        this.Desc = d;
    }

    public String getTitle() {
        return title;
    }

    public String getPrice() {
        return price;
    }

    public int getIcon() {
        return icon;
    }

    public float getRating() {
        return rating;
    }

    public String getDesc() {
        return Desc;
    }
}
