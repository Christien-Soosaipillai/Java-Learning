package com.christien.basics.anonymousinnerclass;

public class AnonymousInnerClassDemo {


    /*  An 'Anonymous Inner Class' is one
    *   1. Class that has no name
    *   2. Only a single object can be created
    *
    *   It should be used if you have to override methods of a class of interface
    *
    *   It can be created in 2 ways: 1. Class(Concrete/Abstract)    2. Interface
    *
    * */

    /* In an anonymous class this refers to the instance of the anonymous class, whereas
    in a lambda expression this refers to the instance of the class the lambda expression
    is created in. In other words, it's like lambda expressions don't have an identity from within.*/

    public static void main(String[] args) {
        // Myclass is hidden inner class of Age interface
        // whose name is not written but an object to it
        // is created.
        Age oj1 = new Age() {
            @Override
            public void getAge() {
                // printing  age
                System.out.print("Age is "+ this.x); //'this.' always refers to current anonymous inner class object wwhich is why we can access 'x'


            }
        };
        oj1.getAge();

        //Age age = () -> System.out.print("Age is 24" + x);    //'this.' refers to current outer class (in this case class AnonymousInnerClassDemo)
    }

    interface Age {
        int x = 21;
        void getAge();
    }

}
