package com.Polymorphism;

public class Animal_Object {
    public static void main(String[] args) {
       /* Cat obj = new Cat();
        obj.sound();*/
        // or we can write in
        Animal animal = new Animal();
        Bird bird = new Bird();
        Cat cat = new Cat();

        animal.sound();
        bird.sound();
        cat.sound();
    }
}
