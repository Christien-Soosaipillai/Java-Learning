package com.christien.javaeight.lessons.lambdas;

public class LambdaLesson {

    public static void main(String[] args){

        LambdaLesson lambda = new LambdaLesson();

        MathOperation add = (int a, int b) -> a + b;
        MathOperation subtract = (a,b) -> a-b;
        MathOperation multiply = (int a, int b) -> a*b;
        MathOperation divide = (a,b) -> a/b;

        //Printing operation result
        System.out.println(add.operation(1,2));

        //Passing Lambda function as a parameter
        System.out.println("Addition Lambda: " + lambda.performOperation(1,4, add));                //should be 5
        System.out.println("Subtraction Lambda: " + lambda.performOperation(10,4, subtract));       //should be 6
        System.out.println("Multiplication Lambda: " + lambda.performOperation(7,4, multiply));     //should be 28
        System.out.println("Division Lambda: " + lambda.performOperation(54,9, divide));            //should be 6

    }

    private int performOperation(int a, int b, MathOperation operator){
        return operator.operation(a,b);
    }

    interface MathOperation{
        int operation(int a, int b);
    }

    interface Greeting{
        void greet(String Message);
    }

}
