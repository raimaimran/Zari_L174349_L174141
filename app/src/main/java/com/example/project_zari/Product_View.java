package com.example.project_zari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class Product_View extends AppCompatActivity {

    private TextView prod_name, prod_desc, prod_price;
    private ImageView prod_image;
    private RatingBar prod_rating;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product__view);

        //getting view ids
        prod_name = (TextView) findViewById(R.id.prod_name);
        prod_desc = (TextView) findViewById(R.id.proddesctext);
        prod_price = (TextView) findViewById(R.id.price);
        prod_image = (ImageView) findViewById(R.id.prod_image);
        prod_rating = (RatingBar) findViewById(R.id.prodratingBar);

        //getting value from pervious activity
        Intent intent = getIntent();
        String title = intent.getExtras().getString("Product Name");
        String price = intent.getExtras().getString("Product Price");
        int icon = intent.getExtras().getInt("Image");
        Float rating = intent.getExtras().getFloat("Product Rating");
        String desc = intent.getExtras().getString("Product Desc");


        //setting values
        prod_name.setText(title);
        prod_desc.setText(desc);
        prod_price.setText(price);
        prod_image.setImageResource(icon);
        prod_rating.setRating(rating);


    }
}
