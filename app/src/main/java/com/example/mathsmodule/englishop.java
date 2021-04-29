package com.example.mathsmodule;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mathsmodule.english_module.english_alphabet;
import com.example.mathsmodule.english_module.english_alphabetimg;
import com.example.mathsmodule.english_module.englishmusic;

public class englishop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.englishactivity_englishop);

        Button btn = findViewById(R.id.alphabutton7);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent enga = new Intent(englishop.this, english_alphabet.class);
                startActivity(enga);
            }
        });

        Button btn1 = findViewById(R.id.alphabutton5);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent engb = new Intent(englishop.this, english_alphabetimg.class);
                startActivity(engb);
            }
        });
        Button btn2 = findViewById(R.id.alphabutton8);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent engc = new Intent(englishop.this, englishmusic.class);
                startActivity(engc);
            }
        });
    }
}