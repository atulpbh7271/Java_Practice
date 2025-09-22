package com.src.starPattern;

import java.util.Scanner;

public class RightAlignedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int num = sc.nextInt();
        int num = 5;
        for(int i=1;i<=num;i++)
        {
            for(int j=i;j<num;j++)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }

    }

}
