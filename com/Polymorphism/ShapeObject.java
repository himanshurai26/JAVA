package com.Polymorphism;

public class ShapeObject {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.calculateArea();

        System.out.println("*************************");

        Circle  circle = new Circle(6);
        System.out.println("Area of circle is : " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(76.4,65.67);

        System.out.println("Area of Rectangle is : " + rectangle.calculateArea());

        Trianle trianle = new Trianle(65.45,2);

        System.out.println("The Area of Traingle is : " + trianle.calculateArea());
    }
}
