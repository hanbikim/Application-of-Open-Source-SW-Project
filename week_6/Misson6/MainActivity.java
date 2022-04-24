package com.cookandroid.misson6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    SeekBar skBar;
    ProgressBar prgBar;
    EditText edtVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        skBar = findViewById(R.id.seekBar);
        prgBar = findViewById(R.id.prgBar);
        edtVal = findViewById(R.id.edtVal);

        skBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                prgBar.setProgress(i);
//                edtVal.setTextSize((i + 10) / 5);
                edtVal.setText(i + "");

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}