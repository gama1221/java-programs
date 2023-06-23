package com.gama1221.problems;

import java.util.Scanner;

/**
 * Duck number is another special positive non-zero number that contains zero in it.
 * The digit zero should not be presented at the starting of the number.
 * Zero can be present at any of the positions except the beginning of the number.
 */
public class DuckNumber {

    public static void main(String[] args) {
        System.out.println("Enter a number to be checked Buzz Number");
        Scanner sc = new Scanner(System.in);
        System.out.println(checkDuckNumber(sc.next()));
    }

    /**
     * ============================================================================================================================
     * 3210 is a Duck number because it contains zero at the end of the number but not present at the beginning of it.
     * 08237 is not a Duck number because it contains zero at the beginning of it.
     * 7033 is a Duck number because it contains zero at the second position, not at the beginning.
     * 030405 is not a Duck number because it also contains zero in starting of the number.
     * 00153 is also not a Duck number because it contains leading zeros.
     * ============================================================================================================================
     * Take a number as a string
     * Check the first number is zero or not
     * @param number - take a number as a string
     * @return
     * ============================================================================================================================
     */
    public static boolean checkDuckNumber(String number){
        int count = 0;
        int first = Character.getNumericValue(number.charAt(0));
        int numLen = number.length();
        if (first == 0){
            return false;
        }else {
            for(int i=0;i < numLen; i++){
                if(Character.getNumericValue(number.charAt(i)) == 0){
                    count++;
                }
            }
        }
        return count >=1;
    }
}