package com.example.whiskyhunterapi;

import com.google.gson.annotations.SerializedName;
import java.util.List;


public class años {

    @SerializedName("nome")
    private String nameaños;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @SerializedName("codigo")
    private String codigo;

    public String getNameaños() {
        return nameaños;
    }

    public void setNameaños(String nameaños) {
        this.nameaños = nameaños;
    }
}
