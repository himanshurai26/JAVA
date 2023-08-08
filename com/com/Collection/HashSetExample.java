package com.com.Collection;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> list = new HashSet<String >();

        // adding element

        list.add("apple");
        list.add("Banana");
        list.add("apple"); // this is  duplicate will not be added

        list.add("orange");

        System.out.println(list);
        // checkig if an element exits

        boolean containsapple = list.contains("apple");
        System.out.println(list.contains("Banana"));
        System.out.println(containsapple);


    }
}
