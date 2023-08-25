package com.generic;

// Bonded type parameter in generic
public class NumberBox<T extends Number> {
    private T value;

    public NumberBox(T value){
        this.value = value;
    }

    public double getDoubleValue(){
        return this.value.doubleValue();
    }

    public static void main(String[] args) {
        NumberBox<Integer> intbox = new NumberBox<>(34);
        NumberBox<Double> dobboc = new NumberBox<>(34.56);

        System.out.println("Integer Box Double value : " + intbox.getDoubleValue());
        System.out.println("Double Box Double value" + dobboc.getDoubleValue());
    }

}
