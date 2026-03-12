package com.src.problem;

import java.util.Scanner;

//Example
//Input : 6 28
//Output : Yes, they are a friendly pair
//Explanation : The factors of 6 and 28 except the numbers themselves are 1, 2, 3 and 1, 2, 4, 7, 14 respectively.
//Now the sum of factors of both the numbers are 6 and 28 respectively.
//When we divide the sums with the numbers we get 1 and 1 respectively.
//As the ratio of both the number match, they are considered as a friendly pair.

public class FriendlyOrNot {

    // Optimized function to calculate sum of proper divisors
    public static int sumOfDivisors(int num) {

        int sum = 1;   // 1 is always a divisor

        for (int i = 2; i * i <= num; i++) {

            if (num % i == 0) {

                if (i == num / i)   // perfect square case
                    sum += i;
                else
                    sum += i + (num / i);
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number 1 : ");
        int num1 = sc.nextInt();

        System.out.print("Enter Number 2 : ");
        int num2 = sc.nextInt();

        int sum1 = sumOfDivisors(num1);
        int sum2 = sumOfDivisors(num2);

        double ratio1 = (double) sum1 / num1;
        double ratio2 = (double) sum2 / num2;

        if (ratio1 == ratio2)
            System.out.println(num1 + " & " + num2 + " are Friendly Pair");
        else
            System.out.println(num1 + " & " + num2 + " are Not Friendly Pair");
    }
}

//public class FriendlyOrNot {
//
//    // Method to calculate sum of proper divisors
//    public int sumOfFactors(int num) {
//        int sum = 0;
//
//        for (int i = 1; i < num; i++) {
//            if (num % i == 0) {
//                sum += i;
//            }
//        }
//
//        return sum;
//    }
//
//    public void FindFriendlyOrNot(int num1, int num2) {
//
//        int sum1 = sumOfFactors(num1);
//        int sum2 = sumOfFactors(num2);
//
//        double ratio1 = (double) sum1 / num1;
//        double ratio2 = (double) sum2 / num2;
//
//        if (ratio1 == ratio2)
//            System.out.println(num1 + " & " + num2 + " are friendly pairs");
//        else
//            System.out.println(num1 + " & " + num2 + " are not friendly pairs");
//    }
//
//    public static void main(String[] args) {
//
//        FriendlyOrNot frn = new FriendlyOrNot();
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter Number 1: ");
//        int num1 = sc.nextInt();
//
//        System.out.print("Enter Number 2: ");
//        int num2 = sc.nextInt();
//
//        frn.FindFriendlyOrNot(num1, num2);
//    }
//}