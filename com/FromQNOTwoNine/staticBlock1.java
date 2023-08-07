package com.FromQNOTwoNine;

public class staticBlock1 {
    public static void main(String[] args) {
        System.out.println("You are using windows Operating System....");
    }

    static {
        String os  = System.getenv("OS");
        if(os.equals("Window_NT") != true){System.exit(1);
        }
    }
}
