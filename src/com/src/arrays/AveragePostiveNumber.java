package com.src.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AveragePostiveNumber {
    public static void main(String[] args)
    {
//        int[] arr={-5,-2,-7,25,12,-11};
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr=new int[size];

        System.out.println("Enter the "+size+" Element");
        for (int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        int  sum=0;
        int count=0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]>0)
            {
                sum+=arr[i];
                count++;
            }

        }
        if(count>0)
        {
            double avg = (double)sum/count;
            System.out.println("Average of positive number is "+ avg);
        }
        else
        {
            System.out.println("No of positive number in the array");
        }
    }
}
