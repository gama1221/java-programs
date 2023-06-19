package com.gama1221.problems;

import java.util.Scanner;

public class TechNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        System.out.println(checkTechNumber(sc.nextInt()));
    }
    public static boolean checkTechNumber(int number){
        int numStrLen = String.valueOf(number).length()/2;
        StringBuilder firstHalfDigit = new StringBuilder();
        StringBuilder secondHalfDigit = new StringBuilder();
        String numString = String.valueOf(number);
        for(int i=0;i<numStrLen;i++){
            firstHalfDigit.append(numString.charAt(i));
        }
        for(int i=numStrLen;i<String.valueOf(number).length();i++){
            secondHalfDigit.append(numString.charAt(i));
        }
        int sum = Integer.parseInt(String.valueOf(firstHalfDigit)) +
                Integer.parseInt(String.valueOf(secondHalfDigit));
        return Math.pow(sum, 2) == number;
    }
}