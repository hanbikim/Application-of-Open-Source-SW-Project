package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { //자바의 main 함수와 비슷
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //화면에 보여줄 애들을 정의
    }
}