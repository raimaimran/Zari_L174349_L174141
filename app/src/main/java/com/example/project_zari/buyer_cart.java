package com.example.project_zari;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class buyer_cart extends AppCompatActivity {

    List<DemoItem2> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyer_cart);

        items = new ArrayList<>();

        items.add(new DemoItem2("Kapra 1", "125", "It is a cloth", R.drawable.shopitem1, 2));
        items.add(new DemoItem2("Kapra 2", "2345", "It is a cloth", R.drawable.shopitem2, 2));
        items.add(new DemoItem2("Kapra 3", "350", "It is a cloth", R.drawable.shopitem3, 3));
        items.add(new DemoItem2("Kapra 4", "400", "It is a cloth", R.drawable.shopitem4, 5));

        RecyclerView rv = (RecyclerView) findViewById(R.id.buyercartrecycleview);

        rv.setLayoutManager(new GridLayoutManager(this , 1));
        rv.setAdapter(new bCartAdapter(items, this));


        NumberPicker np = findViewById(R.id.numpicker);

        Button btn = findViewById(R.id.placeorder);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), order_placed.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
