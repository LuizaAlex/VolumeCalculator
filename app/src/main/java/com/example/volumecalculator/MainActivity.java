package com.example.volumecalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    GridView gridView;
    ArrayList<Shape> shapeArrayList;

    //Adapter
    MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

       gridView = findViewById(R.id.gridView);
       shapeArrayList = new ArrayList<>();

       Shape s1 = new Shape(R.drawable.sphere3,"Sphere");
       Shape s2 = new Shape(R.drawable.cylinder,"Cylinder");
       Shape s3 = new Shape(R.drawable.cube,"Cube");
       Shape s4 = new Shape(R.drawable.prism, "Prism");

       shapeArrayList.add(s1);
       shapeArrayList.add(s2);
       shapeArrayList.add(s3);
       shapeArrayList.add(s4);

       adapter = new MyCustomAdapter(shapeArrayList, getApplicationContext());
       gridView.setAdapter(adapter);
       gridView.setNumColumns(2);

       gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

           public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
               Intent intent;
               switch (position) {
                   case 0:
                       intent = new Intent(getApplicationContext(), Sphere.class);
                       break;
                   case 1:
                       intent = new Intent(getApplicationContext(), Cilinder.class);
                       break;
                   case 2:
                       intent = new Intent(getApplicationContext(), Cube.class);
                       break;
                   case 3:
                       intent = new Intent(getApplicationContext(), Prism.class);
                       break;
                   default:
                       return; // or throw an exception
               }
               startActivity(intent);
           }
       });
  }



}

