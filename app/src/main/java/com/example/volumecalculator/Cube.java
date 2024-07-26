package com.example.volumecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Cube extends AppCompatActivity {


    EditText cube_length;
    TextView title, result;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);


        cube_length= findViewById(R.id.editText_Cube);
        title = findViewById(R.id.textView6);
        result = findViewById(R.id.textView7);
        btn = findViewById(R.id.btn3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String length = cube_length.getText().toString();

                int l = Integer.parseInt(length);


                double volume = l*l*l;
                result.setText("V = "+ volume + "m^3");
            }
        });
    }
}