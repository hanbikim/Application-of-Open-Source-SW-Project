package com.example.two_seven;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    RadioGroup radioGroup;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EditText editText;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.EditText);
        button1 = (Button) findViewById(R.id.button1);
        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        imageView = (ImageView)findViewById(R.id.imageView);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                Toast.makeText(getApplicationContext(), str,
                        Toast.LENGTH_SHORT).show();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(str));
                startActivity(urlIntent);
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i==R.id.radioButton1){
                    imageView.setImageResource(R.drawable.eleven);
                }else{
                    imageView.setImageResource(R.drawable.twelve);
                }
            }
        });
    }
}