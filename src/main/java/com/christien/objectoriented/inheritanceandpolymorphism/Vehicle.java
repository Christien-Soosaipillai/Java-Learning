package com.christien.objectoriented.inheritanceandpolymorphism;

public class Vehicle {

    private String make;
    private String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }


    public void getStats(){
        System.out.println("Vehicle make is a " + make + " and model is a " + model);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
