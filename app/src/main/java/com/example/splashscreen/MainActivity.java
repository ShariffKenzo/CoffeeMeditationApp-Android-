package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN = 1300;
    //variables

    Animation topAnim,bottomAnim;
    ImageView image;
    TextView text;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        image =findViewById(R.id.coffecup);
        text = findViewById(R.id.coffeetext);

        image.setAnimation(topAnim);

        text.setAnimation(bottomAnim);

        Handler handler =new Handler();


            handler.postDelayed(new Runnable() {

            @Override
            public void run() {

             Intent intent = new Intent(MainActivity.this,Dashboard.class);

                //starts intent activity
                startActivity(intent);
           //ends splash screen : prevents user from going back
               finish();

            }
        },SPLASH_SCREEN);


    }
}