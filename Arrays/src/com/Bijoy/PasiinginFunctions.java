package com.Bijoy;

import java.util.Arrays;

public class PasiinginFunctions {
    public static void main(String[] args) {
        int [] arr ={8,5,9,7,6} ;
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] arr){
arr[0]=99;
    }
}
