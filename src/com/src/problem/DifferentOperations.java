package com.src.problem;

import java.util.Scanner;

public class DifferentOperations {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 number a,b,c : ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        // if c = 1 add a and b
        // if c = 2 subtract a and b
        // if c = 3 multiply a and b
        // if c = 4 divide a and b

        int result =0;
        if( c==1){
            result = a+b;
        }
        else if(c==2){
            result = a-b;
        }
        else if(c==3){
            result = a*b;
        }
        else if(c==4){
            result = a/b;
        }
        else {
            System.out.println("Enter a valid number of c between 1-4");
        }

        System.out.println("Result : "+result);
    }
}
