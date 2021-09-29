package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MeditationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditation);




        CardView meditation;

        meditation = (CardView) findViewById(R.id.meditation1);


        meditation.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                Intent meditation = new Intent(MeditationActivity.this, MeditationHealing.class);
                startActivity(meditation);

            }
        });




    }




}