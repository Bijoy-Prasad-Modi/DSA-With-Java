package com.Bijoy;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b'); // the operator '+' changing the value of a and b into integer value
        System.out.println("a"+"b"); // String way "a" and String way "b" : in this case operator will concatenate the string value
        System.out.println((char)('a'+3)); // type casting
       // String ans = new Interger (56)+ new ArrayList<>(); //this will not work as when we use '+' operator there has to be atleast a string value
        String ans = new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans);
    }
}

