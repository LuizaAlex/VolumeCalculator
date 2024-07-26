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

public class Cilinder extends AppCompatActivity {

    EditText cylinder_radius, cylinder_height;
    TextView title, result;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_cilinder);

        cylinder_radius= findViewById(R.id.editText_Cylinder1);
        cylinder_height= findViewById(R.id.editText_Cylinder2);

        title = findViewById(R.id.textView4);
        result = findViewById(R.id.textView5);
        btn = findViewById(R.id.btn2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String radius = cylinder_radius.getText().toString();
                String height = cylinder_height.getText().toString();
                int r = Integer.parseInt(radius);
                int h = Integer.parseInt(height);

                double volume = 3.14159 * r*r*h;
                result.setText("V = "+ volume + "m^3");
            }
        });
    }
}