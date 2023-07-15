package com.Bijoy;

import java.util.Arrays;

public class SawppingElements {
    public static void main(String[] args) {
        int [] arr = {2, 8 , 9 , 5 , 1};
        swap(arr , 1 , 2);
        System.out.println(Arrays.toString(arr));
    }
    static void swap (int [] arr , int index1 ,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2]=temp;
    }
}
