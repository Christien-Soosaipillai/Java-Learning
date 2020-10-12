package com.christien.basics.strings;

public class TypeWriter {

    public static void main(String[] args){

        String string = "Christien is Here";
        int num = 1234;

        char[] helloArray = {'h','e','l','l','o'};
        String helloString = new String(helloArray);

        System.out.println( helloString.length());
        System.out.println(string.toUpperCase());
        System.out.println(num);

        String concat = string.concat(helloString);
        System.out.println(concat);

        String s = String.format("The value of the float variable is %f, while the value of the integer variable is %d, and the string is %s",  1.0f, 1.0, "me");


    }
}
