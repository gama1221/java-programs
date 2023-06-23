package com.gama1221.problems;

import java.util.Scanner;

/**
 * Buzz number is another special number in Java that ends with digit 7 or divisible by 7.
 * Unlike Prime and Armstrong numbers, the Buzz number is not so popular and asked by the interviewers.
 * Let's take some examples of Buzz numbers.
 * 42 is a Buzz number because it is divisible by 7.
 * 107 is a Buzz number because it ends with 7.
 * 147 is a Buzz number because it ends with 7 and also divisible by 7.
 * 134 is not a Buzz number because it is neither end with 7 nor divisible by 7.
 */

public class BuzzNumbers {
    public static void main(String[] args) {
        System.out.println("Enter a number to be checked Buzz Number");
        Scanner sc = new Scanner(System.in);
        System.out.println(checkBuzzNumbers(sc.nextInt()));
    }

    public static boolean checkBuzzNumbers(int number){
        // get the last digit is equal to 7
        // check the number is divisible by 7
        return number % 7 == 0 || number % 10 == 7;
    }
}
