package com.christien.javaeight.unit2;

import com.christien.javaeight.unit2.exerciseone.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReference2 {

    public static void main(String[] args){
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Christien", "Soos", 24),
                new Person("Foo","Barz", 12),
                new Person("Inte","Jerz", 12)
        ));

        System.out.println("Printing all Names");
        printCustomConditional(people, p-> p.getAge() < 13,p->System.out.println(p));       //lambda expression call

        System.out.println("Printing all Names");
        printCustomConditional(people, p-> p.getAge() < 13,System.out::println );           //method reference call


    }

    public static void printCustomConditional(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer){
        for (Person person : people) {
            if(predicate.test(person)){
                consumer.accept(person);
            }
        }
    }

}
