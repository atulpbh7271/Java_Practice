package com.src.strings;

import java.util.Arrays;

public class AnagramCheck {

//    public static boolean isAnagram(String s, String t) {
//
//        if (s.length() != t.length()) {
//            return false;
//        }
//
//        char[] sArr = s.toCharArray();
//        char[] tArr = t.toCharArray();
//
//        Arrays.sort(sArr);
//        Arrays.sort(tArr);
//
//        return Arrays.equals(sArr, tArr);
//    }
public static boolean isAnagram(String s, String t) {

    if (s.length() != t.length()) {
        return false;
    }

    int[] count = new int[26];

    for (char c : s.toCharArray()) {
        count[c - 'a']++;
    }

    for (char c : t.toCharArray()) {
        count[c - 'a']--;
    }

    for (int val : count) {
        if (val != 0) {
            return false;
        }
    }
    return true;
}

    public static void main(String[] args) {
        System.out.println(isAnagram("racecar", "carrace")); // true
        System.out.println(isAnagram("jar", "jam"));         // false
    }
}
