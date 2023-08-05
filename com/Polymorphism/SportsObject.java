package com.Polymorphism;

public class SportsObject {
    public static void main(String[] args) {
        Sports sports = new Sports();
        FootBall footBall = new FootBall();
        Cricket cricket = new Cricket();

        sports.play();
        footBall.play();
        cricket.play();
    }
}
