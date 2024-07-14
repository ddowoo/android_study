package com.example.android_beginner.project_seocnd;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.android_beginner.R;

public class DetailImageView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail_image_view);

        Intent intent = getIntent();
        String message = intent.getStringExtra("key");

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}