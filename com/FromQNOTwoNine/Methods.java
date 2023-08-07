package com.FromQNOTwoNine;

public class Methods {

    // constructor method

    public Methods(){
        System.out.println("COnstructor is colled when an object is created....");

        // method where program excution begins


    }

     static void staticMethod(){
        System.out.println("Static method can be called without creating object...");
    }

    public void nonStaticMethod(){
        System.out.println("This is is non static method it will called when object is created ...");
    }

    public static void main(String[] args) {

        Methods obje = new Methods();
        staticMethod();
        obje.nonStaticMethod();
    }
}
