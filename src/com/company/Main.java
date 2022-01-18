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
    public static String reversedString(String s)
    {
        if(s==null || s.isEmpty())
        {
            return s;
        }
        StringBuilder reversed = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }
    public static String reversedString2(String s)
    {
        if(s==null || s.isEmpty())
        {
            return s;
        }
        StringBuilder reversed = new StringBuilder(s);
        return reversed.reverse().toString();
    }
    public static String reverseEachWord(String s)
    {
        String outputString="";
        if(s==null || s.isEmpty())
        {
            return s;
        }
        String[] inputWords= s.split("\\s");
        for(int i=0;i<inputWords.length;i++)
        {
            String word = inputWords[i];
            for(int j = word.length()-1; j>=0; j--)
            {
                outputString+=(word.charAt(j));
            }
            if(i!=inputWords.length-1)
            {
                outputString+=" ";
            }
        }
        return outputString;

    }
    public static void main(String[] args) {
//        System.out.println(isPsswordComplex("Abc@123"));
//        System.out.println(isPsswordComplex("abc@123"));
//        System.out.println(normalizeString("  Hello There, Buddy!"));
//        System.out.println(isAtEvenIndex("HeLLo",'L'));
//        System.out.println(isAtEvenIndex("HeLLo",'T'));
//        System.out.println(isAtEvenIndex("HeLLo",'H'));
//        System.out.println(isAtEvenIndex("",'L'));
//        System.out.println(isAtEvenIndex(null,'L'));
//          System.out.println(reversedString("Hello World!")); //!dlroW olleH
//          System.out.println(reversedString2("Hello World!"));
         System.out.println(reverseEachWord("Hello World!"));
    }
}
