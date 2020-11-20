package com.example.nutrishell;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.nutrishell.adapter.RecycleViewAdapter;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        RecyclerData[] recyclerData = new RecyclerData[]{
                new RecyclerData("Almonds",R.drawable.almond, "1"),
                new RecyclerData("Apples", R.drawable.apples, "2"),
                new RecyclerData("Bananas",R.drawable.bananas, "3"),
                new RecyclerData("Carrots",R.drawable.carrots, "4"),
                new RecyclerData("Dates",R.drawable.dates, "5"),
                new RecyclerData("Eggs",R.drawable.eggs, "6"),
                new RecyclerData("Kiwi",R.drawable.kiwi, "7"),
                new RecyclerData("Milk",R.drawable.milk, "8"),
                new RecyclerData("Mushrooms",R.drawable.mushrooms, "9"),
                new RecyclerData("Orange",R.drawable.orange, "10")

        };

        RecycleViewAdapter myAdapter = new RecycleViewAdapter(recyclerData,HomeActivity.this);
        recyclerView.setAdapter(myAdapter);

    }
}