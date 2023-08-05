package com.Polymorphism;

public class Employee {
    //write a java program to create a class employee with a method caled calculate=Salart

    private String name;
    private String role;

    public Employee(String name, String role){
        this.name = name;
        this.role = role;

    }

    public String getName(){
        return name;
    }

    public String getRole(){
        return role;
    }

    public double calculateSalary()
    {
        return  0.0;
    }
}
