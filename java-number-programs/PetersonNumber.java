package com.gama1221.problems;

import java.util.Scanner;

public class PetersonNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        System.out.println(checkPetersonNumber(sc.nextInt()));
    }
    public static boolean checkPetersonNumber(int number){
        int or = number;
        int result = 0;
        int mul = 1;
        while (number != 0){
            int rem = number % 10;
            for(int i=1;i<=rem;i++){
                mul *=i;
            }
            number = number / 10;
            result += mul;
            mul = 1;
        }
        return or == result;
    }
}
