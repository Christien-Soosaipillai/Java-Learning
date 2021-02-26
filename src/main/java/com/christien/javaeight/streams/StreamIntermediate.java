package com.christien.javaeight.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntermediate {

    public static void main(String[] args){
        List<Integer> intList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16));
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4,5,6,7));

        List<String> line1 = new ArrayList<>(Arrays.asList( "Here", "is", "some", "text"));
        List<String> line2 = new ArrayList<>(Arrays.asList( "I", "am", "talking", "here"));
        List<String> line3 = new ArrayList<>(Arrays.asList( "Night", "time", "coding", "is", "great"));
        List<List<String>> paragraph = new ArrayList<>();
        paragraph.add(line1);
        paragraph.add(line2);
        paragraph.add(line3);

        List<List<Integer>> compList = new ArrayList<>();
        compList.add(list1);
        compList.add(list2);

        System.out.println("\nFilter");
        //Filter: filter certain elements into the next stream
        intList.stream().filter(i->i%2==0).forEach(System.out::println);

        System.out.println("\nMap");
        //map: Apply a function to each element being mapped to the next stream
        intList.stream().map(i->i*2).forEach(System.out::println);


        System.out.println("\nMap 2");
        //flatMap: Works best for a list of collections
        paragraph.stream()
        //stream(List<List<String>>)
        .map(List::stream)
        //Above we apply a stream to each item in the list of list<String> so we have
        //Stream(Stream.of(List<String>),
        //       Stream.of(List<String>),
        //       Stream.of(List<String>) )
        .distinct().forEach(System.out::println);
        //we apply the distinct function but that checks for distinct streams not distinct words
        //Instead we should use flatMap

        System.out.println("\nFlat Map");
        //flatMap: Works best for a list of collections
        paragraph.stream()
        //stream(List<List<String>>)
        .flatMap(List::stream)
        //Now we use flatmap which returns a singular stream consisting of a List of Strings
        //Stream(Stream.of(List<String>))
        .distinct().forEach(System.out::println);
        //we apply the distinct function but that checks for distinct streams not distinct words
        //Instead we should use flatMap

        System.out.println("\nDistinct");
        //we have seen how distinct works above so here is a simple example
        List<Integer> randomNumbers = new ArrayList<>(Arrays.asList(1,4,3,2,2,5,6,1,4,7,9));
        randomNumbers.stream().distinct().forEach(System.out::println);

        System.out.println("\nSorted");
        //same procedure as distinct however it will just sort the numbers in a stream for us
        randomNumbers.stream().sorted().forEach(System.out::println);

        System.out.println("\nPeek");
        //Peek is good for visualizing the stream, only functions when terminal operation exists
        //It will basically show the process of each valid individual value in the stream as operations are applied to it as a whole process
        //very useful for debugging the stream api
        List<Integer> newRands = randomNumbers.stream().peek(System.out::println).filter(e->e>5).peek(System.out::println).collect(Collectors.toList());
        System.out.println(newRands);

        System.out.println("\nlimit");
        //Returns a stream with a limited size, so here we should only get 4 and 3
        randomNumbers.stream().filter(i->i>2).limit(2).forEach(System.out::println);

        System.out.println("\nskip");
        //skips the first x number of elements mentioned and processes the rest
        randomNumbers.stream().skip(2).forEach(System.out::println);

    }
}
