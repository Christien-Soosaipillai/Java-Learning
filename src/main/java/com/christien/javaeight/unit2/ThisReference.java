package com.christien.javaeight.unit2;

public class ThisReference {

    public static void main(String[] args){
        ThisReference reference = new ThisReference();

        reference.doProcess(10, new Process() {
            @Override
            public void process(int i) {
                System.out.println("Value of i: " + i);
                System.out.println(this);           //'this' refers to the instance of the new Process() anonymous inner class
            }

            @Override
            public String toString() {
                return "toString referring to call to 'this' or direct toString() call";
            }
        });

        reference.doProcess(10, i->{
            System.out.println("Value of i: " + i);
            //System.out.println(this);               //'this' reference DOESNT refer to the lambda but refers to the actual class instance
                                                    //throws an error because you cant reference this inside a static context
        });

        reference.execute();

    }

    public void execute(){
        doProcess(10, i->{
            System.out.println("Value of i: " + i);
            System.out.println(this);                   //'this' will refer to the ThisReference class instance that calls this method
        });
    }

    public void doProcess(int i, Process p){
        p.process(i);
    }

}
