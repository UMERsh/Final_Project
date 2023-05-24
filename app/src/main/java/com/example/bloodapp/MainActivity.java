package com.example.bloodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.bloodapp.Models.FoodModel;
import com.example.bloodapp.MyAdapter.FoodAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.reView);

        ArrayList<FoodModel> arrayList = new ArrayList<>();
        arrayList.add(new FoodModel(R.drawable.order1));
        arrayList.add(new FoodModel(R.drawable.order2));
        arrayList.add(new FoodModel(R.drawable.berger1));
        arrayList.add(new FoodModel(R.drawable.berger2));

        FoodAdapter adapter = new FoodAdapter(arrayList, this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


    }

    public void clickB(View view){
        Intent i = new Intent(MainActivity.this, FoodDescription.class);
        startActivity(i);

    }
}