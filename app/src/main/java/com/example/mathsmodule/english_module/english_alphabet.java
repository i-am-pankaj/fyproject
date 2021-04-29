package com.example.mathsmodule.english_module;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.mathsmodule.R;

public class english_alphabet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_alphabet);
        ViewPager viewPager = findViewById(R.id.hviewpager);
        ImageAdapterSlide adapter= new ImageAdapterSlide(this);
        viewPager.setAdapter(adapter);
    }
}