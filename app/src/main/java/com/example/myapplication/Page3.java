package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Page3 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page3);

        TextView tv = findViewById(R.id.textView3);
        TextView tv2 = findViewById(R.id.textView4);

        tv.setText(getIntent().getStringExtra("id").toString());
        tv2.setText(getIntent().getStringExtra("pw").toString());
    }
}
