package com.com.Collection;

import java.util.HashSet;

public class HashSetCOde {

    public static void main(String[] args) {
        // Initializing a HashSet
        HashSet<String> mySet = new HashSet<>();

        // Adding Elements to a HashSet
        mySet.add("apple");
        mySet.add("banana");
        mySet.add("cherry");

        // Checking if an Element is in the HashSet
        if (mySet.contains("apple")) {
            System.out.println("Element found");
        }

        // Removing Elements from a HashSet
        mySet.remove("banana");

        // Iterating Through a HashSet
        for (String item : mySet) {
            System.out.println(item);
        }

        // Getting the Size of a HashSet
        int size = mySet.size();
        System.out.println("Size: " + size);

        // Clearing a HashSet
        mySet.clear();
    }
}
