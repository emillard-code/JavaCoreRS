package com.project;

public class Main {

    public static void main( String[] args ) {

        System.out.println(reverseString("Hello World!"));
        System.out.println(reverseString("Testing Java code."));
        System.out.println(reverseString("This project is called JavaCoreRS."));

    }

    public static String reverseString(String string) {

        StringBuilder stringB = new StringBuilder(string);

        for (int x = 0; x < string.length() / 2; x++) {
            char temp = stringB.charAt(x);
            stringB.setCharAt(x, stringB.charAt(string.length() - 1 - x));
            stringB.setCharAt(string.length() - 1 - x, temp);
        }

        return stringB.toString();

    }

}
