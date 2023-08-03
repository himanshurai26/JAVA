package com.constructor;

import javax.swing.text.Style;

public class StudentObject {
    public static void main(String[] args) {
        Student obj1 = new Student("Himanshu Kumar", 22, 3, "kalkaji New Delhi");
        Student obj2 = new Student("Priyanshu Kumar", 19, 54, "Kolkata");

        System.out.println("Student number 1 ");
   obj1.display();
        System.out.println("***************************************************");

        System.out.println("Student number 2");
   obj2.display();

    }
}
