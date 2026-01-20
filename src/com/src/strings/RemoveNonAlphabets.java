package com.src.strings;

import java.util.Scanner;

public class RemoveNonAlphabets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        // Remove all characters except alphabets
        s = s.replaceAll("[^a-zA-Z]", "");

        System.out.println("String after removing non-alphabet characters: " + s);

        sc.close();
    }
}
