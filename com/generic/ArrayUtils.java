package com.generic;

// this code contains generid methods
public class ArrayUtils {
    public static <T> void printArray(T[] array){

        for(T element : array){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intarray = {3, 45, 23, 65, 34, 74, 35};

        String[] strArray = {"Himanshu", "Priyanshu", "Raunak"};

        ArrayUtils.printArray(intarray);
        ArrayUtils.printArray(strArray);
    }
}
