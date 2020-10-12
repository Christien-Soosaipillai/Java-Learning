package com.christien.objectoriented.interfaces;

public interface Animal{

    void animalSound();

    void sleep();

    default void getAnimalName(String name){
        System.out.println("The animal is a " + name);
    }

    static void animalRun(String name){
        System.out.println("The " + name + " is running!");
    }

}
