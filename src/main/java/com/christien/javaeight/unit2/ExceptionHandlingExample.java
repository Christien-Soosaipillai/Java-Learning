package com.christien.javaeight.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        int key = 2;

        process(arr,key,errorChecking((a,b)->System.out.println(a+b)) );            //1
    }

    private static void process(int[] array, int key, BiConsumer<Integer, Integer> operation){
        for (int i = 0; i < array.length; i++){
            operation.accept(array[i], key);
        }
    }

    //This function acts as a pass through function which returns a lambda expression
    //This is a wrapper function, so when the process() function is called it first does the errorchecking function
    //which returns the original System.out.println function that was passed in so it would go in order of 2->1
    private static BiConsumer<Integer, Integer> errorChecking(BiConsumer<Integer, Integer> operation){      //2
        return (a,b) -> {
            try {
                System.out.println("Inside error checking");
                operation.accept(a, b);
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
    }

}
