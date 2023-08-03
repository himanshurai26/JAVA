package com.constructor;

public class RectangleObject {
    public static void main(String[] args) {
        //creating rectangle using differenct constructor

        Rectangle  rec1 = new Rectangle(); // default cons
        // tructor with length 3 and width 2
        Rectangle rec2 = new Rectangle(54); //Square with side length 0
        Rectangle rec3 = new Rectangle(43,54); // Rectangle with length43 and width 54

        //calculating and displaing area

        System.out.println("Area of Rectangle 1: " + rec1.culaculateArea());
        System.out.println("Area of Rectangle 2: " + rec2.culaculateArea());
        System.out.println("Area of Rectangle 3: " + rec3.culaculateArea());

    }
}
