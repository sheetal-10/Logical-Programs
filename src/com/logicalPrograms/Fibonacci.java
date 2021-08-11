package com.logicalPrograms;

/**
 * This is a functional program for fibonacci series
 * @author Sheetal
 * @since 2021-08-09
 */
public class Fibonacci {
	/**
	 * This is the main method that 
	 * takes a no from user to pront its fibonnaci series
	 * calling fibonacci method to main
	 */
	public static void main(String[] args) {
		System.out.println("Enter a number to print the series of Fibonacci: ");
		//taking input from user
    	int num = Utility.getUserSpecificInteger();
    	//calling method to main
        fibonacci(num);
    }
    
    /**
     * This method computes 
     * the fibonacci series of input no
     * @param num
     * @return fibonacci series of num
     */
    private static void fibonacci(int num) {
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        int i = 1;
        while (i<=num-2) {
            int c = a+b;
            a = b;
            b = c;
            System.out.print(c + " ");
            i++;
        }
    }
}
