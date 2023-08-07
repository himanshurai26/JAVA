package com.FromQNOTwoNine;

public class StringMethods {
    public static void main(String[] args) {



        String name = "Doing Java Programming", u = "";

        System.out.println(name);

        //finding length of String
        int length = name.length();

        System.out.println("Number of Character is: " + length);



      String replace1 = name.replace("Doing", "Learning");

        System.out.println(replace1);

        // concate

        String add = name.concat(" and it is Fun");

        System.out.println(name);
        System.out.println(add);

    }
}