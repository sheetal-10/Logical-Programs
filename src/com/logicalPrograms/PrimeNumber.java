package com.logicalPrograms;

/**
 * This is a functional program for prime number
 * @author Sheetal
 * @since 2021-08-09
 */
public class PrimeNumber {
	/**
	 * This is the main method that
	 * takes a number from user and
	 * calls isPrime method to main
	 */
	public static void main(String[] args) {
		 System.out.print("Enter a number: ");
		 //taking input from user
		 int num = Utility.getUserSpecificInteger();
		 //calling method to main
		 isPrime(num);
	 }
	 
	 /**
	 * This method checks
	 * whether the input no is a prime no or not by
	 * passing it thorugh if else and while loop
	 */
	private static void isPrime(int num) {
	        int i = 2, count = 0;
	        if (num == 1 || num == 0) {
	            count++;
	            System.out.println(num + " is not a prime number.");
	        } else {
	            while(i<=num/2) {
	                if (num%i == 0) {
	                    count++;
	                }
	                i++;
	            }
	            if (count == 0)
	                System.out.println(num + " is a prime number");
	            else
	                System.out.println(num + " is not a prime number.");
	        }

	    }

}
