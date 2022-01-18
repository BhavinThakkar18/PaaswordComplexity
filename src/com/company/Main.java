package com.company;

public class Main {
    public static boolean isPsswordComplex(String s)
    {
        //should contain atleast one UpperCase
        //atleast one LowerCase
        //atleast one Digit
        return  (s.chars().anyMatch(Character::isUpperCase) && s.chars().anyMatch(Character::isLowerCase) && s.chars().anyMatch(Character::isDigit));
    }
    public static void main(String[] args) {
        System.out.println(isPsswordComplex("Abc@123"));
        System.out.println(isPsswordComplex("abc@123"));
    }
}
