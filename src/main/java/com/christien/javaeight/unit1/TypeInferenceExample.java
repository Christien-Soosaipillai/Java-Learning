package com.christien.javaeight.unit1;

public class TypeInferenceExample {

    public static void main(String[] args){
        //type inference is done based off of the left hand side of the below functionl equation
        //the compiler looks at myLambda and understands it has to match the lambda expression on the right with the type StringLengthLambda
        StringLengthLambda myLambda = (s) -> s.length();

//        System.out.println(myLambda.getLength("Hello Lambda"));

        //2 ways to call the lambda expression
        printLambda((s) -> s.length());
        printLambda(myLambda);
    }


    public static void printLambda(StringLengthLambda lambda){
        System.out.println(lambda.getLength("Hello Lambda"));

    }


    interface StringLengthLambda{
        int getLength(String s);
    }

}
