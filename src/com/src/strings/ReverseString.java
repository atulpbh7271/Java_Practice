package com.src.strings;

import java.util.Scanner;

public class ReverseString {

    public String stringReverse(String str) {
//        String reversed = new StringBuilder(str).reverse().toString();
//        return reversed;

        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        ReverseString sr = new ReverseString();
        String result = sr.stringReverse(input);

        System.out.println("Reversed string: " + result);

        sc.close();
    }
}
