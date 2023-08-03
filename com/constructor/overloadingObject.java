package com.constructor;

public class overloadingObject {
    public static void main(String[] args) {
        ConstOverloading obj1 = new ConstOverloading();
        ConstOverloading obj2  = new ConstOverloading(4);
        ConstOverloading obj3 = new ConstOverloading(65, 34);
        ConstOverloading  obj4 = new ConstOverloading(43, 99, "Himanshu Kumar");

        System.out.println("This is object1 :" + obj1.a + " " + obj1.b + " " + obj1.c);
        System.out.println("This is Object2 : " + obj2.a);
        System.out.println("This is Object3 : " + obj3.a + " " + obj3.b);
        System.out.println("This is Object4 : " + obj4.a + " " + obj4.b + " " + obj4.c);
    }
}
