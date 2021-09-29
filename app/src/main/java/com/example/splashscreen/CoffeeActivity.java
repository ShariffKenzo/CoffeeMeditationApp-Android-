package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CoffeeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee);


        // declare vars;

        CardView smoothjazz;

        smoothjazz = (CardView) findViewById(R.id.smoothjazz);


        smoothjazz.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick(View view){

            Intent Coffeeintent = new Intent(CoffeeActivity.this, SmoothJazzActivity.class);
            startActivity(Coffeeintent);

        }
    });

        CardView postivejazz;

        postivejazz = (CardView) findViewById(R.id.postivejazz);


        postivejazz.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                Intent Coffeeintent2 = new Intent(CoffeeActivity.this, PositiveJazzActivity.class);
                startActivity(Coffeeintent2);

            }
        });


    }
}