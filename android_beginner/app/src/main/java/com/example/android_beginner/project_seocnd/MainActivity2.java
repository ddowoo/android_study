package com.example.android_beginner.project_seocnd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android_beginner.MainActivity;
import com.example.android_beginner.R;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView centerImage = findViewById(R.id.center);

        // 클릭 이벤트 설정
        centerImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, DetailImageView.class);
                intent.putExtra("key", "가운데 넘긴");
                startActivity(intent);
            }
        });


    }
}