package com.christien.javaeight.lessons.methodreference;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {

    public static void main(String[] args){
        List letters = new ArrayList<>();
        letters.add("a");
        letters.add("b");
        letters.add("c");
        letters.add("d");

        letters.forEach(System.out::println);

        List<Person> people = new ArrayList<>();
        people.add(new Person("Christien", "Soos"));
        people.add(new Person("Mike", "boi"));
        people.add(new Person("Boi", "OnTheRun"));
        people.add(new Person("ARcher", "guy"));

        for(Person person: people){
            System.out.println(person.getFirstName());
        }

    }




}
