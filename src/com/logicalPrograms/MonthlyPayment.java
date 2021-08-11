package com.logicalPrograms;

import java.util.Scanner;

/**
 * This is a program to get monthly payment
 * @author Sheetal
 * @since 2021-08-09
 */
public class MonthlyPayment {

	/**
	 * This is the main method takes
	 * principle amount, years to pay of loan, rate of interest from user
	 * calls monthlyPayment method to main
	 */
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter principle loan amount: ");
        float principleAmt = s.nextFloat();
        System.out.print("Enter years to pay off the loan: ");
        int year = s.nextInt();
        System.out.print("Enter a rate of interest: ");
        float roi = s.nextFloat();
        //calling method to main
        monthlyPayment(principleAmt, year, roi);
    }

    /**
     * This method computes the formulas to get the monthly payment 
     * using math formula
     * @param P (for principal amount)
     * @param Y (for year to be paid off)
     * @param R (for rate of interest)
     * @return payment
     */
    private static void monthlyPayment(float P, int Y, float R) {
        int n = Y * 12;     // number of months for 'y' years
        float r = R / (12*100);
        float payment = (P*r) / (float)(1-(Math.pow(1+r, -n)));
        System.out.printf("Monthly payment: %.2f", payment);
    }
}
