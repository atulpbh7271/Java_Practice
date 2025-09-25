package com.src.arrays;

import java.util.HashMap;

public class DistinctSum {

    public  int sumOfDistinct(int[] arr,int n) {

        int sum=0;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n; j++) {
                if (i != j && arr[j] == arr[i]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(arr[i]);
                sum += arr[i];

            }
        }
        return sum;
    }
    public void sumOfDistinctHashMap(int[] arr,int n)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        for (int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1 );

            }
            else {
                map.put(arr[i],1 );
            }
        }

        for(int key:map.keySet())
        {
            if(map.get(key) == 1)
            {
                System.out.println(key);
                sum += key;
            }
        }
        System.out.println("Sum is : "+sum);
    }

    public static void main(String[] args)
    {
        int[] arr={10,15,25,25,20,10,15,26,9};
        int n=arr.length;
        DistinctSum ds=new DistinctSum();
//        int sum=ds.sumOfDistinct(arr,n);
//        System.out.println("Sum is "+sum);
//        sumOfDistinct(arr,n);
//        System.out.println( sumOfDistinct(arr,n));

        ds.sumOfDistinctHashMap(arr,n);


    }
}
