package com.gama1221.problems;

import java.util.Scanner;

/**
 * The Evil number is another special positive whole number in Java that has an even number of 1's in its binary equivalent.
 * 15 is an evil number because in its binary equivalent, i.e., 1111, it has an even number of ones.
 * 16 is an odious number because in its binary equivalent, i.e., 10000 has not even numbered of ones
 * 23 is also an evil number because it has an even number of ones in its binary equivalent, i.e., 10111.
 */
public class EvilNumber {
    public static void main(String[] args) {
        System.out.println("Please enter the number");
        Scanner sc = new Scanner(System.in);
        System.out.println(checkEvilNumber(sc.nextInt()));
    }

    public static boolean checkEvilNumber(int num){
        int count = 0;
        while (num > 0){
            if(num % 2 == 1){
                count += 1;
            }
            num = num/2;
        }
        return count % 2 == 0;
    }
}
