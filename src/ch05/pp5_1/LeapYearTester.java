/*
 * Copyright (C) 2013 Travis Mosley <tprowx@gmail.com>
 */
package ch05.pp5_1;

import java.util.Scanner;
/**
 *
 * @author drchaos
 */
public class LeapYearTester {
	private static boolean isLeapYear(int year) {
                return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
	}

	public static void main(String[] args) {
		String prompt = "Enter a possible leap year: ";
		Scanner scan = new Scanner(System.in);
		int year;
		
		System.out.print(prompt);
		if(scan.hasNextInt()) {
			year = scan.nextInt();
			
                        if(year < 1582) {
                          System.out.println("ERROR: Year " + year +
                                             " is less than 1582.\nExiting");
                          System.exit(1);
                        }
			if(isLeapYear(year)) {
				System.out.println("Year " + year + " is a leap year");
			}
			else {
				System.out.println("Not a leap year " + year);
			}
		}
	}
}
