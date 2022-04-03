package com.cookandroid.project4_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text1, text2;
    Switch swAgree;
    RadioGroup rGroup1;
    RadioButton rdoO, rdoR, rdoS;
    Button btnEnd, btnReset;
    ImageView imgAndroid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진 보기");

        text1 = (TextView) findViewById(R.id.Text1);
        swAgree = (Switch) findViewById(R.id.SwAgree);

        text2 = (TextView) findViewById(R.id.Text2);
        rGroup1 = (RadioGroup) findViewById(R.id.Rgroup1);
        rdoO = (RadioButton) findViewById(R.id.RdoO);
        rdoR = (RadioButton) findViewById(R.id.RdoR);
        rdoS= (RadioButton) findViewById(R.id.RdoS);

        btnEnd = (Button) findViewById(R.id.BtnEnd);
        btnReset = (Button) findViewById(R.id.BtnReset);
        imgAndroid=(ImageView) findViewById(R.id.ImgAndroid);

        swAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton ButtonView, boolean isChecked) {
                if(swAgree.isChecked() ==true){
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    btnEnd.setVisibility(View.VISIBLE);
                    btnReset.setVisibility(View.VISIBLE);
                    imgAndroid.setVisibility(View.VISIBLE);
                }else{
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    btnEnd.setVisibility(View.INVISIBLE);
                    btnReset.setVisibility(View.INVISIBLE);
                    imgAndroid.setVisibility(View.INVISIBLE);
                }
            }
        });

        rGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup rGroup, int i) {
                if (i == R.id.RdoO) {
                    imgAndroid.setImageResource(R.drawable.and10);
                } else if (i == R.id.RdoR) {
                    imgAndroid.setImageResource(R.drawable.and11);
                } else {
                    imgAndroid.setImageResource(R.drawable.and12);
                }
            }
        });

        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                swAgree.setChecked(false);
            }
        });
    }
}