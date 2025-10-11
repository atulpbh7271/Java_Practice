package com.src.strings;

import java.util.Scanner;

public class AlphabetOrNot {
    public void CheckAlphabetOrNot(char ch){
        if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z')
        {
            System.out.println(ch + " is Alphabet");
        }else{
            System.out.println(ch + " is not Alphabet");
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a charater : ");
        char ch = sc.next().charAt(0);
        AlphabetOrNot an=new AlphabetOrNot();
        an.CheckAlphabetOrNot(ch);

    }
}
