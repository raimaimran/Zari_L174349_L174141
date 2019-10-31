package com.example.project_zari;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class signinSeller extends AppCompatActivity {

    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin_seller);

        txt = (TextView) findViewById(R.id.sredirectsignup);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(signinSeller.this, signup_seller.class);
                startActivity(intent);
            }
        });

        Button button = (Button) findViewById(R.id.sssignin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //openSellerActivity();
                Intent intent = new Intent(signinSeller.this, Seller_Home.class);
                startActivity(intent);
            }
        });
    }

//    public void openSellerActivity() {
//        Intent intent = new Intent(signinSeller.this, Seller_Home.class);
//        startActivity(intent);
//    }

}

