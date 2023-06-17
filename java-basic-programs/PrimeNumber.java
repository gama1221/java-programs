package com.gama1221.problems;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls enter number");
        int num = sc.nextInt();
        boolean status = isPrime(num);
        if (status){
            System.out.println(num+" is prime number");
        }else{
            System.out.println(num+" is not prime number");
        }
    }

    public static boolean isPrime(int num){
        boolean status = false;
        int count = 0;
        if(num <= 1){
            return false;
        }
        else if(num == 2){
            status = true;
        }
        else{
            for (int i = 2; i< num; i++){
                if(num % i == 0){
                    count++;
                }
            }
        }
        if (count == 0) {
            status = true;
        }
        return status;
    }
}
