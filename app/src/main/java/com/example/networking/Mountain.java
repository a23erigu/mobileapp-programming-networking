package com.example.networking;

public class Mountain {

    private String Name;
    private String Place;
    private int Hight;

    public Mountain(String Name){
        this.Name = Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setPlace(String Place) {
        this.Place = Place;
    }

    public void setHight(int Hight) {
        this.Hight = Hight;
    }

    public String getName() {
        return Name;
    }

    public String getPlace() {
        return Place;
    }

    public int getHight() {
        return Hight;
    }
}
