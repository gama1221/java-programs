package com.gama1221.problems;

import java.util.Scanner;

/**
 *
 * Palindrome number in java: A palindrome number is a number that is same after reverse.
 * For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers.
 * It can also be a string like LOL, MADAM etc.
 * Solution
 *      change the number to string
 *      compare the original and the changed one
 *          if they are same, it is palindrome
 *          else, not palindrome
 *
 */

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls enter string");
        String num = sc.next();
        System.out.println(isPalindrome(num));
    }
    public static StringBuilder isPalindrome(String input){
        StringBuilder reverse = new StringBuilder();
        for (int i=input.length()-1;i>=0;i--){
            reverse.append(input.charAt(i));
        }
       return new StringBuilder(input.contentEquals(reverse) ? "Palindrome" : "Not Palindrome");
    }
}