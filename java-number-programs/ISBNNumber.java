package com.gama1221.problems;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * ISBN is another special number in Java.
 * ISBN stands for the International Standard Book Number that is carried by almost each every book.
 * The ISBN is a ten-digit unique number.
 * With the help of the ISBN, we can easily find any book.
 * The ISBN number is a legal number when 1*Digit1 + 2*Digit2 + 3*Digit3 + 4*Digit4 + 5*Digit5 + 6*Digit6 + 7*Digit7 + 8*Digit8 + 9*Digit9 + 10*Digit10 is divisible by 11.
 * The digits are taken from right to left.
 * So, if the ten-digit number is 7426985414, Digit1 and Digit10 will be 4 and 7, respectively.
 */
public class ISBNNumber {
    public static void main(String[] args) {
        System.out.println("Enter ISBN ");
        Scanner sc = new Scanner(System.in);
        System.out.println(checkISBNNumber(sc.nextLong()));
    }
    public static boolean checkISBNNumber(long num){
        // check the digit of the number
        long len = String.valueOf(num).length();
        long isbn = 0;
        if(String.valueOf(num).length()<10){
            return false;
        }else{
            int count = 10;
            for(long i = 0; i<len;i++){
                 isbn += (long) Character.getNumericValue(String.valueOf(num).charAt((int) i)) * count;
                 count --;
            }
        }
        return isbn % 11 == 0;
    }
}
