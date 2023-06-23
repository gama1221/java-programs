package com.gama1221.problems;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * A digit count numerically precises the frequency of digits 0 through 9 in the order in which they occur in a number.
 * In other words, a number that is a pompous and self-centered figure whose only purpose in life is to describe itself.
 */

public class AutobiographicalNumber  {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        System.out.println(checkAutobiographicalNumber(sc.nextBigInteger()));
    }

    /**
     * Step1 - Count the number of digits
     * Step2 - Add the digits
     * Step3 - Compare the results we will get at Step1 and Step2
     * Step4 - if we will get true result at Step3 i.e. AutobiographicalNumber
     * Step5 - Else that number will not be an AutobiographicalNumber
     * @param number - the number to be checked AutobiographicalNumber
     * @return - True if it is Autobiographical Number else return false
     */

    public static boolean checkAutobiographicalNumber(BigInteger number){
        int numLength = String.valueOf(number).length();
        int sum = 0;
        for(int i = 0;i < numLength; i++){
            sum += Character.getNumericValue(String.valueOf(number).charAt(i));
        }
        return numLength == sum;
    }
}
