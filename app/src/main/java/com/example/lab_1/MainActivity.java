package com.example.lab_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.tvMain = findViewById(R.id.tvMain);
    }

    public void btn1Click(View view) {
        this.tvMain.setText("A wild text appears!");
    }

    public void btn2Click(View view) {
        this.tvMain.setTextColor(Color.GREEN);
    }
}