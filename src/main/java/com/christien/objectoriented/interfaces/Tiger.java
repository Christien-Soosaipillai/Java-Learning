package com.christien.objectoriented.interfaces;

public class Tiger extends Chordate implements Animal  {

    private static String name ="tiger";
    private int one = 1;


    public Tiger() {
        super();
    }

    @Override
    public void animalSound() {
        System.out.println("Rawwrrr");
    }

    @Override
    public void sleep() {
        name = "sleeping tiger";
        System.out.println("The animal is a sleeping Zzz...");
    }
    public static void something(){
        //one += 2;             This throws an error, non static variable cannot be referenced in static context
                                //super and this cannot be used in static methods
        System.out.println("Only accessible inside the class");
    }


}
