package com.gama1221.problems;

import java.util.Scanner;

/**
 * Factorial Program in Java: Factorial of n is the product of all positive descending integers.
 * Factorial of n is denoted by n!. For example: *
 *              4! = 4*3*2*1 = 24
 *              5! = 5*4*3*2*1 = 120
 */

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls enter number");
        int num = sc.nextInt();
        System.out.println(getFactorial(num));
    }
    public static int getFactorial(int num){
        int result = 1;
        for (int i=1;i<=num;i++){
            result = result * i;
        }
        return result;
    }
}