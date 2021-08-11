package com.logicalPrograms;

/**
 * This is a program for Swapping nibbles of binary
 * @author Sheetal
 * @since 2021-08-09
 */
public class SwapNibbles {
	/**
	 * Asks user for Number
	 * @param nmb
	 * finds the binary number
	 * Swaps the nibbles and makes Decimal value
	 * Check whether the decimal value is power of 2 
	 */
	public static void main(String[] args) {
		System.out.println("Enter the number to find binary value:");
		int nmb=Utility.getUserSpecificInteger();
		String binary= Integer.toBinaryString(nmb);
		System.out.println("Binary of "+nmb+" is "+binary);
		int bin1=Integer.parseInt(binary);
		int nibb1= bin1/10000;
		int nibb2= bin1%10000;
		int swap= nibb2*10000;
		int swapBinary=swap+nibb1;
		System.out.println("After swapping Binary is "+swapBinary);
		String s=String.valueOf(swapBinary);
		int Decimal=Integer.parseInt(s,2);
		System.out.println("Decimal of "+swapBinary+" is "+Decimal);
		nmb=Decimal;
		while(Decimal>1) {
			if (Decimal%2==0) Decimal=Decimal/2;
			else Decimal=0;
		}
		if (Decimal==0) {
			System.out.println(nmb+" is not a power of 2");
		} else {
			System.out.println(nmb+" is power of 2");
		}
	}
}
