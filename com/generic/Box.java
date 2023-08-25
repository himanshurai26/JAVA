package com.generic;

public class Box<T> {
    // going to use generic in this class....


    //Object cclass is top most parent class of all java clases

   T container;

    public Box(T container){
        this.container = container;
    }

    public void performSomeTask(){
        if(container instanceof String){
            System.out.println("Length of " + container + " is " + ((String) this.container).length());
        }else if(container instanceof Integer){
            System.out.println("Length of " + container + " is " + container);
        }

    }
    public T getValue(){
        return this.container;
    }


}
