package com.hashMap;

import java.util.HashMap;

public class Hashing {
    public static void main(String[] args) {
        // country(key) and papulation = value

        HashMap<String, Integer> map = new HashMap<String,Integer>();

        // Inserting element
        map.put("India", 134);
        map.put("China", 120);
        map.put("Pakishan", 24);
        map.put("USA", 110);
        map.put("Australia", 86);
        map.put("bangladesh", 34);

        System.out.println(map.size());

        map.put("China", 140);
        System.out.println(map);

        //searching
        if(map.containsKey("India")){
            System.out.println("India is present in the map..");
        }else{
            System.out.println("India is not present in the map......");
        }

    }
}
