package com.src.strings;

import java.util.Scanner;

public class ToggleCharacter {
    public void ToggleCharacterOfString(String s)
    {
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);

            if(Character.isUpperCase(ch)){
                s1 += Character.toLowerCase(ch);
            }
            else if(Character.isLowerCase(ch)){
                s1 += Character.toUpperCase(ch);
            }else{
                s1 +=ch;
            }
        }
        System.out.println("Toggle String is : "+s1);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = sc.next();
        ToggleCharacter tc=new ToggleCharacter();
        tc.ToggleCharacterOfString(s);
    }
}
