package com.example.mathsmodule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button abtn = findViewById(R.id.button);
        abtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this,addActivity.class);
                startActivity(a);
            }
        });

        Button sbtn = findViewById(R.id.button2);
        sbtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent s = new Intent(MainActivity.this,subActivity.class);
                startActivity(s);
            }
        });

        Button mbtn = findViewById(R.id.button3);
        mbtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent m = new Intent(MainActivity.this,mulActivity.class);
                startActivity(m);
            }
        });

        Button dbtn = findViewById(R.id.button4);
        dbtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent d = new Intent(MainActivity.this,divActivity.class);
                startActivity(d);
            }
        });
    }
}