package com.elitcoder.advice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.elitcoder.advice.databinding.ActivitySplashBinding;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySplashBinding activitySplashBinding;
        activitySplashBinding = ActivitySplashBinding.inflate(getLayoutInflater());
        View view = activitySplashBinding.getRoot();
        setContentView(view);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent main = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(main);
            }
        },3000);

        Animation scale = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.iconscale);
        activitySplashBinding.tipImg.startAnimation(scale);
    }
}