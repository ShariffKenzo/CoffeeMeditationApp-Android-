package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

public class SmoothJazzActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smooth_jazz);



       // Handler handler = new Handler();

        final MediaPlayer smoothjazz = MediaPlayer.create(this,R.raw.smoothjazz);

        smoothjazz.start();


    }
}