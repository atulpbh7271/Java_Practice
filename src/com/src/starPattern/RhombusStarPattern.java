package com.src.starPattern;

import java.util.Scanner;

public class RhombusStarPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row and col : ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        for(int i=0;i<row;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<col;k++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
