package com.example.whiskyhunterapi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitAños {
    private static RetrofitAños instance = null;
    private PostService myApi1;

    private RetrofitAños(){
        Retrofit retrofit = new Retrofit.Builder().baseUrl(PostService.BASE_URL_años).addConverterFactory(GsonConverterFactory.create()).build();
        myApi1 = retrofit.create(PostService.class);
    }

    public static synchronized RetrofitAños getInstance(){
        if (instance ==null) {
            instance = new RetrofitAños();
        }

        return instance;
    }
    public PostService getMyApi(){

        return myApi1;
    }
}
