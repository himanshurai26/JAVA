package com.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Interation1 {
    public static void main(String[] args) {
        //creating hashmap
        HashMap<String, Integer> score = new HashMap<>();

        score.put("Himanshu", 87);
        score.put("Priyanshu", 98);
        score.put("Shashank", 95);
        score.put("Rupesh", 92);
        score.put("Suman", 84);

        //Iterator key and value
       Iterator<Map.Entry<String, Integer>> iterator =  score.entrySet().iterator();

       while (iterator.hasNext()){
           Map.Entry<String,Integer> entry = iterator.next();

           String key = entry.getKey();
           Integer value = entry.getValue();
           System.out.println("key = " + key + " Value = " + value);
       }
    }
}
