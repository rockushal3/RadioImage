package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    RadioGroup os;
//    RadioButton ios,linux,wiindows,android;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        os = findViewById(R.id.radio5);

        os.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i == R.id.radio1 )
                {
                    Toast.makeText(Main2Activity.this, "Android", Toast.LENGTH_SHORT).show();
                }

                else if(i == R.id.radio2 )
                {
                    Toast.makeText(Main2Activity.this, "Linux", Toast.LENGTH_SHORT).show();
                }
                else if(i == R.id.radio3 )
                {
                    Toast.makeText(Main2Activity.this, "Windows", Toast.LENGTH_SHORT).show();
                }
                else if(i == R.id.radio4 )
                {
                    Toast.makeText(Main2Activity.this, "IOS", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
