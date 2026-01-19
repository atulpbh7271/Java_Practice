package com.src.strings;

import java.util.Scanner;

public class NoOfVowel {

    public void findNoOfVowel(String s) {
        int count = 0;

        s = s.toLowerCase(); // convert string to lowercase

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        NoOfVowel no = new NoOfVowel();
        no.findNoOfVowel(input);

        sc.close();
    }
}

