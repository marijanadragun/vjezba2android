package com.example.vjezba6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private myAdapter adapter;
    private ArrayList<String> dataCollab;
    private ArrayList<String> dataStars;
    private ArrayList<String> dataImageUrls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recView);
        setData();
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new myAdapter(this,dataCollab,dataStars,dataImageUrls);
        recyclerView.setAdapter(adapter);
    }

    //mock data
    private void setData() {
        dataCollab = new ArrayList<>();
        dataStars = new ArrayList<>();
        dataImageUrls = new ArrayList<>();

        dataCollab.add("Marijana");
        dataStars.add("5");
        dataImageUrls.add("https://avatars0.githubusercontent.com/u/73607620?s=400&v=4");

        dataCollab.add("Gabriela");
        dataStars.add("5");
        dataImageUrls.add("https://avatars1.githubusercontent.com/u/61993273?s=60&v=4");


    }
}