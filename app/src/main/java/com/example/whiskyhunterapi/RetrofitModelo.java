package com.example.whiskyhunterapi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitModelo {

    private static RetrofitModelo instance = null;
    private PostService myApi;

    private RetrofitModelo(){
        Retrofit retrofit = new Retrofit.Builder().baseUrl(PostService.BASE_URL_Modelo).addConverterFactory(GsonConverterFactory.create()).build();
        myApi = retrofit.create(PostService.class);
    }

    public static synchronized RetrofitModelo getInstance(){

        if (instance == null){
            instance = new RetrofitModelo();
        }
        return instance;
    }

    public PostService getMyApi(){
        return myApi;
    }
}

