package org.example.LLDExampleProblems.CarRentalSystem;

public class Location {
    String address;
    int pincode;
    String city;
    String state;

    Location(int pincode, String city, String state, String country) {
        this.pincode = pincode;
        this.city = city;
        this.state = state;
        this.country = country;

    }


    public Location(String address, int pincode, String city, String state, String country) {
        this.address = address;
        this.pincode = pincode;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    String country;

}
