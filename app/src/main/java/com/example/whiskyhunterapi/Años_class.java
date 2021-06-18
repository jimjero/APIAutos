package com.example.whiskyhunterapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Años_class extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView list;
    List<años> names1 = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whisky_distillerries_info);


        list = findViewById(R.id.list_Distilleries);
        list.setOnItemClickListener(this);

        Call<List<años>> call = RetrofitAños.getInstance().getMyApi().getaños();
        call.enqueue(new Callback<List<años>>() {
            @Override
            public void onResponse(Call<List<años>> call, Response<List<años>> response) {
                ArrayList<String> Postname= new ArrayList<>();
                names1 = response.body();
                for (años post : names1){
                    Postname.add(post.getNameaños());
                }
                ArrayAdapter arrayAdapter = new ArrayAdapter(Años_class.this, android.R.layout.simple_list_item_1, Postname);
                list.setAdapter(arrayAdapter);

                arrayAdapter.notifyDataSetChanged();

            }


            @Override
            public void onFailure(Call<List<años>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Ocurrio un error", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent in = new Intent(this, anos_detalles.class);
        in.putExtra("codigo", names1.get(position).getCodigo());
        startActivity(in);
    }

}