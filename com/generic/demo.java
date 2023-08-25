package com.generic;

import java.util.*;

public class demo {
    public static void main(String[] args) {
  // this is concept of generic class
        // this is not generic class it just for conceptual purpose.
        List<String> list = new ArrayList<>();
//      list.add(45);*/

        List anotherlist = new ArrayList();
        anotherlist.add(34);

        list.add("Himanshu");
        anotherlist.add("Himanshu");

        System.out.println(list);
        System.out.println(anotherlist);

        }
    }

