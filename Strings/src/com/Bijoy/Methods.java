package com.Bijoy;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Bijoy Prasad Modi" ;
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name);
        System.out.println(name.toLowerCase()); //name.toLowerCase() --> to the all the characters into lower index
        System.out.println(name.charAt(2)); // name.charAt() --> to know which character exist at a particular index
        System.out.println(name.indexOf('y')); // name.indexOf() --> to get the presence of character at which index
        System.out.println(name.getBytes()); //name.getBytes --> to get byte code
        System.out.println("   Bijoy   ".strip()); // To remove the white space
    }
}
