package com.src.strings;

import java.util.Scanner;

public class LenWithOutFunction {
    //Method to find length without using .length()
    public void FindLenWithOutFunction(String s)
    {
        int length = 0;
        try {
            while (true) {
                s.charAt(length); // will throw exception when out of range
                length++;
            }
        } catch (Exception e) {
            // When IndexOutOfBoundsException occurs, loop stops
        }

        System.out.println("Length of String is : "+length);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = sc.next();
        LenWithOutFunction lf=new LenWithOutFunction();
        lf.FindLenWithOutFunction(s);

    }

}
