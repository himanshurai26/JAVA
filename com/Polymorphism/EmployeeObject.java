package com.Polymorphism;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee emp1 = new Manager("Raunak Kumar", 6794, 5000);
        Employee emp2 = new Programmer("Himanshu kumar", 40000, 2300);

        System.out.println("Manager: " + emp1.getName());
        System.out.println("Role : " + emp1.getRole());
        System.out.println("Salary : " + emp1.calculateSalary());

        System.out.println("**************************************************");

        System.out.println("Programmer: " + emp2.getName());
        System.out.println("ROle : " + emp2.getRole());
        System.out.println("Salary : " + emp2.calculateSalary());
    }
}
