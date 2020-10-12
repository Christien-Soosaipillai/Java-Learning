package com.christien.basics.numbers;

import java.util.ArrayList;
import java.util.List;

public class Mover{

    public static void main(String[] args){
        /*
            AutoBoxing: Converting a primitive value into an object of the corresponding wrapper class, applied by the java compiler when:
                -passed as a parameter to a method that expects an object of the corresponding wrapper class
                -Assigned to a variable of the corresponding wrapper class

            Unboxing: Converting an object of a wrapper type to its corresponding primitive type, applied by the compiler when:
                -passed as a parameter to a method that expects a value of the corresponding primitive type
                -Assigned to a variable of the corresponding primitive type

            The reason we use boxing and unboxing is because primitives aren't interchangeable where as Objects are. with objects we can do
            something called 'Substitution' meaning to use an instance of a particular type as an instance of another related type(Using a String
            as an Object).
            Explanation

            The following are a list of primitive to wrapper conversions
            boolean ->  Boolean
            byte    ->  Byte
            char    ->  Character
            float   ->  Float
            int     ->  Integer
            long    ->  Long
            short   ->  Short
            double  ->  Double
        */

        List<Integer> numbersList = new ArrayList<>();

        int sumation = 0;
        for(int i = 0; i < 10; i++){
//          Integer newInt = new Integer(i);    //creating an integer object => Autoboxing
            Integer newInt = i;                 //the above contructor call is depricated so we use this call instead
            numbersList.add(i);                //Another form of Autoboxing
            sumation += i;
        }
        Integer autoboxedValue = autoBoxEvens(sumation);    //Autobox int -> Integer
        int unboxedValue = unbox(numbersList);              //unbox() returns an Integer however we unbox that value from Integer -> int

        //These Autoboxed values also have built in functions that help with certain operations you would like to perform

    }

    public static int autoBoxEvens(int val){
        Integer x = 0;
        for(int i = 0; i < val; i++){
            x += i % 2 == 0 ? i : 0;
        }
        System.out.println("sumation of all even integers in list: " + x);
        return x;
    }

    public static Integer unbox(List<Integer> list){

        int x = 0;
        for(int i =0; i < list.size(); i++){
             x += list.get(i);    //Unboxing
        }
        System.out.println("sumation of all integers in list: " + x);
        return x;
    }
}
