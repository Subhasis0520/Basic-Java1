package com.company;

import java.util.Scanner;

public class For_loop {
    public static void main(String[] args) {
        System.out.println("Enter the value of n :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        for (i = 0; i < n; i++){
            System.out.println(2 * i + 1);
        }
    }
}
