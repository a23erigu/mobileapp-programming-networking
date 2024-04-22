package com.example.networking;

import com.google.gson.annotations.SerializedName;

public class Mountain {

    private String name;
    @SerializedName("location")
    private String place;
    @SerializedName("size")
    private int hight;

    public Mountain(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }

    public int getHight() {
        return hight;
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "Name='" + name + '\'' +
                ", Place='" + place + '\'' +
                ", Hight=" + hight +
                '}';
    }
}
