package com.pemba.gridview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {

    private EditText nameField, ageField, occupationField, addressField;
    private ArrayList<String> dataList = new ArrayList<>();
    private Button addButton, listViewButton, gridViewButton, recyclerViewButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        nameField = findViewById(R.id.nameField);
        ageField = findViewById(R.id.ageField);
        occupationField = findViewById(R.id.occupationField);
        addressField = findViewById(R.id.addressField);

        addButton = findViewById(R.id.addButton);
        listViewButton = findViewById(R.id.listViewButton);
        gridViewButton = findViewById(R.id.gridViewButton);
        recyclerViewButton = findViewById(R.id.recyclerViewButton);

        addButton.setOnClickListener(v -> {
            String name = nameField.getText().toString();
            String age = ageField.getText().toString();
            String occupation = occupationField.getText().toString();
            String address = addressField.getText().toString();
            dataList.add(name + ", " + age + ", " + occupation + ", " + address);
        });

        listViewButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
            intent.putStringArrayListExtra("dataList", dataList);
            startActivity(intent);
        });

        gridViewButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, GridViewActivity.class);
            intent.putStringArrayListExtra("dataList", dataList);
            startActivity(intent);
        });

        recyclerViewButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
            intent.putStringArrayListExtra("dataList", dataList);
            startActivity(intent);
        });

    }
}