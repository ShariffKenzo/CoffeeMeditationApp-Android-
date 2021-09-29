package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class MeditationHealing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditation_healing);

        final MediaPlayer meditation1 = MediaPlayer.create(this,R.raw.meditation1);

        meditation1.start();

    }
}