package com.FromQNOTwoNine;

public class Difference_Static_Instance {

    public static void main(String[] args) {
        display();  // calling without object

        Difference_Static_Instance obj = new Difference_Static_Instance();

        obj.show();
    }

    static void display(){
        System.out.println("Java Programming is Amazzing ..");
    }

    void show(){

        System.out.println("Java language is awesome");
    }
}
