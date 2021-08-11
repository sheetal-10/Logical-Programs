package com.logicalPrograms;

import java.util.Scanner;
import java.util.Random;
/**
 * This is a program for making utility of repeating functions or equations 
 * @author Sheetal
 * @since 2021-08-09
 */
public class Utility {
	/**
	 * Scanner which can parse primitive types and strings
	 */
	private static final Scanner sc = new Scanner(System.in);
	
	/**
	 * Calling of random function
	 * @return Double type Random value 
	 */
	public static double getRandomDouble() {
		return Math.random();
	}
	
	/**
	 * Scanning of User input which is integer type
	 * @return assigned integer value
	 */
	public static int getUserSpecificInteger() {
		return sc.nextInt();
	}
	
	/**
	 * Scanning of User input which is char type
	 * @return assigned Char
	 */
	public static char getUserSpecificChar() {
		return sc.next().charAt(0);
	}
	public static int getRandomInt(int number) {
		Scanner random = null;
		return random.nextInt(number);
	}
}
