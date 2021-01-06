package com.christien.javaeight.unit2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class PredicateExample {
    public static void main(String[] args){

        Integer[] arrA = {1,2,3};
        Integer[] arrB = {2,1,3};

        //Biconsumer
        BiConsumer<Integer[], Integer[]> equals = (listA, listB) -> {
            if(listA.length != listB.length) {
                System.out.println("False");
            }
            else{
                for(int i = 0; i < listA.length; i++)
                    if(listA[i] != listB[i]){
                        System.out.println("False");
                        return;
                    }
                System.out.println("True");
            }
        };

        //we define the functional interface above as being a comparator functional interface
        //we then call our abstract method accept() which takes, as we defined, 2 arrays and is void so no return value
        //This will run the function we defined against the 2 arrays shown above
        equals.accept(arrA, arrB);

        BiConsumer<Integer[], Integer[]> display = (listA, listB) ->
        {
            Arrays.stream(listA).forEach(a -> System.out.print(a + " "));
            System.out.println();
            Arrays.stream(listB).forEach(a -> System.out.print(a + " "));
            System.out.println();
        };

        //The 'andThen(...)' returns a composed BiConsumer wherein the parameterized BiConsumer, in this case 'display',
        // will be executed after the first one, 'equals'.
        equals.andThen(display).accept(arrA,arrB);



    }
}
