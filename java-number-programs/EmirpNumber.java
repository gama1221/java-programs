package com.gama1221.problems;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A number is called an emirp number if we get another prime number on reversing the number itself.
 * In other words, an emirp number is a number that is prime forwards or backward.
 * It is also known as twisted prime numbers.
 */
public class EmirpNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        System.out.println(checkEmirpNumber(sc.nextInt()));
    }

    /**
     * Step1 : Check the number is prime or not
     * Step2 : Reverse the number at step 1
     * Step3 : check the number we get at Step2 is prime or not too.
     * Step4 : if Step3 is true i.e. all we need to solve
     * @param number - an input number
     * @return - true if Emirp Number else false
     */

    public static boolean checkEmirpNumber(int number){
        int reversedNumber = reverseNumber(number);
        return checkPrimeness(number) && checkPrimeness(reversedNumber);
    }

    /**
     * Reverse a number in this method
     * @param num - the number to be reversed
     * @return - return reversed number
     */
    public static int reverseNumber(int num){
        int strLen = String.valueOf(num).length();
        StringBuilder str = new StringBuilder("");
        for (int i = strLen-1;i >= 0;i--){
            str.append(Character.getNumericValue(String.valueOf(num).charAt(i)));
        }
        return Integer.parseInt(String.valueOf(str));
    }

    /**
     * check the number is prime or not
     * @param number
     * @return
     */
    public static boolean checkPrimeness(int number){
        int countO = 0;
        boolean status = false;
        for(int i=2;i<number;i++){
            if(number % i == 0){
                countO+=1;
            }
            if(countO >=2){
                break;
            }
        }
        if (countO < 1){
            status = true;
        }
        return status;
    }
}