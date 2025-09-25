package com.src.arrays;

public class DistinctSum {
    public static void main(String[] args)
    {
        int[] arr={10,15,25,25,20,10,15,26,9};
        int n=arr.length;
        int sum=0;

        for(int i=0;i<n;i++)
        {
            boolean flag=false;
            for(int j=0;j<n;j++)
           {
               if(i != j && arr[j]==arr[i])
               {
                   flag = true;
                   break;
               }
           }
           if(!flag)
           {
               System.out.println(arr[i]);
               sum +=arr[i];

           }

        }
        System.out.println("Sum is "+sum);
    }
}
