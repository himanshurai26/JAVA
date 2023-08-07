package com.FromQNOTwoNine;

public class SplitExample {
    public static void main(String[] args) {


        String name = "This is split Example ";
        String[] words = name.split("\s");

        for (String word : words) {
            System.out.println(word);
        }

    }
}
