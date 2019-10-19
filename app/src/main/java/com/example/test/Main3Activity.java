package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{

ImageView image1;
RadioButton imga1,imag2,imag3,imag4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        image1 = findViewById(R.id.image11);
        imga1 = findViewById(R.id.img1);
        imag2 = findViewById(R.id.img2);
        imag3 = findViewById(R.id.img3);
        imag4 = findViewById(R.id.img4);
        imag3.setOnClickListener(this);
        imag2.setOnClickListener(this);
        imga1.setOnClickListener(this);
        imag4.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.img1 :
                image1.setImageResource(R.drawable.tiger);
            break;
            case R.id.img2 :
                image1.setImageResource(R.drawable.bird);
                break;
            case R.id.img3 :
                image1.setImageResource(R.drawable.cat);
            break; 
            case R.id.img4 :
                image1.setImageResource(R.drawable.dog);
                break;
        }
    }
}
