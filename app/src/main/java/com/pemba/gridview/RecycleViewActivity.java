package com.pemba.gridview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        // Retrieve the data passed from MainActivity
        ArrayList<String> dataList = getIntent().getStringArrayListExtra("dataList");

        // Find the RecyclerView in the layout
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        // Create an adapter and set it to the RecyclerView
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(dataList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}