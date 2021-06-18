package com.example.whiskyhunterapi;

import com.google.gson.annotations.SerializedName;

public class modelo {

    public String getNamemodelos() {
        return namemodelos;
    }



    public void setNamemodelos(String namemodelos) {
        this.namemodelos = namemodelos;
    }

    @SerializedName("nome")
    private String namemodelos;

    public String getCodigomodelo() {
        return codigomodelo;
    }

    public void setCodigomodelo(String codigomodelo) {
        this.codigomodelo = codigomodelo;
    }

    @SerializedName("codigo")
    private String codigomodelo;
}
