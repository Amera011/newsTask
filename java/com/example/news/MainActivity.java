package com.example.news;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity implements Runnable {
    Handler h;
    Runnable r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         h = new Handler();
         r = new Runnable() {
             @Override
             public void run() {
                 Intent i = new Intent(MainActivity.this,bookActivity.class);
                 startActivity(i);
             }
         };


    }
    @Override
    protected void onStart() {
        h.postDelayed(r,3000);

        super.onStart();
    }

    @Override
    public void run() {


    }


}
