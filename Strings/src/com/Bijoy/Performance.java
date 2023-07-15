package com.Bijoy;

public class Performance {
    public static void main(String[] args) {
        String series = "";
//                for(int i =0 ; i<=26 ; i++){
//                    char ch = (char)('a'+i);
//                    System.out.println(ch);
//                }
        for(int i =0 ; i<26 ; i++){  //New Object is being created every time ,due to String immutibility property
            char ch = (char)('a'+i); // Object can't be modified once it created ,So the time complexity will O(N^2)
           series = series + ch ;
        }
        System.out.println(series);
    }
}
