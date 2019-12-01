package com.example.project_zari;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class signup_seller extends AppCompatActivity {

    DatabaseReference reff;
    Seller seller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_seller);

        reff = FirebaseDatabase.getInstance().getReference().child("Seller");
        seller = new Seller();


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
                else if (email.getText().toString().contains("@") != true)
                {
                    Toast.makeText(getApplicationContext(), "You must enter a valid email", Toast.LENGTH_SHORT).show();
                    return;
                }
                EditText pass = findViewById(R.id.ssupass);
                if (pass.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "You must enter a password", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if (pass.getText().toString().length()<8){
                    Toast.makeText(getApplicationContext(), "You password must be greater than 8 characters", Toast.LENGTH_SHORT).show();
                    return;
                }
                EditText cpass = findViewById(R.id.ssuconfirmpass);
                if (cpass.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "You must enter re-enter your password", Toast.LENGTH_SHORT).show();
                    return;
                }
                EditText phone = findViewById(R.id.ssuphone);
                EditText address = findViewById(R.id.ssuaddress);

                seller.setName(brandname.getText().toString());
                seller.setEmail(email.getText().toString());
                seller.setPassword(pass.getText().toString());
                seller.setPhone(phone.getText().toString());
                seller.setAddress(address.getText().toString());

                reff.push().setValue(seller);

                Intent intent = new Intent(signup_seller.this, Seller_Home.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
