package com.Polymorphism;

public class VehicleObject {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        MotorCycle motor = new MotorCycle();

        System.out.println("Car initial speed is : " + car.getSpeed());
        System.out.println("Motocycle initial speed is : " + motor.getSpeed());

        car.speedUp();
        motor.speedUp();


        System.out.println("\n car speed after speeding up is : " + car.getSpeed());
        System.out.println("Mototcycle speed after speeding up : " + motor.getSpeed());
    }
}
