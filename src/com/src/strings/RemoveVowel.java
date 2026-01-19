package com.src.strings;

import java.util.Scanner;

public class RemoveVowel {

    public  String removeVowels(String str){
        StringBuilder result=new StringBuilder();
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i'
                    && ch != 'o' && ch != 'u') {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            RemoveVowel rv=new RemoveVowel();
            String output = rv.removeVowels(input);

            System.out.println("String after removing vowels: " + output);

            sc.close();
        }

}
