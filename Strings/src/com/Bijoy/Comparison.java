package com.Bijoy;

public class Comparison {
    public static void main(String[] args) {
//        String a ="Bijoy" ;
//        String b ="Bijoy" ; //we know 'a' and 'b' both are in String pool right now , But what is the proof
//        //The proof is '==' -> this is actually a comparator
//        System.out.println( a == b);

        String a = new String("Bijoy");    //object 1
        String b = new String ("Bijoy");  //another object2
    System.out.println(a==b); // it will show false,As both values of reference variable are same but different object
                             // Use '==' method to check different reference variable pointing to the same object ot not

        System.out.println(a.equals(b)); // Use '.equals' method to check the value of two different objects same or not
                                        //It's just care about the value

    }
}
