package com.example.whiskyhunterapi;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Post {

    @SerializedName("nome")
    private String namemarcas;

    public String getNamemarcas() {
        return namemarcas;
    }

    public void setNamemarcas(String namemarcas) {
        this.namemarcas = namemarcas;
    }
}
