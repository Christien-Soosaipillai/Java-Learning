package com.christien.javaeight.beginning;

public class Greeter {

    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args){
        //Regular Version
        Greeter greeter = new Greeter();
        //creating a class that implements the greeting interface and provide the logic for that imterface implementation
        Greeting helloWorld = new HelloWorldGreeting();
//        greeter.greet(helloWorld);

        //Lambda Version
        MyLambda myLambdaFunction = () -> System.out.println("Hello World");

        //If you have an interface that matches the lambda expression requirements then you can use that instead
        //Here we are creating a function(lambda expression) inline which gets assigned to the type Greeting
        Greeting greetingLambda = () -> System.out.println("Hello World From Lambda");

        helloWorld.perform();
        //This is how you execute lambda expressions. By calling the interface method on it, just as if it were an instance of a class
        greetingLambda.perform();

        Greeting innerClassGreeting =  new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello World");
            }
        };

        innerClassGreeting.perform();

        greeter.greet(innerClassGreeting);
        greeter.greet(greetingLambda);

    }

}

//Functional Interface
interface MyLambda {

    void foo();

}
