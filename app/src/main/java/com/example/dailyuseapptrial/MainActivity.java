package com.example.dailyuseapptrial;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerViewList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewList = findViewById(R.id.view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewList.setLayoutManager(linearLayoutManager);

        ArrayList<ListDomain> news = new ArrayList<>();
        news.add(new ListDomain("Browsing Bruges in Belgium", "pic1"));
        news.add(new ListDomain("Covid-19 in the Airport", "pic2"));
        news.add(new ListDomain("US-China War", "pic3"));

        adapter = new NewsAdapter(news);
        recyclerViewList.setAdapter(adapter);

    }
}
