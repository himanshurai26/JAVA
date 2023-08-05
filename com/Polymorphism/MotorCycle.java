package com.Polymorphism;

public class MotorCycle extends Vehicle{
    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("Motorcycke spped is increased by 23 km/h");
    }
}
