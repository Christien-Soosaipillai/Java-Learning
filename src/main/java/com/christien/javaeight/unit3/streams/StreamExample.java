package com.christien.javaeight.unit3.streams;

import com.christien.javaeight.unit2.exerciseone.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    /*
     * stream: wrappers around a data source, allowing us to operate with that data source and making bulk processing convenient and fast.A stream
     * does not store data and, in that sense, is not a data structure. It also never modifies the underlying data source.
     * */
    private static List<Person> people;

    public static void main(String[] args) {
         people = new ArrayList<>(Arrays.asList(
                new Person("Christien", "Soos", 19),
                new Person("Cracked", "Boi", 24),
                new Person("Crodie", "Manz", 25),
                new Person("Foo", "Barz", 12),
                new Person("Inte", "Jerz", 20)
        ));

        people.stream()
        .filter(p->p.getFirstName().toLowerCase().contains("c"))            //intermediate operation, return a stream to do more procedures with
        .forEach(System.out::println);                                      //terminal operation, cannot do more procedures, returns either void or non-stream result

        //returns a sequential stream
        long peopleCount = people.stream()
                                 .filter(p->p.getFirstName().toLowerCase().contains("c"))
                                 .count();                                  //another terminal operation

        //Returns a possible parallel stream if the compiler believes parallel processing can be incorporated, otherwise returns a sequential stream
        long parallelCount = people.parallelStream()
                                   .filter(p->p.getFirstName().toLowerCase().contains("c"))     //returns a stream containing elements of the original stream that pass a given condition
                                   .count();                                                    //get ths number of elements left in the stream

        //map()
        Integer[] chosen = {0,2,4};
        List<Person> selectedPeople = Arrays.stream(chosen)
                                            .map(age->people.get(age))          //returns a new stream after applying a function to each element of the original stream
                                            .collect(Collectors.toList());      //get stuff out of the stream once we are done with all the processing
        selectedPeople.forEach(p->System.out.println(p.getFirstName()));

        //findFirst()
        Person selectedPerson = people.stream()
                                      .filter(person -> person.getFirstName().toLowerCase().startsWith("c"))
                                      .findFirst().orElse(null);
        System.out.println(selectedPerson);

        Person[] personsArray = people.stream().toArray(Person[]::new);



    }



}
