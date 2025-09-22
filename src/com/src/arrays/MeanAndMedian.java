package com.src.arrays;

import java.util.Arrays;

public class MeanAndMedian {
    public static void main(String[] args)
    {
        int[] arr={1,3,4,7,9,11};

        Arrays.sort(arr);
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum +=arr[i];
        }
        double mean= (double) sum / arr.length;
        double median;
        if(arr.length % 2 == 0)
        {
            median = (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2.0;
        }else {
            median= arr[arr.length / 2 ];
        }
        System.out.printf("Mean = %.2f\n", mean);
        System.out.printf("Median = %.2f\n", median);

    }
}
