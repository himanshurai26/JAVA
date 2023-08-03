package com.constructor;

public class ConstOverloading {
    int a;
    double b;
    String c;

    public ConstOverloading()
    {
        a = 100;
        b = 32.33;
        c = "Himanshu ";
    }

     public ConstOverloading(int x )
     {
         a = x;
     }

     public ConstOverloading(int  x, double y)
     {
         a = x;
         b = y;
     }

     public ConstOverloading(int x, double y, String z)
     {
         a = x;
         b = y;
         c = z;
     }
}
