package com.example.project_zari;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
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

        final Cart cart = Cart.getInstance();


        RecyclerView rv = (RecyclerView) findViewById(R.id.buyercartrecycleview);

        rv.setLayoutManager(new GridLayoutManager(this , 1));
        rv.setAdapter(new bCartAdapter(cart.getItems(), this));


        Button btn = findViewById(R.id.placeorder);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                NotificationManager notificationManager = (NotificationManager) getApplication().getSystemService(Context.NOTIFICATION_SERVICE);

                int notificationId = 1;
                String channelId = "channel-01";
                String channelName = "Channel Name";
                int importance = NotificationManager.IMPORTANCE_HIGH;

                cart.emptyCart();

                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {


                    NotificationChannel mChannel = new NotificationChannel(
                            channelId, channelName, importance);
                    notificationManager.createNotificationChannel(mChannel);
                }

                NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext())
                        .setSmallIcon(R.mipmap.ic_launcher_round)
                        .setContentTitle("Order is Arriving")
                        .setContentText("Get Excited! Your Order is on its way..");

                // Creates the intent needed to show the notification
                Intent notificationIntent = new Intent(getApplicationContext(), buyer_cart.class);
                PendingIntent contentIntent = PendingIntent.getActivity(getApplicationContext(), 0, notificationIntent, PendingIntent.FLAG_UPDATE_CURRENT);
                builder.setContentIntent(contentIntent);

                // Add as notification
                NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                manager.notify(0, builder.build());

                Intent intent = new Intent(v.getContext(), order_placed.class);
                startActivity(intent);
                finish();
            }
        });


    }


}
