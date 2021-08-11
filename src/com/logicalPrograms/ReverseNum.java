package com.logicalPrograms;

/**
 * This is a functional program for reverse number
 * @author Sheetal
 * @since 2021-08-09
 */
public class ReverseNum {
	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		//taking input from user
		int num = Utility.getUserSpecificInteger();
		//calling method to main
		int reverse = reverseNum(num);
        System.out.println("Reverse number is: " + reverse);
	}
	/**
	 * This method computes to get 
	 * the reverse of input number by using modulo
	 * @param num
	 * @return rev
	 */
	private static int reverseNum(int num) {
        int rem = 0;
        int rev = 0;
        int temp = num;

        while (temp > 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp /10;
        }
        return rev;
    }
}
