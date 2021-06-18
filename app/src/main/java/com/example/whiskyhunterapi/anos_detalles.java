package com.example.whiskyhunterapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class anos_detalles extends AppCompatActivity {
    TextView mostrar;
    String detalles;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anos_detalles);
        mostrar = findViewById(R.id.mostrar);
        Bundle in = getIntent().getExtras();
        detalles = in.getString("codigo");
        mostrar.setText(detalles);
    }
}