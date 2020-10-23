package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    MediaPlayer media;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela);
        ImageView iv = findViewById(R.id.imageView10);

        Glide.with(this).load("https://img.youtube.com/vi/E07s5ZYygMg/0.jpg").into(iv);

        media = MediaPlayer.create(getApplicationContext(), R.raw.watermelonsugar);
    }

    public void onResume(View view){
        media.start();
    }
}


