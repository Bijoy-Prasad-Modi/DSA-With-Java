package com.Bijoy;

import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
       // System.out.println(56);
       // System.out.println("Bijoy");
        Integer num = new Integer (56);
        System.out.println(num.toString());
        System.out.println(num);
        System.out.println(new int[] {2,8,9,4}); //As java using toString method to print the object, it will print some garbage value
        System.out.println(Arrays.toString(new int[] {2,8,9,4})); // that's why we  will use our own method Arrays.toString to print the objects
String name = null ;
        System.out.println(name);
    }
}
