package com.Polymorphism;

public class Programmer extends Employee{
    private double baseSalary;
    private double overtimePay;

    public Programmer(String name, double baseSalary, double overtimePay){

        super(name, "Java Developer");
        this.baseSalary = baseSalary;
        this.overtimePay = overtimePay;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + overtimePay;
    }
}
