package com.company;

import java.util.Scanner;

public class Checking_IntegerinArray {
    public static void main(String[] args) {
        System.out.println("Enter the number you want to check :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] marks = {10,22,36,87,48,102};
        boolean isInArray = false;
        for (int element : marks){
            if(element == num){
                isInArray = true;
                break;
            }
        }
if(isInArray){
    System.out.println("The element is in the array");
}
else{
    System.out.println("The element is not in the array");
}
    }
}
