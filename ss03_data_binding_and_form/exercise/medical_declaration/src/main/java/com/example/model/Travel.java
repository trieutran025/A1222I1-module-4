package com.example.model;

public class Travel {
    private String InfoTravel;
    private String vehicleNumber;
    private String numberSeat;

    public Travel(String infoTravel, String vehicleNumber, String numberSeat) {
        InfoTravel = infoTravel;
        this.vehicleNumber = vehicleNumber;
        this.numberSeat = numberSeat;
    }

    public Travel() {
    }

    public String getInfoTravel() {
        return InfoTravel;
    }

    public void setInfoTravel(String infoTravel) {
        InfoTravel = infoTravel;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getNumberSeat() {
        return numberSeat;
    }

    public void setNumberSeat(String numberSeat) {
        this.numberSeat = numberSeat;
    }
}
