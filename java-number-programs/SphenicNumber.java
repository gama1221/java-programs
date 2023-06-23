package com.gama1221.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class SphenicNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        System.out.println(checkSphenicNumber(sc.nextInt()));
    }

    /**
     * A positive integer n is called a sphenic number if the product of factors of the given number (n) is exactly three and all factors are prime.
     * In other words, if n is a sphenic integer then n=p x q x r (p, q, and are three distinct prime numbers and their product are n).
     * @param number - the number to be checked whether Sphenic or not
     * @return true if the number is Sphenic else returns false
     */
    public static boolean checkSphenicNumber(int number){
        ArrayList<Integer> arrayList = new ArrayList<>();
        int count = 0;
        for(int i=2;i<number;i++){
            //check the number is prime as well
            if(number % i == 0 && checkPrimeness(i)){
                count += 1;
                arrayList.add(i);
            }
        }
        int total = 1;
        for(int i: arrayList){
            total*=i;
        }
        return count == 3 && total == number;
    }

    /**
     * Check the number is prime or not
     * @param number - input number
     * @return true if it is prime
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
