package com.Bijoy;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /* SYNTAX
         [
         1 2 3
         4 5 6
         7 8 9
          ]
        */
//        int[][] arr = {
//                {1,2,3}, //0th index
//                {4,5},   // 1st index
//                {6,7,8,9}// 2nd index
//        };
        int [][]arr = new int [3][3] ;

        //input
        for(int row =0 ;row<arr.length ;row++){
            //for each colum of every row so that we can take input on that particular index
            for(int col =0 ; col<arr[row].length ;col++){
                arr[row][col]=in.nextInt();
            }
        }

//        for(int row =0 ; row<arr.length; row++){
//            //for each colum of every row
//            for(int col=0; col<arr[row].length; col++){
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }
        //
        //
        // Output : Another way to print an array
//        for(int row=0;row<arr.length;row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

        //Enhanced for loop to get the Output
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
