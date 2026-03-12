package com.src.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ReplaceDuplicate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int size = sc.nextInt();
        int[] arr=new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
//        HashMap<Integer,Integer> freq = new HashMap<>();
//        for(int num:arr){
//            freq.put(num,freq.getOrDefault(num,0)+1);
//        }
//
//        for(int i=0;i<arr.length;i++){
//            if(freq.get(arr[i])>1){
//                arr[i] = -1;
//            }
//
//        }
//
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }


        for(int i = 0; i < size; i++){
            boolean duplicate = false;

            for(int j = 0; j < size; j++){
                if(i != j && arr[i] == arr[j]){
                    duplicate = true;
                    break;
                }
            }

            if(duplicate)
                System.out.print("# ");
            else
                System.out.print(arr[i] + " ");
        }

    }
}
