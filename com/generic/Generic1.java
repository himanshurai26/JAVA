package com.generic;

public class Generic1<T> {
    private T value;

    public Generic1(T value){
        this.value = value;
        System.out.println("This is constructor in generic and it has one parameter.." + value);
    }

    public void setValue(T value){
        this.value = value;
        System.out.println("This is setter method to set the value");
    }

    public T getValue(){
        return this.value;

    }
}
