package com.christien.datastructures.stack;

/*
*
* Stack is a subclass of Vectors that implements a standard last-in, first-out stack
* Stack includes all the methods of vector and several of its own, constructor creates an empty stack
*
*
* */

import java.util.Stack;

public class StackTester {

    public static void main(String[] args){

        Stack stackedTrack = new Stack();
        trainIncoming(stackedTrack,1);
        trainIncoming(stackedTrack,2);
        trainIncoming(stackedTrack,3);
        trainIncoming(stackedTrack,4);
        System.out.println("2 TRAINS LEAVING THE ONE WAY STATION");
        trainOutgoing(stackedTrack);
        trainOutgoing(stackedTrack);

    }

    static void trainIncoming(Stack stackedTrack, int train){
        stackedTrack.push(new Integer(train));
        System.out.println("push train #" + train + " into the station");
        System.out.println("stack: " + stackedTrack);
    }

    static void trainOutgoing(Stack stackedTrack){
        System.out.print("release train(pop)-> ");
        Integer train = (Integer) stackedTrack.pop();
        System.out.println(train);
        System.out.println("stack: " + stackedTrack);
    }


}
