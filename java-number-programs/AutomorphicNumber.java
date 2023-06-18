package com.gama1221.problems;

import java.util.Scanner;

/**
 * In this section, we will learn automorphism numbers with examples and
 * also create Java programs that check whether the number is automorphism or not.
 * A number is called an automorphic number if and only if
 * the square of the given number ends with the same number itself.
 * For example, 25, 76 are automorphic numbers because
 * their square is 625 and 5776, respectively and the last two digits of the square
 * represent the number itself. Some other automorphic numbers are 5, 6, 36, 890625, etc.
 */
public class AutomorphicNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        System.out.println(checkAutomorphicNumber(sc.nextInt()));
    }
    public static boolean checkAutomorphicNumber(int number){
        int powResult = (int)Math.pow(number, 2);
        int digitsToMinus = String.valueOf(powResult).length() - String.valueOf(number).length();
        int subNumber = Integer.parseInt(String.valueOf(powResult).substring(digitsToMinus));
        return number == subNumber;
    }
}