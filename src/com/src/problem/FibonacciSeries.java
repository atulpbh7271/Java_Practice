package com.src.problem;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int a=0;
        int b=1;

        System.out.print (a + " , " + b + " , ");

        for(int i=0;i<num;i++){
            int nextTerm = a+b;
            a=b;
            b=nextTerm;
            System.out.print (nextTerm+" , ");
        }

    }
}
