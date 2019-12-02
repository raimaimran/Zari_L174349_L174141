package com.example.project_zari;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.StorageReference;

public class SellerAddProduct extends AppCompatActivity {

    public static final int MY_PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE = 123;
    DatabaseReference reff;
    Item item;

    private StorageReference mStorageRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seller_add_product);

        reff = FirebaseDatabase.getInstance().getReference().child("Items");
        item = new Item();

        Button addbtn = findViewById(R.id.addbtn);
        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name = findViewById(R.id.nametext);
                if (name.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "You must enter your product name", Toast.LENGTH_SHORT).show();
                    return;
                }
                EditText desc = findViewById(R.id.desctext);
                if (desc.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "You must enter your product description", Toast.LENGTH_SHORT).show();
                    return;
                }
                EditText price = findViewById(R.id.pricetext);
                if (name.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "You must enter your product price", Toast.LENGTH_SHORT).show();
                    return;
                }
                Toast.makeText(getApplicationContext(), "Your product has been added!", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
