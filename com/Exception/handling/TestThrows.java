package com.Exception.handling;

public class TestThrows {
    static void validate(int age){
        if(age < 18){
            throw new ArithmeticException("Not valid...");
        }else{
            System.out.println("Welcome to vote for Himanshu kumar");
        }
    }

    public static void main(String[] args) {
        validate(12);
        System.out.println("This is rest of the code........");
    }
}
