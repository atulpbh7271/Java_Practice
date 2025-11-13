package com.src.problem;

import java.util.Scanner;

public class SwapTwoNoOneLine {
    public static void main(String[] args){
//        int a= 10;
//        int b= 5;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two number : ");
        int a= sc.nextInt();
        int b= sc.nextInt();

        a = a^b^(b=a);

        System.out.println("a : "+a+","+"b : "+b);
    }
}
