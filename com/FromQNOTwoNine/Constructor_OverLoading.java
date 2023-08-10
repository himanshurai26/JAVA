package com.FromQNOTwoNine;

public class Constructor_OverLoading {
    String name;

    public Constructor_OverLoading(){
        System.out.println("This is constructor called method ....");
    }

    public Constructor_OverLoading(String name){
        this.name = name;
        System.out.println("My name is " +  name);
    }

    public static void main(String[] args) {
        // this is for default constructor
        Constructor_OverLoading const1  = new Constructor_OverLoading();

        //this is for parametrize constructor
        Constructor_OverLoading const2 = new Constructor_OverLoading("Himanshu");

        System.out.println(const2.name);

        const1.setName("Priyanshu");

        const2.getName();

        const1.getName();



    }
    public void setName(String name){
        System.out.println("This is setter method...");
        this.name = name;
    }

    public void getName(){
        System.out.println("this is getter method ..");
        System.out.println("My name is : " + name);
    }


}
