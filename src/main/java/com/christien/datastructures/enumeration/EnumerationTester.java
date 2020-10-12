package com.christien.datastructures.enumeration;


/*
*
* Enumeration: defines methods by which you can enumerate(obtain one at a time) the elements in a collection of objects
*       -This legacy interface has been superceded by 'Iterator', although not deprecated. Enumeration is considered obsolete
*
*   1) The main difference between Iterator and Enumeration is removal of the element while traversing the collection.
*   Iterator can remove the element during traversal of collection as it has remove() method. Enumeration does not have remove() method.
*
*   2) Enumeration is fail-safe in nature. It does not throw ConcurrentModificationException if Collection is modified during the traversal.
*   Iterator is fail-fast in nature. It throws ConcurrentModificationException if a Collection is modified while iterating other than its own remove() method.
*
*   3) Enumeration is a legacy interface which is used for traversing Vector, Hashtable. Iterator is not a legacy interface.
*   Iterator can be used for the traversal of HashMap, LinkedList, ArrayList, HashSet, TreeMap, TreeSet .
*
*   The main difference is iterator doesnt allow simultaneous navigation and modification of the iterated object whereas enumeration does. For this reason
*   iterator has control to see if there are concurrent modifications and fail fast. Therefore enumeration is faster than iterator.
*
*   Use enumeration for threaded process where more than one item can modify the list, iterator should be used for detecting bugs and safely removing items in non threaded processes
*
*     Enumeration                     Iterator
*     ----------------                ----------------
*
*     hasMoreElements()               hasNext()
*     nextElement()                   next()
*     N/A                             remove()
*
* */


import java.util.*;

public class EnumerationTester {

    public static void main(String[] args){

        //Iterator Implementation       --Fails fast
        Iterator iterator;
        List<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        iterator = cars.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
            //cars.remove(2);                       //this will get a "ConcurrentModificationException" exception
            iterator.remove();                      //instead use this
            System.out.println(cars.size());
        }

        //Enumerator Implementation     --fail safe in nature
        Enumeration enumerator;
        Vector daysOfTheWeek = new Vector();

        daysOfTheWeek.add("Monday");
        daysOfTheWeek.add("Tuesday");
        daysOfTheWeek.add("Wednesday");
        daysOfTheWeek.add("Thursday");
        daysOfTheWeek.add("Friday");
        daysOfTheWeek.add("Saturday");
        daysOfTheWeek.add("Sunday");
        enumerator = daysOfTheWeek.elements();

        while(enumerator.hasMoreElements()){
            System.out.println("Iter: " + enumerator.nextElement());
            System.out.println("before: " + daysOfTheWeek);
            System.out.println("removing: " + daysOfTheWeek.get(2));
            daysOfTheWeek.remove(2);        //doesn't fail fast on removal of items, doesn't throw "ConcurrentModificationException"
            System.out.println("after: " + daysOfTheWeek);

        }

    }

}
