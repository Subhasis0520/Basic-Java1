package com.company;


import java.util.Scanner;

public class Example_SwitchCase {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
       int age= sc.nextInt();
        switch (age) {
            case 18 -> System.out.println("You are going to be adult!");
            case 23 -> System.out.println("You are going to get a Job!");
            case 60 -> System.out.println("You are going to be Retired!");
            default -> System.out.println("Enjoy your Life!");
        }

}




}
