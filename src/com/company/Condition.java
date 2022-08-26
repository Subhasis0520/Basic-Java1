package com.company;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
       int age = sc.nextInt();

        if(age>18){
            System.out.println("Boy you can drive");
        }
        else{
            System.out.println("Boy you cannot drive yet");
        }
    }
}
