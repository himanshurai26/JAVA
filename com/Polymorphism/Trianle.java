package com.Polymorphism;

public class Trianle extends Shape {
    private double base;
    private  double hight;

    public Trianle(double base, double hight){
        this.base = base;
        this.hight = hight;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * hight;
    }
}
