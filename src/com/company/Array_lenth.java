package com.company;

public class Array_lenth {
    public static void main(String[] args) {
        int [] marks = {100,37,94,78,67};
        System.out.println(marks.length);
        for (int i=0; i<marks.length; i++){
            System.out.println(marks[i]);

        }
        System.out.println("IN REVERSE ORDER :");
        for(int i =marks.length-1;i>=0;i--){

            System.out.println(marks[i]);
        }
    }
}