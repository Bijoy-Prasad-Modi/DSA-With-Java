package com.Bijoy;

public class SB {
    public static void main(String[] args) {
StringBuilder builder = new StringBuilder() ; //As we are using String Builder Method ,New Object will not being created for every iteration
        for(int i =0 ; i<26 ; i++){  //Rather the new character will be added to the object and the object will be modified
            char ch = (char)('a'+i); //and to Add N objects ,N iterations is needed ,So the time complexity will be O(N)
            builder.append(ch) ;
        }
        System.out.println(builder.toString());

        builder.deleteCharAt(0) ;
        System.out.println(builder);
    }
}
