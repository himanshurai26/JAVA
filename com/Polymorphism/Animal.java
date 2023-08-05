package com.Polymorphism;

public class Animal {

    public void sound(){
        System.out.println("animals makes Sounds .....");
    }
}

class Bird extends Animal{

    @Override
    public void sound() {
        super.sound();

        System.out.println("birds is chirping ...........");
    }
}

class Cat extends Animal{

    @Override
    public void sound() {
        super.sound();

        System.out.println("Cat is making sound meows ");
    }
}
