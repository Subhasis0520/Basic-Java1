package com.company;

import java.util.Scanner;

public class Website_Test {
    public static void main(String[] args) {
        System.out.println("Enter the website name :");
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("This is an organizational website");
        }

       else if (website.endsWith(".com")) {
            System.out.println("This is a commercial website");
        }
       else if(website.endsWith(".in")) {
            System.out.println("This is an Indian website");
        }
    }
}
