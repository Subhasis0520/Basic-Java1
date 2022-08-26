package com.company;

import java.util.Scanner;

public class Pass_Fail {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks of Mathematics");
        int m1 = sc.nextInt();
        System.out.println("Enter your marks of Physics");
        int m2 = sc.nextInt();
        System.out.println("Enter your marks of Computer");
        int m3 = sc.nextInt();
        float avg = (m1 + m2 + m3)/3.0f;
        System.out.println("Your average percentage is: " + avg);
        if(avg>40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congragulations, You have been Pass.");
        }
        else {
            System.out.println("Sorry , You have been Fail, Try agian.");
        }
    }
}
