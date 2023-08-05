package com.Polymorphism;

public class A {

    public void add(){
        int a = 10, b = 20;
        int c = a + b;

        System.out.println(c);
    }

    public void add(int x, int y){
        int c = x + y;

        System.out.println(c);
    }

    public void add(int x,  double z){

        double c = x + z;
        System.out.println(c);
    }

    public static void main(String[] args) {
        A  ref = new A();
        ref.add();
        ref.add(65,44);
        ref.add(56,34.5);
    }
}
