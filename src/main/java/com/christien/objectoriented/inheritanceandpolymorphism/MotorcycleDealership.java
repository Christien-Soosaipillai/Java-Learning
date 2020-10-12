package com.christien.objectoriented.inheritanceandpolymorphism;

public class MotorcycleDealership extends Vehicle {

    private String bikeCategory;

    public MotorcycleDealership(String make, String model, String bikeCategory) {
        super(make, model);
        this.bikeCategory = bikeCategory;
    }

    public String getBikeCategory() {
        return bikeCategory;
    }

    public void getStats() {
        System.out.println("Bike make is a " + super.getMake() + " and model is a " + super.getModel() + ". The category of bike is a " + bikeCategory);
    }


    
}
