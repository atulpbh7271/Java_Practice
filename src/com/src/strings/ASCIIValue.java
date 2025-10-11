package com.src.strings;

import java.util.Scanner;

public class ASCIIValue {
    public void CheckASCIIValue(char ch)
    {
        int i = ch;
        System.out.println("ANCII Value of "+ch+ " is "+i);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a charater : ");
        char ch = sc.next().charAt(0);
        ASCIIValue av= new ASCIIValue();
        av.CheckASCIIValue(ch);

    }
}
