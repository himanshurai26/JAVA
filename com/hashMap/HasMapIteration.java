package com.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HasMapIteration {
    public static void main(String[] args) {

        //creating hashmap
        HashMap<String, Integer> score = new HashMap<>();

        score.put("Himanshu", 87);
        score.put("Priyanshu", 98);
        score.put("Shashank", 95);
        score.put("Rupesh", 92);
        score.put("Suman", 84);

        //Iteration using for-each loop

          for(Map.Entry<String,Integer> entry : score.entrySet()){
              String key = entry.getKey();
             Integer value = entry.getValue();
              System.out.println("Key is = " + key + " ,  " + "Value is = " + value);
          }


    }
}
