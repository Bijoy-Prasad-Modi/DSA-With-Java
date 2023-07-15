package com.Bijoy;

public class PrettyPrint {
    public static void main(String[] args) {
        float a = 32.84622f;
        System.out.printf("the Formated number is %.2f",a); //we use .2f decide how many numbers will be print after decimal value
        System.out.println(Math.PI);
        System.out.printf("pie: %.3f",Math.PI); //it will print only 3 number after decimal of PI value
        System.out.printf("Myself %s and I'M taking %s decesions","Bijoy","Wrong");
    }
}
