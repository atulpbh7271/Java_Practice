package com.src.starPattern;

import java.util.Scanner;

public class SquareStar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++)//rows
        {
            for (int j = 0; j < num; j++)//columns
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
