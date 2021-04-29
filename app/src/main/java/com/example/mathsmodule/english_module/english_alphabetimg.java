package com.example.mathsmodule.english_module;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mathsmodule.R;

public class english_alphabetimg extends AppCompatActivity {


    RecyclerView recyclerView;
    RecyclerView.Adapter programAdapter;
    RecyclerView.LayoutManager layoutmanager;
    String[] alpList={"A a","B b","C c","D d","E e","F f","G g","H h","I i","J j",
            "K k","L l","M m","N n","O o","P p","Q q","R r","S s","T t","U u","V v",
            "W w","X x","Y y","Z z"};
    String[] alpTap={"Apple", "Ball", "Cat", "Dog", "Elephant", "Fish",
            "Grapes", "House", "Ink", "Jug", "Kite", "Lion", "Man", "Nest",
            "Owl", "Plant", "Quilt", "Rat", "Sun", "Tree", "Umbrella", "Van",
            "Watch", "X-ray", "Yak", "Zebra"};
    int[] alpImg= new int[]{R.drawable.a1, R.drawable.b1, R.drawable.c1, R.drawable.d1,
            R.drawable.e1, R.drawable.f1, R.drawable.g1, R.drawable.h1, R.drawable.i1,
            R.drawable.j1, R.drawable.k1, R.drawable.l1, R.drawable.m1, R.drawable.n1,
            R.drawable.o1, R.drawable.p1, R.drawable.q1, R.drawable.r1, R.drawable.s1,
            R.drawable.t1, R.drawable.u1, R.drawable.v1, R.drawable.w1, R.drawable.x1,
            R.drawable.y1, R.drawable.z1};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_alphabetimg);
        recyclerView= findViewById(R.id.Hrb);
        recyclerView.setHasFixedSize(true);
        layoutmanager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutmanager);
        programAdapter= new HProgAdapter(this,alpList,alpTap,alpImg);
        recyclerView.setAdapter(programAdapter);
    }
}