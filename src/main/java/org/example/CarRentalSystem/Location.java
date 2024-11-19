package org.example.CarRentalSystem;

public class Location {
    private String address;
    private String city;
    private String state;
    private String pincode;
    public Location(String address, String city, String state, String pincode) {
        this.address = address;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }
    public String getAddress() {
        return address;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public String getPincode() {
        return pincode;
    }

}
