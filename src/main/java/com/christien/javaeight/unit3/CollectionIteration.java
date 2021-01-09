package com.christien.javaeight.unit3;

import com.christien.javaeight.unit2.exerciseone.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionIteration {

    public static void main(String[] args){
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Christien", "Soos", 24),
                new Person("Foo","Barz", 12),
                new Person("Inte","Jerz", 12)
        ));


        //external iteration: the programmer controls the iteration sequence and actions to be done on each element
        System.out.println("External iteration with for loops");
        for(int i= 0; i < people.size(); i++){
            System.out.println(people.get(i).getFirstName());
        }

        for(Person person : people) {
            System.out.println(person.getFirstName());
        }

        //internal iteration: Internal Iterators manages the iterations in the background, programmer only codes actions done on each element
        //internal is easier for threading/parallel operations
        System.out.println("Internal iteration with lambdas");
        people.forEach(p->System.out.println (p.getFirstName()));

        //internal iteration with method reference
        people.forEach(System.out::println);


    }

}
