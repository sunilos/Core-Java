package com.sunilos.p14system;

import java.util.Date;

/**
 * A test class to depicts System class capabilities
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestSystemClass {

	public static void main(String[] args) throws Exception {

		// Write text to Console
		System.out.println("This is the standard output stream");
		System.out.println();

		// Write error text to Console
		System.err.println("This is the standard error output stream");
		System.out.println();

		// Read from keyboard
		System.out.print("Enter a Character : ");
		int ch = System.in.read();
		char chr = (char) ch;
		System.out.println("You have typed : " + chr);

		// Get Current Time
		long timeInMillSec = System.currentTimeMillis();

		// Convert into date object
		Date date = new Date(timeInMillSec);
		System.out.println("Current time in milli Seconds =" + timeInMillSec);
		System.out.println(date); // prints 2013-08-05

	}
}
