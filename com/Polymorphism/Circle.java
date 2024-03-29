package com.Polymorphism;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
      /*  return super.calculateArea();*/
        return Math.PI * radius * radius;
    }
}
