package com.christien.javaeight.streams;

import com.christien.javaeight.unit1.exerciseone.Person;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTerminal {

    public static void main(String[] args){

        List<Integer> intList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16));
        List<Integer> list1 = new ArrayList<>(Arrays.asList(2,4,6,8));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,3,5,7));

        List<List<Integer>> compList = new ArrayList<>();
        compList.add(list1);
        compList.add(list2);

        List<String> line1 = new ArrayList<>(Arrays.asList( "Some", "peace", "we", "see"));
        List<String> line2 = new ArrayList<>(Arrays.asList( "I", "am", "talking", "here", "this", "is", "great"));
        List<String> line3 = new ArrayList<>(Arrays.asList( "Night", "time", "coding", "is", "great"));

        List<List<String>> paragraph = new ArrayList<>();
        paragraph.add(line1);
        paragraph.add(line2);
        paragraph.add(line3);

        System.out.println("\nallMatch");
        //Returns a boolean based on whether or not all items in the stream must match the given condition
        boolean areAllEven = list1.stream().allMatch(i->i%2==0);
        System.out.println("All numbers in list1 are even?: " + areAllEven);

        boolean areAllEven2 = list2.stream().allMatch(i->i%2==0);
        System.out.println("All numbers in list2 are even?: " + areAllEven2);

        boolean endsWithE = line1.stream().allMatch(i->i.endsWith("e"));
        System.out.println("All words end with the letter 'e'?: " + endsWithE);

        System.out.println("\nanyMatch");
        //Returns a boolean based on whether or not at least one item in the stream matches the given condition
        boolean hasNumber1 = list2.stream().anyMatch(i->i==1);
        System.out.println("Does the list contain the number 1?: " + hasNumber1);

        boolean contains_T = line2.stream().anyMatch(i->i.contains("t"));
        System.out.println("Does the list contain on word with the letter 'T'?: " + contains_T);

        System.out.println("\nnonMatch");
        //Returns a boolean based on whether or not there are no items that match the given condition; no items match condition return true : else false
        boolean hasSmallNumbers = list1.stream().noneMatch(i-> i > 10);
        System.out.println("Does the list contain any number less than 10?: " + hasSmallNumbers);

        System.out.println("\ncollect");
        List<Integer> smallNumbersOnly = list1.stream().filter(i-> i < 5).collect(Collectors.toList());
        smallNumbersOnly.stream().forEach(System.out::println);

        Set<String> uniqueWords = paragraph.stream().flatMap(List::stream).collect(Collectors.toSet());
        uniqueWords.stream().forEach(System.out::println);

        System.out.println("\ncount");
        int wordCount = (int) line1.stream().count();
        System.out.println(wordCount);

        System.out.println("\nmin");
        Optional<String> smallestWord = line1.stream().min((a, b) -> a.length() - b.length());
        smallestWord.ifPresent(System.out::println);

    }

}
