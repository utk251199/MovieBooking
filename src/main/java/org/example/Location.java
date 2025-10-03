package org.example;

public class Location {

    private String address;
    private int pinCode;
    private String city;

    Location(String address, int pinCode, String city){
        this.address = address;
        this.pinCode = pinCode;
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public int getPinCode() {
        return pinCode;
    }

    public String getCity() {
        return city;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
