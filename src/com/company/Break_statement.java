package com.company;

public class Break_statement {
    public static void main(String[] args) {
       for ( int i = 0; i < 5; i++){
           System.out.println("Enter the code");
           System.out.println(i);
           if(i == 2){
               System.out.println("End the code");
               break;
           }
        }
    }
}