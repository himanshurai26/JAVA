package com;

public class StringEndwith {
    public static void main(String[] args) {
        String name = "My Name is Himanshu Kumar";

        System.out.println(name.endsWith("kumar"));
        System.out.println(name.endsWith("Kumar"));
        System.out.println(name.endsWith("Rai"));
        System.out.println(name.endsWith("r"));
        System.out.println(name.endsWith("Himanshu Kumar"));
    }
}
