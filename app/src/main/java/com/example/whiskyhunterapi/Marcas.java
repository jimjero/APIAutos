package com.example.whiskyhunterapi;

import androidx.appcompat.app.AppCompatActivity;

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

public class Marcas extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView list;
    List<Post> names = new ArrayList<>();
   //Post names;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whisky_auctions_info);




        list = findViewById(R.id.list_auctions);
        list.setOnItemClickListener(this);

        Call<List<Post>> call = RetrofitApi.getInstance().getMyApi().getmarcas();
        call.enqueue(new Callback<List<Post>>() {

            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
               // for (Post post : response.body())

                ArrayList<String> Postname= new ArrayList<>();
                names = response.body();
                for (Post post : names){
                    Postname.add(post.getNamemarcas());
                }
                ArrayAdapter arrayAdapter = new ArrayAdapter(Marcas.this, android.R.layout.simple_list_item_1, Postname);
                list.setAdapter(arrayAdapter);

                arrayAdapter.notifyDataSetChanged();
            }


            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Ocurrio un error", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

}