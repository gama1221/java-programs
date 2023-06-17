package com.gama1221.problems;

import java.util.*;

/**
 * In fibonacci series, next number is the sum of previous two numbers.
 * for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
 * The first two numbers of fibonacci series are 0 and 1.
 * Display fibonacci numbers up to the given number
 * e.g.1 input 5
 *      output: 0, 1, 1, 2, 3,
 * e.g.2 input 8
 *      output: 0, 1, 1, 2, 3,5, 8, 13
 */

public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls enter number");
        int num = sc.nextInt();
        System.out.println("Fibonacci series up "+num+" is ");
        System.out.println("=================================================");
        System.out.println(getFibonacci(num));
        System.out.println("=================================================");
    }
    public static List<Integer> getFibonacci(int number){
        int num1 = 0;
        int num2 = 1;
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(num1);
        fibonacci.add(num2);
        for(int i=2;i<number; i++){
            int num3 = num1 + num2;
            fibonacci.add(num3);
            num1 = num2;
            num2 = num3;
        }
        return fibonacci;
    }
}