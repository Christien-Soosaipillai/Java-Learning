package com.christien.javaeight.streams;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamBuilder {

    public static void main(String[] args){

        //ARRAY STREAMS
        Integer[] intArr = new Integer[]{1,2,3,4,5,6};
        Stream<Integer> intStream1 = Stream.of(1,2,3,4,5,6);
        Stream<Integer> intStream2 = Stream.of(intArr);

        String[] strArr = new String[]{"a","b","c","d"};
        Stream<String> strStream1 = Stream.of("x","y","z");
        Stream<String> strStream2 = Stream.of(strArr);

        //LIST STREAMS
        List<Integer> newList = Arrays.asList(intArr);                             //Reference to Array, modify here modifies original array, however cant add or delete
        List<Integer> intList = new ArrayList<>(Arrays.asList(intArr));            //Copy of Array, can modify elements, add or delete


        intStream1.forEach(System.out::println);

        Stream<Integer> randomNumbers = Stream.generate(()->new Random().nextInt(10));      //infinite stream of numbers from 0-10
        randomNumbers.limit(20).forEach(System.out::println);                                      //Here we limit the numbers to 20

        IntStream charStream = "12345_12343".chars();
        charStream.forEach(System.out::println);

        Stream<String> strStream = Stream.of("a b s d".split("\\s"));
        strStream.forEach(System.out::println);



    }
}
