package com.example.whiskyhunterapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controladormarcas();
        controladoraños();
        controladorvalor();
    }


    public void controladormarcas() {

        ImageView entry = (ImageView) findViewById(R.id.pasar);


        entry.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ListSong = new Intent(getApplicationContext(), Marcas.class);
                startActivity(ListSong);
            }
        });

    }
    public void controladoraños() {

        ImageView entry = (ImageView) findViewById(R.id.años);


        entry.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ListSong = new Intent(getApplicationContext(), Años_class.class);
                startActivity(ListSong);
            }
        });

    }

    public void controladorvalor() {

        ImageView entry = (ImageView) findViewById(R.id.modelos);


        entry.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ListSong = new Intent(getApplicationContext(), Modelos_main.class);
                startActivity(ListSong);
            }
        });

    }
}