/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch05.pp5_1;

import java.util.Scanner;
/**
 *
 * @author drchaos
 */
public class LeapYearTester {
	private static boolean isLeapYear(int year) {
		if(year % 4 == 0 && (year % 100 == 0 && year % 400 != 0)) {
			return true;
		}
		else {
			System.err.println("year % 4 == " + year % 4);
			System.err.println("year % 100 == " + year % 100);
			System.err.println("year % 400 == " + year % 400);
		}
		return false;
	}

	public static void main(String[] args) {
		String prompt = "Enter a possible leap year: ";
		Scanner scan = new Scanner(System.in);
		int year;
		
		System.out.print(prompt);
		while(scan.hasNextInt()) {
			year = scan.nextInt();
			
			if(isLeapYear(year)) {
				System.out.println("Year " + year + "is a leap year");
			}
			else {
				System.out.println("Not a leap year " + year);
			}

			System.out.print(prompt);
		}
	}
}
