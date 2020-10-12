package com.christien.basics.variabletypes;

public class EmployeeTester {

    //These are all instance variables since they are declared in a class
    //but outside of any methods, constructors or any block
    public int a,b,c;               //Instance variable is visible for any child class
    private int x = 10, y = 11;     //This variable is only visible in the Employee class

/*
    There are 4 levels of access for classes variables methods and constructors:
    1.  Visible to the package, the default. No modifiers are needed.
    2.  Visible to the class only (private).
    3.  Visible to the world (public).
    4.  Visible to the package and all subclasses (protected).
*/
    public static void main(String[] args){

        Employee e1 = new Employee(1, "Christien", "developer");
        Employee e2 = new Employee(2, "SomeoneElse", "some Job");
        System.out.println(e1.getEmployeeCount());          //static varibles can be accessed from the instance
        System.out.println(e2.getEmployeeCount());
        System.out.println(Employee.getEmployeeCount());    //however it is recommended to access the variable via the Class reference

    }

    public void testingLocalVaraibles(){
        int a = 10, b = 11, c = 12;         //These are all local variables
        System.out.println(a+b+c);

        //      The following code will give a compile time error since x was not initialized
        // int x;
        // x = x + 7;

    }

}
