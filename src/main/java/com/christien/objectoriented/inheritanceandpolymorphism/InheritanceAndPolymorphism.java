package com.christien.objectoriented.inheritanceandpolymorphism;

import java.util.ArrayList;
import java.util.List;

/*
*   Inheritance: the process where one class acquires the properties(methods and fields) of another class
*   Override: means to override the functionality of an existing method
*   Polymorphism: is the ability of an object to take on many forms, most commonly when a parent class reference
*               is used to refer to a child class object (In this example our 'toyota example')
*
*   "extends 'className' " is the keyword used to inherit the properties of a class
*
*   The subclass is the class that 'extends' the superclass. The subclass can inherit from the subclass but not vice versa
*
*   The 'super' keyword is similar to 'this' keyword. Following are scenarios where we use the super keyword:
*       -It is used to differentiate the members of a superclass from members of subclass, if they have same names
*       -It is used to invoke the superclass constructor from the subclass.
*
*       super.variable, super.method()
*
*   If you create a sub class with a method that has the same name and return type as the method in
*   the super class it will override that method and call the sub class implementation
*
*
*
* */

public class InheritanceAndPolymorphism {

    public static void main(String[] args){

        List<String> shoppingList = new ArrayList<>();

        //example of using super class methods
        //here foodStore which is sub class of Food Producer uses Food Producers' copyrightStatement()
        shoppingList.add("orange");
        shoppingList.add("orange");
        shoppingList.add("apple");
        shoppingList.add("banana");
        shoppingList.add("banana");
        shoppingList.add("banana");
        FoodStore foodStore = new FoodStore();
        foodStore.getSumAmount(shoppingList);
        foodStore.copyrightStatement();

        CarDealership carDealership = new CarDealership("Volkswagen", "Jetta");
        carDealership.getStats();                           //The super method call
        carDealership.getStats("Scarborough");    //The subclass method call.... this is known as 'Overriding'

        Vehicle toyota = new CarDealership("Toyota", "Supra");  //A CarDealership IS A Vehicle
        //CarDealership ford = new Vehicle("Ford", "focus");                //However, a Vehicle IS NOT A CarDealership ..... only goes one way

        toyota.getStats();          //this will call the super class since there is no instance of getStats() in the CarDealership subclass
                                    //HOWEVER IF THERE WERE, we would call the instance of getStats from CarDealership() even though it is a Vehicle reference


        /*
        *At compile time, the check is made on the reference type ('Vehicle'). However, at runtime, the Jvm figures out
        * the object type and would run the method belonging to that particular object(In this case 'CarDealerShip's getStats()')
        */
        //toyota.honk();          //This throws an error because there is no method called honk() in the super class Vehicle


        MotorcycleDealership honda = new MotorcycleDealership("Honda", "150cc", "Cafe Racer");
        honda.getStats();               //The subclass method call here overrides the super class method call

        System.out.print("Is 'toyota' an instance of a 'Vehicle': ");
        System.out.println(toyota instanceof Vehicle);
        System.out.print("Is 'toyota' an instance of a 'CarDealership': ");
        System.out.println(toyota instanceof CarDealership);


    }

}
