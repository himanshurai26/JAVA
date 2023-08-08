package com.FromQNOTwoNine;

import java.util.HashMap;



public class ishomorphic {
    public static void main(String[] args) {
        String s1 = "egg";
        String s2 = "adc";

        System.out.println(Ishomorphic(s1, s2));



    }

    public static boolean Ishomorphic(String s1, String s2){


        HashMap<Character, Character> hmap = new HashMap<Character, Character>();
        for(int i = 0; i < s1.length(); i++){
            char char1 = s1.charAt(i);
            char char2 = s2.charAt(i);

            if(hmap.containsKey(char1)){

                    if(hmap.containsKey(char2)){
                        if(hmap.get(char1) != char2){
                            return false;
                    }
                }
            }else{
                return true;
            }

        }

        return  true;
    }
}

