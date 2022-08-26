package com.company;

public class AdditionOfTwo_Matrics {
    public static void main(String[] args) {
        int [][] mat1 ={{6 , 9 , 11},
                        {7 , 5 , 3}};
        int [][] mat2 ={{4 , 8 , 1},
                        {3 , 9 , 23}};
        int [][] result ={{0 , 0 , 0},
                          {0 , 0 , 0}};
        for(int i=0; i<mat1.length; i++){
            for(int j=0; j<mat1[i].length; j++) {

                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
