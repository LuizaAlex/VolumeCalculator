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

public class Prism extends AppCompatActivity {

    EditText prism_heigth, prism_length, prism_base;
    TextView title, result;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prism);

        prism_length= findViewById(R.id.editText_Prism1);
        prism_heigth= findViewById(R.id.editText_Prism2);
        prism_base = findViewById(R.id.editText_Prism3);

        title = findViewById(R.id.textView8);
        result = findViewById(R.id.textView9);
        btn = findViewById(R.id.btn4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String length = prism_length.getText().toString();
                String height = prism_heigth.getText().toString();
                String base = prism_base.getText().toString();
                int l = Integer.parseInt(length);
                int h = Integer.parseInt(height);
                int b = Integer.parseInt(base);

                double volume = l*b*h;
                result.setText("V = "+ volume + "m^3");
            }
        });
    }
}