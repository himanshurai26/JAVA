package com.hashMap;

import java.util.HashMap;
import java.util.Set;

public class Interaation2 {
    public static void main(String[] args) {

        HashMap<String,Integer> score = new HashMap<>();
        score.put("Himanshu", 24);
        score.put("Priyanshu", 45);
        score.put("Raunak", 34);

        //iteration

        Set<String> keys = score.keySet();

        for(String key : keys){
            System.out.println("Key = " + score.get(key));
        }
 
    }
}
