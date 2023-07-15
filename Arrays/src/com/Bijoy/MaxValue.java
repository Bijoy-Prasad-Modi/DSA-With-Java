package com.Bijoy;

import static sun.swing.MenuItemLayoutHelper.max;

public class MaxValue {
    public static void main(String[] args) {
        int [] arr= {2, 85 ,9,52,23};
       // max(arr);
        System.out.println(max(arr));
    }

    // Finding Maxvalue in the whole Arraylist
    static int max(int [] arr){
        int maxvalue = arr[0];
        for(int i=1; i<arr.length;i++){
            if(arr[i]>maxvalue){
                maxvalue= arr[i] ;
            }
        }
        return maxvalue ;
    }


}
