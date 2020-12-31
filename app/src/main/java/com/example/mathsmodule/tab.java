package com.example.mathsmodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class tab extends AppCompatActivity {

    private EditText etInteger;
    private EditText etRange;
    private Button btnShow;
    private TextView textView;

    private int integer;
    private int range;

    private String myChar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        etInteger = findViewById(R.id.integer);
        etRange = findViewById(R.id.range);
        textView = findViewById(R.id.txt);
        btnShow = findViewById(R.id.btn_show);

        btnShow.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        textView.setText("");

                        showResult();
                    }
                });
    }

    private void getData() {

        String sinteger = etInteger.getText().toString().trim();

        String srange = etRange.getText().toString().trim();

        // Check for input

        if (sinteger.isEmpty()) {
            etInteger.setError("Required");
        } else if (srange.isEmpty()) {
            etRange.setError("Required");
        } else {

            // Convert to int

            try {
                integer = Integer.parseInt(sinteger);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                etInteger.setError("Not an Integer");
            }

            try {
                range = Integer.parseInt(srange);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                etRange.setError("Not an Integer");
            }
        }
    }

    private void showResult() {

        getData();

        for (int i = 1; i <= range; i++) {

            myChar = integer + " x " + i + " = " + (integer * i) + "\n";

            textView.append(myChar);
        }
    }

    @Override
    protected void onPause() {

        super.onPause();
    }
}