package com.christien.basics.objandclasses;

public class DogTrainer {

    /*
    Object − Objects have states and behaviors. Example: A dog has states - color, name, breed as well as
           behavior such as wagging their tail, barking, eating. An object is an instance of a class.

    Class − A class can be defined as a template/blueprint that describes the behavior/state
          that the object of its type supports.

    Methods − A method is basically a behavior. A class can contain many methods. It is in methods
            where the logics are written, data is manipulated and all the actions are executed.

    Instance Variables − Each object has its unique set of instance variables. An object's state is
                       created by the values assigned to these instance variables.
    */

    public static void main(String[] args) {
        Dog frankie = new Dog("Maltipoo", 6);
        frankie.bark();
        frankie.assignTraining();

    }

}
