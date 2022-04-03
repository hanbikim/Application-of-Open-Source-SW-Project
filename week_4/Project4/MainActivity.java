package com.cookandroid.project4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btnUp, btnDown;
    ImageView imgUp, imgDown;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnUp=(Button) findViewById(R.id.btnUp);
        btnDown=(Button) findViewById(R.id.btnDown);
        imgUp=(ImageView) findViewById(R.id.imgUp);
        imgDown=(ImageView) findViewById(R.id.imgDown);

        btnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgUp.setImageResource(R.drawable.link);
                imgDown.setImageResource(0);
            }
        });

        btnDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgUp.setImageResource(0);
                imgDown.setImageResource(R.drawable.link);
            }
        });
    }
}