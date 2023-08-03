package com.constructor;

public class CopyConst {
    int num1;
   String name;

   public CopyConst()
   {
       this.num1 = 43;
       this.name = "Himanshu kumar";

       System.out.println(num1 + " " + name);

   }

   public CopyConst(CopyConst ref)
   {
       num1 = ref.num1;
       name = ref.name;

       System.out.println("copy : " + num1 + " " + name);
   }
}
