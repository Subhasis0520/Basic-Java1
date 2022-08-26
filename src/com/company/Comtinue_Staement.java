package com.company;

public class Comtinue_Staement {

    public static void main(String[] args) {
        int i = 0;
        do {
            i++;
            if (i == 2) {
                System.out.println("Ending the loop");
                continue;
            }

            System.out.println("Enter the code");
            System.out.println(i);
        } while (i < 7);
    }
}