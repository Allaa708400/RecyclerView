package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView rv;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.rv_main);
        ArrayList<Cat> cats = new ArrayList<>();

        for (int i=1;i<=100;i++) {
            cats.add(new Cat(R.drawable.cat1, "Cat : i : "+ i));
            cats.add(new Cat(R.drawable.cat2, "Cat : i : " + ++i));
            cats.add(new Cat(R.drawable.cat3, "Cat : i : " + ++i));

        }

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(cats);
        //RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        RecyclerView.LayoutManager lm = new GridLayoutManager(this,5);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(lm);
        rv.setAdapter(adapter);
    }
}