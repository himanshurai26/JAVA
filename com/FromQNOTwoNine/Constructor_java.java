package com.FromQNOTwoNine;

public class Constructor_java {

    public Constructor_java(){
        System.out.println("This is Constructor method called..");
    }

    public static void main(String[] args) {
        Constructor_java constructor = new/* this is dynamic memory allocation*/ Constructor_java(); // creating object

    }
}
