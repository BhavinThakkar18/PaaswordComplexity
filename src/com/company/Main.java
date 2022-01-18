package com.company;

import java.util.Locale;

public class Main {
    public static boolean isPsswordComplex(String s)
    {
        //should contain atleast one UpperCase
        //atleast one LowerCase
        //atleast one Digit
        return  (s.chars().anyMatch(Character::isUpperCase) && s.chars().anyMatch(Character::isLowerCase) && s.chars().anyMatch(Character::isDigit));
    }
    public static String normalizeString(String s)
    {
        //Remove extra spaces
        //convert all characters in lowercase
        //replace , with space if it occures in  the string
        return (s.toLowerCase().trim().replace(",",""));
//        String lowercased=s.toUpperCase();
//        String trimmed=lowercased.trim();
//        String normalized = trimmed.replace(",",,"");
    }
    public static boolean isAtEvenIndex(String s,char item)
    {
        if(s==null || s.isEmpty())
        {
            return false;
        }
        for(int i=0;i<s.length()/2+1;i+=2)
        {

            if(s.charAt(i)==item)
            {
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
//        System.out.println(isPsswordComplex("Abc@123"));
//        System.out.println(isPsswordComplex("abc@123"));
//        System.out.println(normalizeString("  Hello There, Buddy!"));
        System.out.println(isAtEvenIndex("HeLLo",'L'));
        System.out.println(isAtEvenIndex("HeLLo",'T'));
        System.out.println(isAtEvenIndex("HeLLo",'H'));
        System.out.println(isAtEvenIndex("",'L'));
        System.out.println(isAtEvenIndex(null,'L'));
    }
}
