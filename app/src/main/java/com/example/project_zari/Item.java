package com.example.project_zari;

public class Item {

    String email;
    String name;
    String desc;
    int price;
    String category;
    String image;
    String sizechart;
    int rating;
    int quantitysold;


    public Item(String email, String name, String desc, int price, String category, String image, String sizechart) {
        this.email = email;
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.category = category;
        this.image = image;
        this.sizechart = sizechart;
        this.rating = 0;
        this.quantitysold = 0;
    }
}
