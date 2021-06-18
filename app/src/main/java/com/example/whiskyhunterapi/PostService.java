package com.example.whiskyhunterapi;



import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface PostService {



    String BASE_URL = "https://parallelum.com.br/fipe/api/v1/carros/";
    @GET("marcas")
    Call<List<Post>> getmarcas();

    String BASE_URL_años= "https://parallelum.com.br/fipe/api/v1/carros/marcas/59/modelos/5940/";
    @GET("anos")
    Call<List<años>> getaños();

    String BASE_URL_Modelo= "https://parallelum.com.br/fipe/api/v1/carros/marcas/59/";
    @GET("modelos")
    Call<modelos_objeto> getmodelo();


    @GET("anos/{codigo}")
    Call<años> getCodigo(@Path("codigo") String codigo);


}
