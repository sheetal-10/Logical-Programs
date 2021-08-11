package com.logicalPrograms;

import java.util.Scanner;

/**
 * This is a functional program to simulate stop watch
 * @author Sheetal
 * @since 2021-08-09
 */
public class StopWatch {
	/**
	 * This is the main method that
	 * asking user to start and then stop whenever it wants and 
	 * computes to get time elapsed between start and stop in miliseconds
	 */
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type 'start' to start the stopwatch: ");
        String startStr = sc.next().toLowerCase();
        long start = System.currentTimeMillis();
        if (startStr.equals("start")) {
            System.out.print("Type 'stop' to stop the stopwatch: ");
            String stopStr = sc.next().toLowerCase();
            while (!stopStr.equals("stop")) {
                System.out.print("Type 'stop' to stop the stopwatch: ");
                stopStr = sc.next().toLowerCase();
            }
            long stop = System.currentTimeMillis();
            long timeElapsed =  stop - start;
            System.out.println("Time = " + timeElapsed + " ms");

        } else {
            System.out.println("Wrong input.");
        }

    }
}
