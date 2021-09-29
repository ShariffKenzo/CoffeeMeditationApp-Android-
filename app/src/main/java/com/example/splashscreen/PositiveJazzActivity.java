package com.example.splashscreen;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class PositiveJazzActivity extends AppCompatActivity {


   //public MediaPlayer positivejazz = MediaPlayer.create(this,R.raw.positivejazz);




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_positive_jazz);


        MediaPlayer positivejazz = MediaPlayer.create(this,R.raw.positivejazz);
        positivejazz.start();




        }





}