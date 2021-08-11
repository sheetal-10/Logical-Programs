package com.logicalPrograms;

import java.util.Scanner;

/**
 * This is a program to get 
 * conversion of temperature 
 * @author Sheetal
 * @since 2021-08-09
 */
public class TemperatureConversion {
	/**
	 *  This is the main method that
	 *  asks the user to give his choice of temp conversion
	 *  calling fahrenheit and celsius method inside switch case
	 */
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1 for: Celsius to Fahrenheit conversion");
        System.out.println("Enter 2 for: Fahrenheit to Celsius conversion");
        int conversion = s.nextInt();

        switch (conversion) {
            case 1:
                fahrenheit();
                break;
            case 2:
                celsius();
                break;
            default:
                System.out.println("Enter proper conversion mode.");
                break;
        }
    }

    /**
     * This is the method for 
     * celsius to fahrenheit conversion
     * by computing its formula
     */
    private static void fahrenheit() {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter a temperature in Celsius: ");
        final float temp = s.nextFloat();     // it stores the temperature
        float fahrenheit = 0;
        fahrenheit = (temp*9/5) + 32;
        System.out.printf("Fahrenheit : %.1f", fahrenheit);

    }

    /**
     * This is the method for 
     * fahrenheit to celsius conversion
     * by computing its formula
     */
    private static void celsius() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a temperature in Celsius: ");
        float temp = s.nextFloat();     // it stores the temperature
        float celsius = 0;
        celsius = (temp-32)* 5 / 9;
        System.out.printf("Celsius : %.1f", celsius);
    }
}
