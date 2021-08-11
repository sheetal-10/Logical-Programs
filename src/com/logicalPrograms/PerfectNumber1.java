package com.logicalPrograms;

/**
 * This is a functional program for perfect number
 * @author Sheetal
 * @since 2021-08-09
 */
public class PerfectNumber1 {
	/**
	 * This is the main method which
	 * takes a number as input from user
	 * and checks whether it is a perfect number or not by
	 * using for loop and if else.
	 */
	public static void main(String[] args) 
	    {
	        int n, sum = 0;
	        System.out.print("Enter a number: ");
	        //taking input from user
	        n = Utility.getUserSpecificInteger();
	        
	        //computation to check for perfect number
	        for(int i = 1; i < n; i++)
	        {
	            if(n % i == 0)
	            {
	                sum = sum + i;
	            }
	        }
	        if(sum == n)
	        {
	            System.out.println("Given number is a Perfect Number");
	        }
	        else
	        {
	            System.out.println("Given number is not a Perfect Number");
	        }    
	    }
	    int divisor(int x)
	    {
	       return x;
	    }

}
