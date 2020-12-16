package com.christien.objectoriented.abstractionandencapsulation;

public class Welder extends Employee{

    public Welder(int id, String name, String address) {
        super(id, name, address);
    }

    @Override
    public void stateJobTitle() {
        System.out.println("I am a welder");
    }




}
