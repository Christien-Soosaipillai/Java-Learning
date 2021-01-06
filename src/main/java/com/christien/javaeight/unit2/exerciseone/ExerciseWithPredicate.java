package com.christien.javaeight.unit2.exerciseone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ExerciseWithPredicate {

    public static void main(String[] args){
        //*Note
        /*
        * new ArrayList<>(Arrays.asList( ... )) & Arrays.asList( ... ) both will create a List
        *
        * -the new Arrays.asList( ... ) acts as a wrapper of the array, so no data is copied or created
        * meaning if do List<String> newList = new Arrays.asList( someArray ), then any modifications we
        * make to 'newList' we make those same modifications to 'someArray'; This is a fixed list, adding to
        * or removing from this list throws an Exception at Runtime
        *
        * -the new ArrayList<>(Arrays.asList( ... )) uses as an independent copy of a list meaning if we
        * do List<String> newList = new ArrayList<>(Arrays.asList( someArray )), then any Modifications we
        * make to 'newList' we WONT MAKE those same modifications to 'someArray'; Additionally, we have all
        * the capabilities of a regular ArrayList, like adding and removing elements;
        * */
        List<Person> people = Arrays.asList(
                new Person("Christien", "Soos", 24),
                new Person("Foo","Barz", 12),
                new Person("Inte","Jerz", 12)
        );

        List<Person> people2 = new ArrayList<>(Arrays.asList(
                new Person("Christien", "Soos", 24),
                new Person("Foo","Barz", 12),
                new Person("Inte","Jerz", 12)
        ));


        /* people.remove(1);
        *
        * Exception in thread "main" java.lang.UnsupportedOperationException
	    * at java.base/java.util.AbstractList.remove(AbstractList.java:167)
	    * at com.christien.javaeight.beginning.exerciseone.Exercise1.main(ExerciseWithPredicate.java:38)
        *
        *
        * people2.remove(1)
        *
        * No errors, runs just fine
        *
        * */



        //step 1: sort list by lastname
        System.out.println("Sorting list by lastName");
        //JAVA 7 SOLUTION
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        //LAMBDA SOLUTION
        people.sort( (a,b) -> a.getLastName().compareTo(b.getLastName()) );



        //step 2 create a method that prints all elements in the list
        System.out.println("Printing by lastname");

        //JAVA 7 SOLUTION
        for(Person p: people){
            System.out.println(p.getLastName());
        }
        //LAMBDA SOLUTION
        people.forEach(e->System.out.println(e.getLastName()));

        //step 3 print all people with first names beginning with 'C'
        System.out.println("Printing firstnames that begin with the letter 'C'");
        //JAVA 7 SOLUTION
        for(Person p: people){
            if(p.getFirstName().toLowerCase().startsWith("c")){
                System.out.println(p.getFirstName());
            }
        }

        //LAMBDA SOLUTION
        people.forEach(e->{
            if(e.getFirstName().toLowerCase().startsWith("c")){
                System.out.println(e.getFirstName());
            }
        });

        printConditional(people, p -> p.getFirstName().toLowerCase().startsWith("c"));

        Consumer<Person> consumer = p -> System.out.println(p.getFirstName()  + " meets the custom condition");
        printCustomConditional(people, p -> p.getFirstName().toLowerCase().startsWith("c"), consumer);

    }

    public static void printConditional(List<Person> people, Predicate<Person> predicate){
        for (Person person : people) {
            if(predicate.test(person)){
                System.out.println(person.getFirstName() + " meets the condition");
            }
        }
    }

    public static void printCustomConditional(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer){
        for (Person person : people) {
            if(predicate.test(person)){
                consumer.accept(person);
            }
        }
    }

}

interface Condition{
    boolean test(Person person);
}
