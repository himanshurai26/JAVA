package com.com.Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(4);
        set.add(7);

        System.out.println("Size of set is " + set.size());
        System.out.println(set);

        set.remove(4);

        System.out.println(set.contains(4));
        System.out.println(set);

        if(!set.contains(4)){
            System.out.println("This items is deleted..");
        }
        if(set.contains(1)){
            System.out.println("set contains 1 ");
        }else {
            System.out.println("set contains 2");
        }

        Iterator it = set.iterator();
while (it.hasNext()){
    System.out.print(it.next() + " ");
}

    }
}
