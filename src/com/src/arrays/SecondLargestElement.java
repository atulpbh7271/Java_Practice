package com.src.arrays;

import java.util.Scanner;

public class SecondLargestElement {

    public int secondLargest(int[] arr){

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num : arr){

            if(num > largest){
                secondLargest = largest;
                largest = num;
            }
            else if(num > secondLargest && num != largest){
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        SecondLargestElement sl = new SecondLargestElement();

        int result = sl.secondLargest(arr);

        System.out.println(result);
    }
}