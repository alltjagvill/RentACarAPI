package com.example.RentACar;

public class Car {

    String model;
    String registerNumber;
    String avaibleStatus;
    String cost;
    String productionYear;
    Manufacturer manufacturer;

    public Car() {}

    public Car(String model, String registerNumber, String avaibleStatus, String cost, String productionYear, Manufacturer manufacturer) {
        this.model = model;
        this.registerNumber = registerNumber;
        this.avaibleStatus = avaibleStatus;
        this.cost = cost;
        this.productionYear = productionYear;
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public String getAvaibleStatus() {
        return avaibleStatus;
    }

    public String getCost() {
        return cost;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public void setAvaibleStatus(String avaibleStatus) {
        this.avaibleStatus = avaibleStatus;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
}
