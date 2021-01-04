package com.example.mathsmodule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class maths extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths);

        Button btn = findViewById(R.id.button5);
        Button tbtn = findViewById(R.id.button7);
        Button cbtn = findViewById(R.id.button8);
        Button kdzbtn = findViewById(R.id.button9);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(maths.this,mathop.class);
                startActivity(i);
            }
        });

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t = new Intent(maths.this,tab.class);
                startActivity(t);
            }
        });

        cbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(maths.this,counts.class);
                startActivity(c);
            }
        });

        kdzbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kdz = new Intent(maths.this,imop.class);
                startActivity(kdz);
            }
        });
    }
}