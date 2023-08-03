package com.constructor;

public class Student {
    String  name;
    int age;
    int rollNumber;
    String city;

    public Student(String name, int age, int rollNumber, String city)
    {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.city = city;
    }
    public void display()
    {
        System.out.println("Name of Student is : " + name);
        System.out.println("Age of Studenti is : " + age);
        System.out.println("Roll Number of student is : " + rollNumber);
        System.out.println("City of Student is : " + city);
    }
}
