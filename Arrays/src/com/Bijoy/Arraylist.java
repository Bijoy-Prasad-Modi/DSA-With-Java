package com.Bijoy;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
        //Syntax of Arraylist
    ArrayList<Integer> list= new ArrayList<>(5);
////Adding integers to list
//        list.add(67);
//        list.add(66);
//        list.add(70);
//        list.add(46);
//        list.add(891);
//        list.add(87);
//
//        list.set(1,88);  // to change the element of a particular index
//        System.out.println(list.contains(70)); //Using  list.contains -> we can check if the list contain particular element or not
// if list contain a particular element it will show "true" , else "false"
        //list.remove(2); // list.remove -> remove the index no.2
//        System.out.println(list);




        //We can also take input in list using for loop
        for(int i =0 ; i<5; i++){
list.add(input.nextInt());
        }
        // System.out.println(list);
        for(int i =0 ; i<5; i++){
            System.out.println(list.get(i)); //Pass index here ,list[index] will not work here
        }



    }
}
