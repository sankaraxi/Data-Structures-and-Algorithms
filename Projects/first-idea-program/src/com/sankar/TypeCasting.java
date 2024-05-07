package com.sankar;

import  java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        type casting - compressing the bigger number into smaller type explicitly ;- here float to int
//        int num = (int)(56.99f);
//        System.out.println(num);

        // automatic type promotion in expressions
//        int a =277;
//        byte b = (byte)(a); //277%256 = 21 coz maximum value that a byte can store is 256
//        System.out.println(b);

//        byte a = 20;
//        byte b = 50;
//        byte c = 50;
//
//        int d = a*b/c;
//
//        System.out.println(d);
//
////        byte e = 50;
//        byte e =( byte)(277);
//        int f = e * 3;
//        System.out.println(f);

//        int number = 'S';
//        int number1 = 's';
//        System.out.println(number);
//        System.out.println(number1);
        // Thus java follows unicode principles

        System.out.println("தமிழ்");

        int i = 300000;
        float f= 21.05f;
        char c = 's';
        short s = 1024; //ranges from -32,768 to a maximum value of 32,767
        byte b =42;
        double d =8.953344;

        double result = (f*b) + (i/c) - (d*s);
        // float + integer - double = double
        System.out.println((f*b) + " " + (i/c) + " " + (d*s));
        System.out.println(result);




    }
}
