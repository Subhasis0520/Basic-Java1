package com.company;

import java.util.Scanner;

public class Sumofevennumbers {
    public static void main(String[] args) {
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i< n; i++){
            sum = sum + (2*i);
        }
        System.out.print("The sum of n even numbers :");
        System.out.println(sum);
    }
}