package com.logicalPrograms;

import java.util.Scanner;

/**
 * This is program to do decimal to binary conversion
 * @author Sheetal
 * @since 2021-08-09
 */
public class DecimalToBinary {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a decimal number : ");
        int dec = s.nextInt();
        //calling method to main
        toBinary(dec);
    }

    /**
     * In this method we are doing the conversion process from decimal to binary
     * using while and for loops
     * @param n
     * @return binaryNum
     */
    private static void toBinary(int n) {
        int[] binaryNum = new int[20];
        int i = 0;
        while (n > 0)
        {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
}
