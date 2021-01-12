package com.christien.javaeight.unit4;

public class Review {

    private static Integer num;

    public static void main(String[] args){

        /*
            Unit 1: Here we will use math operations for our example

            Functional Programming: is building software that consists of pure functions, avoiding shared states,
                                mutable data and sife effects

            Functional Interface: An interface having only 1 abstract method however 0 to many default methods

            Lambda Expressions: lets you create an anonymous class that implements a functional interface

                Normally the functionality of a particular method is contained within the method itself. Functional
            Programming allows us to pass the functionality around to other methods. In this example we have an interface
            called operation which has a method called calculate. We could make implementations of this class to add, subtract
            multiply...etc.  However instead of this we can just store the functionality as an 'implementation' of the interface

            To create a functional interface we must do the following:
            1. Have an interface that has only 1 abstract method
            2. list the functionality of that method and assign it to Functional interface
                eg. HelloInterface hello = public void print(String name){ System.out.println("Hello" + name); }
            3. Start by removing the access modifier since its not attached to the class
                eg. HelloInterface hello = void print(String name){ System.out.println("Hello" + name); }
            4. Remove the return type name since we are referencing the interface as hello
                eg. HelloInterface hello = public void (String name){ System.out.println("Hello" + name); }
            5.

         */

        //Regular interface
        //For this we would have to create a new interface implementation each time for different operations
        Operation add = new Add();
        Integer sum = add.calculate(1,2);

        //Functional Interfaces example
        Operation add2 = (a, b) -> a+b;

        System.out.println("Performing Lambda Calculations: ");
        System.out.println("Addition Lambda: " + performOperation(1,4, add2) );                     //should be 5
        System.out.println("Subtraction Lambda: " + performOperation(10,4, (a,b) -> a-b) );         //should be 6
        System.out.println("Multiplication Lambda: " + performOperation(7,4, (a,b) -> a*b) );       //should be 28
        System.out.println("Division Lambda: " + performOperation(54,9, (a,b) -> a/b) );            //should be 6

        //Anonymous Inner class: class without a name
        Operation operation = new Operation() {
            @Override
            public Integer calculate(Integer a, Integer b) {
                num = 1;
                return num;
            }
        };

        System.out.println("Anonymous inner class: " + operation.calculate(1,1));


        //Lambda Expression: method without a name
        Operation lambdaOperation = (a, b) -> {
            String someVar = "hi";
            num = 3;
            return num;
        };

        System.out.println("lambda Expression: " + lambdaOperation.calculate(1,1));



    }

    public static Integer performOperation(Integer a, Integer b, Operation operation){
        return operation.calculate(a,b);
    }

}
