package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.recyclerviewdemo.helper.MyAdapter;

public class MainActivity extends AppCompatActivity {
   // private RecyclerView recyclerview_item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerview_item = findViewById(R.id.recyclerview_items);
        recyclerview_item.setLayoutManager(new GridLayoutManager(this,2));

        String[] cars_list = {
                getString(R.string.bmw),getString(R.string.mercedes),getString(R.string.audi),getString(R.string.skoda),
                getString(R.string.porche),getString(R.string.rangerover),getString(R.string.jaguar),
                getString(R.string.rollsroyce),getString(R.string.lembo),getString(R.string.rollsroyce),getString(R.string.lembo),
                getString(R.string.bmw),getString(R.string.mercedes),getString(R.string.audi),getString(R.string.skoda),
                getString(R.string.porche),getString(R.string.rangerover),getString(R.string.jaguar),getString(R.string.rollsroyce)};

        int img_array[]= {R.drawable.bmw,R.drawable.mercedes,R.drawable.skoda,R.drawable.bmw,
                          R.drawable.porsche,R.drawable.bmw,R.drawable.jaguar,
                          R.drawable.bmw,R.drawable.mercedes,R.drawable.skoda,R.drawable.porsche,
                          R.drawable.bmw,R.drawable.porsche,R.drawable.skoda,R.drawable.mercedes,
                          R.drawable.jaguar,R.drawable.bmw,R.drawable.mercedes,R.drawable.porsche};

        recyclerview_item.setAdapter(new MyAdapter(cars_list,img_array));

    }
}
