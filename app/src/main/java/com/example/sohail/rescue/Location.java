package com.example.sohail.rescue;

public class Location {

    String namE;
    double latitude,longitude;

    public Location() {
    }

    public Location(String namE, double latitude, double longitude) {
        this.namE = namE;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getNamE() {
        return namE;
    }

    public void setNamE(String namE) {
        this.namE = namE;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
