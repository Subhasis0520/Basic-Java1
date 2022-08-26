package com.company;

import java.util.Scanner;

public class Condition2 {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>60){
            System.out.println("You are exprience");
        }
        else if(age>45){
            System.out.println("You are semi-exprience");
        }
        else if(age>30){
            System.out.println("You are beginners");
        }
        else {
            System.out.println("You are not exprience");
        }
    }
}
