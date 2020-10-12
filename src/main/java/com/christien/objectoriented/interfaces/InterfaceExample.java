package com.christien.objectoriented.interfaces;


/*
*
* Interface: A reference type in java, similar to a class. It is a collection of abstract methods. A class 'implements' an interface thereby inheriting its abstract methods.
*           -An interface may also contain default methods, static nested methods and nested types. method bodies only exist for default and static methods
*           -A class describes attributes and behaviours whereas an interface contains behaviours that a class may implement
*           -Unless that class that implements the interface is abstract, all methods of the interface need to be defined
*               
* static: the static keyword in java is used for memory management. Static can be applied to variables, methods, blocks and nested classes
*       -variables: used to refer to a common property, these variables get memory only once and is shared amongst all instance of the class (if edited in on edited, in all)
*       -methods: belongs to the class rather than the object of a class, invoked without instance of the class,
*
*
* */

public class InterfaceExample {
    //why do we use 'static' in the main method
    //ans: Because using static we aren't required to call an instance of the object we can call the main method without have to allocate memory to the object
    public static void main(String[] args){
        Animal tiger = new Tiger();
        tiger.getAnimalName("tiger");
        tiger.sleep();

    }

}
