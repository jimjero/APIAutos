package com.example.whiskyhunterapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Modelos_main extends AppCompatActivity  {

    ListView listPlayers;
    modelos_objeto mydata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modelos_main);
        listPlayers = findViewById(R.id.listPlayers);
        getFromInternetCivilizations();

    }

    private void getFromInternetCivilizations() {

        Call<modelos_objeto> call = RetrofitModelo.getInstance().getMyApi().getmodelo();
        call.enqueue(new Callback<modelos_objeto>() {
            @Override
            public void onResponse(Call<modelos_objeto> call, Response<modelos_objeto> response) {

                mydata = response.body();
                String Message = "";


                ModelosAdapter adapter = new ModelosAdapter(Modelos_main.this, mydata.getModeloslist());
                listPlayers.setAdapter(adapter);


                for (int i = 0; i < mydata.getModeloslist().size(); i++) {

                    Message = Message + mydata.getModeloslist().get(i).getNamemodelos() + " : ";
                }


            }

            @Override
            public void onFailure(Call<modelos_objeto> call, Throwable t) {

                Toast.makeText(getApplicationContext(), "Ocurrio un error", Toast.LENGTH_SHORT).show();
            }
        });

    }
}