package com.christien.javaeight.unit2;

public class MethodReference1 {

    public static void main(String[] args){
        //Runnable is a an interface which has 1 abstract void no arg function. So we can give a lambda with no args the returns void which is an instance of Runnable
        Thread thread = new Thread(()->printMessage());
        thread.start();

        //Method Reference version different syntax but same purpose, said to be cleaner
        Thread thread1 = new Thread(MethodReference1::printMessage);
        thread1.start();

    }

    public static void printMessage(){
        System.out.println("Printing here...");
    }

}
