package com.src.strings;

import java.util.Scanner;

public class VowelOrConsonant {

    public void checkVowelOrConsonant(char ch) {

        if (ch >= 'a' && ch <= 'z') {
            ch = (char)(ch - 32);
        }
        if (ch >= 'A' && ch <= 'Z') {
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println(ch + " is not an alphabet character.");
        }

    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a charater");
        char ch = sc.next().charAt(0);

       VowelOrConsonant voc = new VowelOrConsonant();
       voc.checkVowelOrConsonant(ch);
    }
}
