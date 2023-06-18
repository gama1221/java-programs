package com.gama1221.problems;
public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to me");
        System.out.println(getReverseNumber(4567));
    }
    public static int getReverseNumber(int number){
        StringBuilder s = new StringBuilder();
        while (number != 0){
            int digit = number % 10;
            s.append(digit);
            number = number/10;
        }
        return Integer.parseInt(String.valueOf(s));
    }
}