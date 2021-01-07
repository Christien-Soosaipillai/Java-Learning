package com.christien.javaeight.unit2;

public class ClosureExample {

    //See closure definition in notes,

    //A closure is a persistent scope which holds on to local variables even after the code execution has moved
    //out of that block

    /*  An anonymous class cannot access local variables in its enclosing scope that are not declared as final or effectively final
     * b is a local variable that is considered to be effectively final. However, even if the variable is final or effectively final
     * we are not allowed to modify the value of b from within the inner class. THe reason for this is that the inner class 'captures'
     * the variable, and bring just that copy inside the inner class. Anything it does to that copy is independent of from the variable
     * in the enclosing scope. These changes will not persist in the enclosing scope.
     *
     *  Java wants the developer to use the final keyword on any variables that are going to be modified in the inner class. This prevents
     * us from thinking the things we change in the inner class will persist in the enclosing scope. Jav wants us to add the final keyword.
     * But what if outside of the anonymous inner class we want to change the value. This is a problem since the variable is final. After Java 8
     * this problem was addressed with the 'effectively final' idea.
     *
     *  A work around is to make the the variable an instance variable, but does this work. In the Java documentation we see that our inner class
     *  "cannot acces local variables in its enclosing scope that are not declared as final...". This only applies to local variables declared
     *  within the method and NOT instance variables. Example shown below
     *
     *
     */

    static int a = 10;

    public static void main(String[] args){
        int b = 20;
        performProcess(a, new Process(){

            @Override
            public void process(int i) {
                //b = 12;                     //ERROR: Variable 'b' is accessed from within inner class, needs to be final or effectively final
                System.out.println(i);
            }
        });

        performProcess(a, new Process(){

            @Override
            public void process(int i) {
                System.out.println("var a before change: " + a);
                a = 40;                       //No issues here
            }
        });
        System.out.println("var a after anonymous inner class change: " + a);                //variable changed from within anonymous inner class perists outside

        //We could also do something like this so that we get the value of b along with the lambda expression
        performProcess(a, (i) -> System.out.println(b+i));

    }

    public static void performProcess(int i, Process p){
        p.process(i);
    }
}

interface Process{
    void process(int i);
}
