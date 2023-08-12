package com.Exception.handling;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Input two Integer");

        int a = sc.nextInt();
        int b = sc.nextInt();

        // handling error using try and chache

        try{
            int result = a/b;

            System.out.println("Resul is : " + result);
        }
        catch (ArithmeticException e){
            System.out.println("Exception caught: Devision by Zero....");
        }

    }

}
