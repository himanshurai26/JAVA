package com.FromQNOTwoNine;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("Mani method is excutedd.....");
    }

    static {
        System.out.println("Static block is excuted before main method");
    }


    static {
        String os  = System.getenv("OS");
        if(os.equals("Window_NT") != true){System.exit(1);
        }
    }
}
    // static block application ... we need to open program in spefic window


