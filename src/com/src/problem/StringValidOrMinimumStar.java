package com.src.problem;

import java.util.Scanner;

public class StringValidOrMinimumStar {
    public static void main(String[] args){
        // if * = # = 0
        // if * < # = -1
        // if * > # = 1
        //String str="*#**#*#";

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter of String value * or # : ");
        String str=sc.next();
        int starCount = 0;
        int hashCount = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='*'){
                starCount++;
            }else if(str.charAt(i)=='#'){
                hashCount++;
            }
        }

        System.out.println(starCount - hashCount);

    }
}
