package com.christien.datastructures.bitset;


/*
*
* The BitSet class creates a special type of array that holds bit values. The BitSet array can increase in size as needed.
* This makes it similar toa  vector of bits. This is a legacy class but has been completely re-engineered in Java 2, version 1.4
* Not really used too much now but will include in this repo
*
*
*
*
* */


import java.util.BitSet;

public class BitSetTester {

    public static void main(String[] args){

        BitSet bitset1 = new BitSet(16);
        BitSet bitset2 = new BitSet(16);

        for(int i = 0; i < 16; i++){
            if((i % 2) == 0){ bitset1.set(i);}
            if((i % 5) != 0){ bitset2.set(i);}
        }

        System.out.println("Initial pattern in bits1: ");
        System.out.println(bitset1);
        System.out.println("\nInitial pattern in bits2: ");
        System.out.println(bitset2);

        // AND bits
        bitset2.and(bitset1);
        System.out.println("\nbitset2 AND bitset1: ");
        System.out.println(bitset2);

    }
}
