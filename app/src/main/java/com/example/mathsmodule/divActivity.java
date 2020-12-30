package com.example.mathsmodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class divActivity extends AppCompatActivity {

    int n1,n2;

    public void sum(View view){

        EditText editText = findViewById(R.id.deditTextTextPersonName2);
        int guess = Integer.parseInt(editText.getText().toString());
        String msg;
        if(guess == (n1/n2)){
            fun();
            msg="Hurray! Correct Answer!";
        }
        else{
            msg="Wrong Answer!!!!";
        }

        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_div);

        fun();
    }

    public void fun(){
        Random rand1 = new Random();
        Random rand2 = new Random();
        n1 = rand1.nextInt(15)+1;
        n1=n1*4;
        n2 = rand2.nextInt(2)+1;
        n2=n2*2;

        TextView textview1 = findViewById(R.id.dtextView);
        textview1.setText(Integer.toString(n1));
        TextView textview2 = findViewById(R.id.dtextView2);
        textview2.setText(Integer.toString(n2));
    }
}