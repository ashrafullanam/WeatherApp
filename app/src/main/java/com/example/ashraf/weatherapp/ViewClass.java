package com.example.ashraf.weatherapp;

/**
 * Created by ASHRAF on 9/6/2017.
 */

public class ViewClass {

    private String day_name;
    private String farenhide;
    private String celsius;

    public ViewClass(String day_name, String farenhide, String celsius) {
        this.day_name = day_name;
        this.farenhide = farenhide;
        this.celsius = celsius;
    }





    public String getDay_name() {
        return day_name;
    }

    public String getFarenhide() {
        return farenhide;
    }
    public String getCelsius() {
        return celsius;
    }
}
