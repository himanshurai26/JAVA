package com.generic;

import java.time.chrono.MinguoChronology;

public class Generic_Main {
    public static void main(String[] args) {
        Generic1<String> obj1 = new Generic1<>("This is String in Generic");
        obj1.setValue("My Name is Himanshu Kumar");

        obj1.getValue();
        System.out.println(obj1.getValue());
    }
}
