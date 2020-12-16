package com.christien.basics.anonymousinnerclass;

//Good example Im using from https://www.geeksforgeeks.org/anonymous-inner-class-java/
public class AnonymousDemo {
    /*
    *
    * In the program, interface Age is created with getAge() method and x=21.  Myclass is written as
    * implementation class of Age interface. As done in Program, there is no need to write a separate class Myclass.
    *
    * */
    public static void main(String[] args){
        // Myclass is implementation class of Age interface
        MyClass obj=new MyClass();

        // calling getage() method implemented at Myclass
        obj.getAge();
    }

}

interface Age
{
    int x = 24;
    void getAge();
}

// Myclass implement the methods of Age Interface
class MyClass implements Age
{
    @Override
    public void getAge()
    {
        // printing the age
        System.out.print("Age is "+x);
    }
}