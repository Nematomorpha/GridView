package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class ExampleGridView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_grid_view);

        GridView gridView = findViewById(R.id.grid_view);
       gridView.setAdapter(new ImageAdapter(this));

       gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Intent intent = new Intent(ExampleGridView.this, SecondActivity.class);
               intent.putExtra("id", position);
               startActivity(intent);

           }
       });
    }
}