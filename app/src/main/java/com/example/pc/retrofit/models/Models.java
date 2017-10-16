package com.example.pc.retrofit.models;

import java.util.List;

/**
 * Created by PC on 16-Oct-17.
 */

public class Models {
    public Coord coord;

    public List<Weather> weather = null;

    private String base;

    public Main main;

    private int visibility;

    public Wind wind;

    public Clouds clouds;

    private int dt;

    public Sys sys;

    private int id;

    private String name;

    private int cod;


    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}
