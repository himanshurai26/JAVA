package com.com.Collection;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Scanner;

public class HashSet2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<Integer> set = new HashSet<>(10);

        for(int i= 0; i < 10; i++){
            int num = sc.nextInt();
            set.add(num);
        }

        /*for(int num : set){
            System.out.println(num);
        }*/

        for(int i = 0; i < set.size(); i++){
            System.out.print(i);
        }


    }
}
