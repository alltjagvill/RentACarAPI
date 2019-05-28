package com.example.RentACar;

public class Manufacturer {

    String name;
    String founded;
    String owner;

    public Manufacturer() {}

    public Manufacturer(String name, String founded, String owner) {
        this.name = name;
        this.founded = founded;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public String getFounded() {
        return founded;
    }

    public String getOwner() {
        return owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFounded(String founded) {
        this.founded = founded;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
