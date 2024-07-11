package com.example.android_beginner;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;


public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // this를 Activity.this로 변경
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                // 지연 후 실행할 코드
            }
        }, 1000); // 1초(1000 밀리초) 지연//


    }
}