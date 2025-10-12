package com.src.arrays;

import com.src.strings.ToggleCharacter;

import java.util.Scanner;

public class MoveZeroesRight {
    public void moveZeroes(int[] arr){
        int j=0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i] !=0)
            {
                arr[j]=arr[i];
                j++;
            }
        }
        while (j<arr.length)
        {
            arr[j]=0;
            j++;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int size=sc.nextInt();
        System.out.print("Enter the Array : ");
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        MoveZeroesRight mz=new MoveZeroesRight();
        mz.moveZeroes(arr);
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]);
        }
    }

//    public static void main(String[] args) {
//        int[] arr = {1,0,2,8,8,0,-8,0};
//        int i = 0 ;
//        int j = arr.length-1;
//        while(i < j){
//            if(arr[j] == 0){
//                j--;
//                continue;
//            }
//            if(arr[i] == 0){
//                int temp = arr[j];
//                arr[j] = arr[i];
//                arr[i] = temp;
//                i++;
//                j--;
//                continue;
//            }
//            i++;
//        }
//        for(int k = 0 ; k < arr.length ; k++){
//            System.out.println(arr[k]);
//        }
//    }
}
