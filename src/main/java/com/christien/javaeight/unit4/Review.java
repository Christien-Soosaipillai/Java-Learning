package com.christien.javaeight.unit4;

import java.util.Arrays;
import java.util.function.BiConsumer;

public class Review {

    private static Integer num;

    public static void main(String[] args){

        /*
            Unit 1: Here we will use math operations for our example

            Functional Programming: is building software that consists of pure functions, avoiding shared states,
                                mutable data and side effects

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

        System.out.println("Unit One Review: \n");

        //Regular interface
        //For this we would have to create a new interface implementation each time for different operations
        Operation add = new Add();
        Integer sum = add.calculate(1,2);
        System.out.println(sum);

        //Functional Interfaces example
        Operation add2 = (a, b) -> a+b;

        System.out.println("Performing Lambda Calculations: ");
        System.out.println("Addition Lambda: " + performOperation(1,4, add2) );                     //should be 5
        System.out.println("Subtraction Lambda: " + performOperation(10,4, (a,b) -> a-b) );         //should be 6
        System.out.println("Multiplication Lambda: " + performOperation(7,4, (a,b) -> a*b) );       //should be 28
        System.out.println("Division Lambda: " + performOperation(54,9, (a,b) -> a/b) );            //should be 6

        //Anonymous Inner class: class without a name
        //    -'this' refers to the instance of the new Operation() for anonymous inner classes
        Operation operation = new Operation() {
            @Override
            public Integer calculate(Integer a, Integer b) {
                num = 1 + someNum;
                return num;
            }
        };
        System.out.println("Anonymous inner class: " + operation.calculate(1,1));
        /*
             Same thing can be done with a lambda as shown below. Lambdas are just implementation of an inline
            anonymous class with a single abstract method.

            Lambda Expression: method without a name
            -'this' reference DOESNT refer to the lambda but refers to the actual class instance the lambda is called in(in this case class is 'public class Review{...}' )
        */
        Operation lambdaOperation = (a, b) -> {
            String someVar = "hi";
            //num = this.someNum + 6;         //Doesn't work because you cant call 'this.' keyword from static context
            return num;
        };

        System.out.println("lambda Expression: " + lambdaOperation.calculate(1,1));


        /*Unit 2:

            Introduced along with Java 8 was a package called java.util.functions. This package contained a variety of Interfaces that mimicked common function
            scenarios. This way we did have to create Interfaces each time we wanted to used a lambda expression. We could simply use an Interface that supported
            the parameter types we wished to use

            Closure: is a persistent scope which holds on to local variables even after the code execution has moved out of that block

        */

        System.out.println("\nUnit Two Review: \n");


        Integer[] arrA = {1,2,3,5,1,4};
        Integer[] arrB = {2,1,3,1,4,2};
        Integer[] arrC = {2,1,3,1,4,2};

        //BiConsumer is an interface introduced in the java.util.functions package that takes 2 parameters of generic type
        //BiConsumer is one of many interfaces introduced in this package
        BiConsumer<Integer[], Integer[]> biconsumer = (a, b) -> {
            if(a.length != b.length){
                System.out.println("Arrays are not the same");
            }else{
                for(int i = 0; i < a.length; i++){
                    if(a[i] != b[i]){
                        System.out.println("Arrays are not the same");
                        return;
                    }
                }
                System.out.println("Arrays are the same");
            }
        };
        //If we wanted to we could even call this in a method that takes a BiConsumer
        System.out.println("Comparing Array A and B");
        biconsumer.accept(arrA,arrB);

        System.out.println("Comparing Array B and C");
        biconsumer.accept(arrB,arrC);



    }

    public static Integer performOperation(Integer a, Integer b, Operation operation){
        return operation.calculate(a,b);
    }


}
