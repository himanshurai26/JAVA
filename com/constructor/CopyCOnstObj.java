package com.constructor;

public class CopyCOnstObj {
    public static void main(String[] args) {
        CopyConst obj1 = new CopyConst();
        CopyConst obj2 = new CopyConst(obj1);

       /* System.out.println(obj1); // this will print address of object1
        System.out.println(obj2);*/ // this will print address of object2
    }
}
