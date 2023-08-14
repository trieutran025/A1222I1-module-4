package com.example.model;

public class Contact {
    private String town;
    private String county;
    private String ward;

    private String address;
    private String phone;
    private String email;

    public Contact(String town, String county, String ward, String address, String phone, String email) {
        this.town = town;
        this.county = county;
        this.ward = ward;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public Contact() {
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
