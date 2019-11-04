package com.example.project_zari;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class signup_seller extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_seller);

        Button btn = findViewById(R.id.sellersu);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText brandname = findViewById(R.id.ssuname);
                if (brandname.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "You must enter your brand name", Toast.LENGTH_SHORT).show();
                    return;
                }
                EditText email = findViewById(R.id.ssuemail);
                if (email.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "You must enter your email", Toast.LENGTH_SHORT).show();
                    return;
                }
                EditText pass = findViewById(R.id.ssupass);
                if (pass.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "You must enter a password", Toast.LENGTH_SHORT).show();
                    return;
                }
                EditText cpass = findViewById(R.id.ssuconfirmpass);
                if (cpass.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "You must enter re-enter your password", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent(signup_seller.this, Seller_Home.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
