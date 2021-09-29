package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;

public class Dashboard extends AppCompatActivity {

    //variables image button

    ImageButton meditation;
    ImageButton cafemusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        cafemusic = (ImageButton) findViewById(R.id.cafemusic);

        cafemusic.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                Intent Coffeeintent = new Intent(Dashboard.this, CoffeeActivity.class);
                startActivity(Coffeeintent);

            }
           });
            /////////meditation button laeds to new activity

        meditation =(ImageButton) findViewById(R.id.meditation);

        meditation.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                Intent MeditationIntent = new Intent(Dashboard.this, MeditationActivity.class);
                startActivity(MeditationIntent);

            }
        });




        }


}