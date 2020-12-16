package com.christien.objectoriented.abstractionandencapsulation;


/*
 * Abstraction: is the process of hiding the implementation details from the user, only the functionality will be provided.
 *          The user will have the information on WHAT the object does NOT HOW it does it
 *
 * A class which contains the abstract keyword in its declaration is known as an abstract class.
 *      -Abstract classes MAY OR MAY NOT contain abstract methods, i.e., methods without a body ~ public void get(), constructor doesn't count;
 *      -if a class has at least one abstract method, then the class must be declared abstract
 *      -if a class is declared abstract it CANNOT BE INSTANTIATED, to use the class you must inherit it from another class and implement its abstract methods
 *      -If you inherit an abstract class, you have to provide implementations OTHERWISE the class that inherited is considered abstract as well
 *
 *      You cannot override a method and reduce visibility. When you override a method the method must have equal or greater visibility (protected -> public)
 *
 *  Encapsulation: wrapping the data(variables) and code acting on data(methods) together as a single unit. This means the variables of a class are hidden from other classes
 *              and can only be accessed through methods of their current class; this is also known as data-hiding. To achieve this 2 things must be done
 *                      1. variables are made private       2. we provide public getters and/or setters to read and/or modify the variables
 *
 */


public class AbstractionAndEncapsulation {

    public static void main(String[] args){

        //Employee e = new Employee(1,"Christien", "868 Baylawn Drive");  //throws an error since class is abstract, however we can inherit...
        //abstract classes you can say new Employee however an object can be Employee
        Mechanic mechanic = new Mechanic(1,"Christien","Some address", 18.00);
        System.out.println(mechanic.computePay());
        mechanic.getSalary();
        mechanic.mailCheck();
        mechanic.stateJobTitle();
        System.out.println();

        Employee employee = new Mechanic(2, "Me","Some other address",14.00);
        System.out.println(employee.computePay());
        employee.mailCheck();
        employee.stateJobTitle();
        System.out.println();

        Welder welder = new Welder(3, "Some Dude", "address");
        System.out.println("here: " + welder.computePay());
        welder.mailCheck();
        welder.stateJobTitle();
    }

}
