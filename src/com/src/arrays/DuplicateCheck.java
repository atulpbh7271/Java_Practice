package com.src.arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCheck {

    public boolean checkArray(int[] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    return true;
//                }
//            }
//        }
//        return false;
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        DuplicateCheck dc = new DuplicateCheck();
        boolean result = dc.checkArray(arr);


        System.out.println(result);

        sc.close();
    }
}
