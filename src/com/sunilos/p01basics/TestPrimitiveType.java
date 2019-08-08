package com.sunilos.p01basics;
/**
 * Example to Test Primitive Data Types
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestPrimitiveType {

	public static void main(String[] args) {

		// Primitive Literals

		boolean result = true;

		// Integer Literals
		byte b = 100;
		short s = 10000;
		int i = 100000;
		long l = 100000L;

		// Other number systems
		// The prefix 0x indicates hexadecimal and 0b indicates binary:

		int decVal = 26;// The number 26, in decimal
		int hexVal = 0x1a;// The number 26, in hexadecimal
		int binVal = 0b11010;// The number 26, in binary

		System.out.println("Decimal Value : " + decVal);
		System.out.println("Hex Value : " + hexVal);
		System.out.println("Binary Value : " + binVal);

		// Floating-Point Literals
		float f = 1.5F;
		double d = 1.5;
		// or
		double d1 = 1.5D;

		// Using Under score in Java SE 7
		long creditCardNumber = 1234_5678_9012_3456L;
		long socialSecurityNumber = 999_99_9999L;

		System.out.println("Credit Card Number : " + creditCardNumber);
		System.out.println("Social Security Number :" + socialSecurityNumber);

		// Character and String Literals
		char capitalC = 'C';
		char unicodeCapitalC = '\u0043';
		String name = "SUNRAYS";
		String unicodeName = "SUN\u0052AYS";

		System.out.println("Uncode C : " + unicodeCapitalC);
		System.out.println("Uncode SUNRAYS : " + unicodeName);

		// Escape sequences
		// \b (backspace), \t (tab), \n (line feed), \f (form feed), \r
		// (carriage return), \" (double quote), \' (single quote), and \\
		// (backslash).

		char backspace = '\b';
		char tab = '\t';
		char lineFeed = '\n';
		char formFeed = '\f';
		char carriageReturn = '\r';
		char doubleQuote = '\"';
		char singleQuote = '\'';
		char backslash = '\\';

	}

}
