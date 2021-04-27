package com.example.mathsmodule;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import com.example.mathsmodule.drawingtest.ui.activity.drawingmodule;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button6);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this,maths.class);
                startActivity(a);
            }
        });

        Button btn1 = findViewById(R.id.button8);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(MainActivity.this,
                        MemoryGame.class);
                startActivity(b);
            }
        });

        Button btn2 = findViewById(R.id.puneetbutton10);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(MainActivity.this,
                        drawingmodule.class);
                startActivity(c);
            }
        });

    }
}