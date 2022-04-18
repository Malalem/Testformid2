package com.example.testformid2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Animation extends AppCompatActivity {
    AnimationDrawable lightsAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        ImageView imgFrame = (ImageView) findViewById(R.id.imageView);
        imgFrame.setBackgroundResource(R.drawable.animation);
        lightsAnimation = (AnimationDrawable) imgFrame.getBackground();
        Button start=(Button)findViewById(R.id.btnStart);
        Button stop=(Button)findViewById(R.id.btnStop);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lightsAnimation.start();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lightsAnimation.stop();
                startActivity(new Intent(Animation.this,Tween.class));
            }
        });
    }
}