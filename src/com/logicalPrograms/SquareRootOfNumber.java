package com.logicalPrograms;

import java.util.Scanner;

/**
 * This is a program to get 
 * square root of a number
 * @author Sheetal
 * @since 2021-08-09
 */
public class SquareRootOfNumber {
	/**
	 * This is the main method that
	 * takes a number from user and 
	 * uses epsilon and math formula to 
	 * get square root of given number
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int c = s.nextInt();   
		final double epsilon = 1E-15;
        float t = c;

        while (Math.abs(t-c/t) > epsilon * t) {
            double lastT = t;       
            t = (float) ((c/t + t)/2.0);        
            if ( lastT == t) {              
                break;                      
            }
        }
        System.out.println("Square root of " + c + " : " + t);
    }
}
