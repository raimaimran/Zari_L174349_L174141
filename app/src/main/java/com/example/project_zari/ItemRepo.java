package com.example.project_zari;

import java.util.ArrayList;
import java.util.List;

public class ItemRepo {

    private static ItemRepo itemrepo = new ItemRepo();
    private ArrayList<DemoItem2> items = new ArrayList<>();

    public static ItemRepo getInstance(){
        return itemrepo;
    }

    private ItemRepo(){}

    //PRETENDING TO GET DATA FROM WEB SERVICE
    public List<DemoItem2> getItems(){

        setItems();
        List<DemoItem2> item2 = new ArrayList<>(items);
        //item2.setValue(items);
        return item2;
    }

    public void setItems(){

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
    }
}
