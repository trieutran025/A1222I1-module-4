package com.example.model;

public class Information {

    private String fullName;
    private String birthYear;
    private String gender;
    private String nationality;
    private String idCard;
    private Travel travel;
    private Dates starDay;
    private Dates endDay;
    private String destination;

    public Information( String fullName, String birthYear, String gender,
                       String nationality, String idCard, Travel travel, Dates starDay, Dates endDay, String destination) {

        this.fullName = fullName;
        this.birthYear = birthYear;
        this.gender = gender;
        this.nationality = nationality;
        this.idCard = idCard;
        this.travel = travel;
        this.starDay = starDay;
        this.endDay = endDay;
        this.destination = destination;
    }

    public Information() {
    }



    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Travel getTravel() {
        return travel;
    }

    public void setTravel(Travel travel) {
        this.travel = travel;
    }

    public Dates getStarDay() {
        return starDay;
    }

    public void setStarDay(Dates starDay) {
        this.starDay = starDay;
    }

    public Dates getEndDay() {
        return endDay;
    }

    public void setEndDay(Dates endDay) {
        this.endDay = endDay;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
