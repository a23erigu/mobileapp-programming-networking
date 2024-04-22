package com.example.networking;

public class Mountain {

    private String name;
    private String Place;
    private int Hight;

    public Mountain(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlace(String Place) {
        this.Place = Place;
    }

    public void setHight(int Hight) {
        this.Hight = Hight;
    }

    public String getName() {
        return name;
    }

    public String getPlace() {
        return Place;
    }

    public int getHight() {
        return Hight;
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "Name='" + name + '\'' +
                ", Place='" + Place + '\'' +
                ", Hight=" + Hight +
                '}';
    }
}
