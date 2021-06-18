package com.example.whiskyhunterapi;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class modelos_objeto {

    public List<modelo> getModeloslist() {
        return modeloslist;
    }

    public void setModeloslist(List<modelo> modeloslist) {
        this.modeloslist = modeloslist;
    }

    @SerializedName("modelos")
    List<modelo>modeloslist;
}
