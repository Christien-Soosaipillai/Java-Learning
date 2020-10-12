package com.christien.objectoriented.inheritanceandpolymorphism;

public class CarDealership extends Vehicle {


    public CarDealership(String make, String model){
        super(make,model);
    }

    public void getStats(String dealership){
        System.out.println("Vehicle make is a " + super.getMake() + " and model is a " + super.getModel() + ".This vehicle was purchased in " + dealership);
    }

    public void honk(){
        System.out.println("honk");
    }



}
