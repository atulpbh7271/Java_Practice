package com.src.problem;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args){
       // int bin = 1010;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter of Boolean value : ");
        int bin = sc.nextInt();

        int decimal=0;

        for(int i=0;bin !=0;i++){
            int lastdigit = bin % 10;
            decimal = (int) (decimal + lastdigit * Math.pow(2,i));
            bin = bin /10;
        }
        System.out.println("Decimal number is : "+decimal);
    }
}
