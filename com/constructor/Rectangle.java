package com.constructor;


//example of constructor overloading in java........
public class Rectangle {
    private int length;
    private int width;


    //constructor with no parameter

    public Rectangle()
    {
        this.length = 3;
        this.width = 2;
    }

    //COnstructor with one parameter

    public Rectangle(int sideLenght)
    {
        this.length = sideLenght;
        this.width = sideLenght;
    }

    //constructor with 2 parameter

    public Rectangle(int length, int width)
    {
        this.length = length;
        this.width = width;
    }


    //method to calculate the area of the rectangle
    public int culaculateArea()
    {
        return length * width;
    }


}
