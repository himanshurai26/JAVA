package com.FromQNOTwoNine;

public class Computer {

    Computer(){
        System.out.println("This is constructor of computer class....");
    }

    void computer_method(){
        System.out.println("This is method that describe about computer function");
        System.out.println("Power gone! Shut down your PC soon....");
    }

    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.computer_method();
        System.out.println("********************************");
        Laptop laptop = new Laptop();
        laptop.lapto_method();
    }
}


