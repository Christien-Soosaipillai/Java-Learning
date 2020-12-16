package com.christien.javaeight.examples;

public class RunnableLambda {

    public static void main(String[] args){
        //inline anonymous inner class
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed inside runnable");
            }
        });
        thread.run();

        //Same thing can be done with a lambda as shown below
        //Since lambdas are just implementation of an inline anonymous class with a single abstract method to implement
        //inline lambda implementation
        Runnable runnable = () -> System.out.println("Printed inside LAMBDA runnable");
        Thread lambdaThread = new Thread( () -> System.out.println("Printed inside LAMBDA runnable"));
        lambdaThread.run();

    }



}
