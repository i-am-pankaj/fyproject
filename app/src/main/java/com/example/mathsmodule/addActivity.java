package com.example.mathsmodule;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class addActivity extends AppCompatActivity {

    int n1,n2;

    public void sum(View view){

        EditText editText = (EditText) findViewById(R.id.aeditTextTextPersonName2);
        int guess = Integer.parseInt(editText.getText().toString());
        String msg;
        if(guess == (n1+n2)){
            msg="Hurray! Correct Answer!";
            Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
            fun();
        }
        else {
            msg = "Wrong Answer!!!!";
            Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        fun();
    }

    public void fun(){
        Random rand1 = new Random();
        Random rand2 = new Random();
        n1 = rand1.nextInt(50)+1;
        n2 = rand2.nextInt(50)+1;

        TextView textview1 = findViewById(R.id.atextView);
        textview1.setText(Integer.toString(n1));
        TextView textview2 = findViewById(R.id.atextView2);
        textview2.setText(Integer.toString(n2));
    }
}