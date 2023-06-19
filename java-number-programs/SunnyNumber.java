package com.gama1221.problems;

import java.util.Scanner;

public class SunnyNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        System.out.println(findSunnyNumber(sc.nextInt()));
    }
    public static boolean findSunnyNumber(int number){
        return Math.sqrt(number + 1) == Math.floor(Math.sqrt(number + 1));
    }
}