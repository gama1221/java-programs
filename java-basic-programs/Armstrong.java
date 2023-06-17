package com.gama1221.problems;

import java.util.Scanner;

/**
 * Armstrong Number in Java
 * In this section, we will discuss what is Armstrong number and also create Java programs to check if the given number is an Armstrong number or not.
 * The Armstrong number program frequently asked in Java coding interviews and academics.
 * 153: 13 + 53 + 33 = 1 + 125+ 27 = 153
 *
 * 125: 13 + 23 + 53 = 1 + 8 + 125 = 134 (Not an Armstrong Number)
 *
 * 1634: 14 + 64 + 34 + 44 = 1 + 1296 + 81 + 256 = 1643
 */
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls enter number");
        int num = sc.nextInt();
        boolean status = isArmstrong(num);
        if (status){
            System.out.println(num +" is Armstrong number");
        }else{
            System.out.println(num +" is not Armstrong number");
        }
    }
    public static boolean isArmstrong(int num){
        int result = 0;
        if (String.valueOf(num).length() == 1){
            return false;
        }else{
            for (int i=0;i<String.valueOf(num).length();i++){
                char n = String.valueOf(num).charAt(i);
                int m = Integer.parseInt(String.valueOf(n));
                result += Math.pow(m, String.valueOf(num).length());
            }
        }
        return num == result;
    }
}
