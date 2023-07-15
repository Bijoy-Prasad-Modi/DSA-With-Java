package com.Bijoy;

import java.util.Arrays;
import java.util.Scanner;

public class input {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       // array of primitives
       // int[] arr = new int[5];
       /* arr[0] = 23;
        arr[1] = 45;
        arr[2] = 233;
        arr[3] = 543;
        arr[4] = 3;
        // [23, 45, 233, 543, 3]
        System.out.println(arr[3]);*/


        /* input using for loops
        for (int i =0 ; i< 5 ; i++) {
            arr[i]=in.nextInt();
        }*/

//        for (int i =0 ; i< 5 ; i++) {
//            System.out.print(arr[i] + " ");
//        }
//                    or
//        for (int i =0 ; i< arr.length ; i++) {
//            System.out.print(arr[i] + " ");
//        }

//       #Enhanced for loop
       /* for (int num : arr){
            //System.out.print(num+" ");
                           }
        //another way to print an array
        System.out.println(Arrays.toString(arr));*/


        //Array of objects
        String [] str = new String[6];
        for (int i = 0; i< str.length ; i++){
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));

    }
}
