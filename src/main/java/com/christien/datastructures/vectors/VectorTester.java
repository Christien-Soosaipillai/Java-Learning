package com.christien.datastructures.vectors;

/*
* Whats your Vector Victor
*
* Vector implements a dynamic array. It is similar to ArrayList, but with 2 differences:
*   1. Vectors are synchronized, meaning only one thread can access the vector at a time(Arraylist = multiple threads)
*   2. Vectors contain many legacy methods that are not par of the collection framework
*
* Vectors prove to be useful if you don't know the size of the array in advance or you just need one that
* can change sizes over the lifetime of the program.
*
* Vectors are slower than ArrayLists since vectors are synchronized an require a lock for single access
*
*
*
*
* */


import java.util.Vector;

public class VectorTester {

    public static void main(String[] args){
        //param 1: initial Capacity, param 2: increment
        Vector vector = new Vector(3,2);        //if goes past capacity then increment, if equal DONT increment
        vector.add(1);
        vector.add(3.242);
        vector.add("123123");
        for(int i=0;i < vector.size(); i++){
            System.out.println(vector.get(i));
        }


        System.out.println("Capacity after 3 additions: " + vector.capacity());

        vector.add("123123");
        vector.add("123123");
        vector.add("123123");

        System.out.println("Capacity after 3 more additions: " + vector.capacity());



    }


}
