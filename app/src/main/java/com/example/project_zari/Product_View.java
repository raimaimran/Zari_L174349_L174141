package com.example.project_zari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;

public class Product_View extends AppCompatActivity {

    private TextView prod_name, prod_desc, prod_price;
    private ImageView prod_image;
    private RatingBar prod_rating;
    Button btn;
    Cart cart = Cart.getInstance();
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
        final Intent intent = getIntent();
        final String title = intent.getExtras().getString("Product Name");
        String price = intent.getExtras().getString("Product Price");
        final int icon = intent.getExtras().getInt("Image");
        Float rating = intent.getExtras().getFloat("Product Rating");
        String desc = intent.getExtras().getString("Product Desc");


        //setting values
        prod_name.setText(title);
        prod_desc.setText(desc);
        prod_price.setText(price);
        prod_image.setImageResource(icon);
        prod_rating.setRating(rating);

        Button btn = (Button) findViewById(R.id.visitshop);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Product_View.this, buyer_shop.class);
                startActivity(intent);
            }
        });

        //getting and setting value from elegant number button
        final ElegantNumberButton numpicker = (ElegantNumberButton) findViewById(R.id.numpicker);
        numpicker.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = numpicker.getNumber();
            }
        });

        btn = (Button) findViewById(R.id.addtocart);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String title = intent.getExtras().getString("Product Name");
                String price = intent.getExtras().getString("Product Price");
                final int icon = intent.getExtras().getInt("Image");
                Float rating = intent.getExtras().getFloat("Product Rating");
                String desc = intent.getExtras().getString("Product Desc");
                String num = numpicker.getNumber();

                DemoItem2 obj = new DemoItem2(title,price,desc,icon,rating );
                obj.setQuantity(num);
                Toast.makeText(getApplicationContext(), "ADDED TO CART", Toast.LENGTH_SHORT).show();
                cart.addToCart(obj);
            }
        });

    }
}
