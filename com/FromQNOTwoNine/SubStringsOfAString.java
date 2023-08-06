package com.FromQNOTwoNine;

import java.util.Scanner;

public class SubStringsOfAString {

    //Question Number 30
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to print SubString");

        String str = sc.nextLine();

        int length = str.length();
        System.out.println("input String are: " + str);

        for(int start = 0; start < length; start++){
            for(int end = start + 1; end <= length; end++){
                System.out.println(str.substring(start, end));
            }
        }
        }
    }

