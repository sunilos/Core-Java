package com.sunilos.p03date;

import java.util.Calendar;
import java.util.Date;

/**
 * Test date arithmetic
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestDateArithmetic {

	public static void main(String[] args) {

		Date today = new Date();

		// Get a Calendar for current locale & time zone
		Calendar cal = Calendar.getInstance();

		// Set to the current time
		cal.setTime(today);

		// Get yesterday’s date
		cal.add(Calendar.DATE, -1);

		Date yesterday = cal.getTime();

		// Get tomorrow's date
		cal.add(Calendar.DATE, 2);

		Date tomorrow = cal.getTime();

		// Get date after 30 days
		cal.add(Calendar.DATE, 30);
		Date nextEvent = cal.getTime();

		System.out.println("Yesterday : " + yesterday);
		System.out.println("Today : " + today);
		System.out.println("Tomorrow : " + tomorrow);
		System.out.println("Event after 30 Days : " + nextEvent);

		// Get year of the date
		int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);

		// Comparison
		if (today.getTime() > yesterday.getTime()) {
			System.out.println("Today is greater than Yesterday");
		}

		if (today.after(yesterday)) {
			System.out.println("Today comes after Yesterday");
		}

		if (yesterday.compareTo(today) == -1) {
			System.out.println("Yesterday is smaller than Today");
		}

		if (today.compareTo(yesterday) == 1) {
			System.out.println("Yesterday is smaller than Today");
		}

		if (today.compareTo(today) == 0) {
			System.out.println("Today is today, do not lose it");
		}

	}
}
