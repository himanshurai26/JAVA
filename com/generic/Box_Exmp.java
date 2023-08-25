package com.generic;

public class Box_Exmp {
    public static void main(String[] args) {
 Box<String> box = new Box<String>("This is generic class");
   Box<Integer> box1 = new Box<Integer>(45);

        System.out.println(box.getValue())
        ;
        System.out.println(box1.getValue());
        System.out.println(box.container.getClass().getName());
        System.out.println(box1.container.getClass().getName());
        box.performSomeTask();
        box1.performSomeTask();
    }
}
