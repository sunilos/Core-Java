package com.sunilos.p12swing;

/**
 * Test Day enum class
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */

public class TestEnumDay {

	public static void main(String[] args) {

		Day fd = Day.FRIDAY;
		System.out.println(fd.getWeekDay());

		switch (fd) {

		case MONDAY:
			System.out.println("Mondays are bad.");
			break;

		case FRIDAY:
			System.out.println("Fridays are better.");
			break;

		case SATURDAY:
			System.out.println("Saturdays are Cool !!!!");
			break;

		case SUNDAY:
			System.out.println("Let's Chill it is Sunday!!!!");
			break;
		}

		// Print all days
		Day[] days = fd.values();
		for (Day d : days) {
			System.out.println(d);
		}

	}

	/**
	 * Output 
	 * 5 
	 * Fridays are better. 
	 * SUNDAY 
	 * MONDAY 
	 * TUESDAY 
	 * WEDNESDAY 
	 * THURSDAY
	 * FRIDAY 
	 * SATURDAY
	 */
}
