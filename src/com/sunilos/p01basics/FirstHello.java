package com.sunilos.p01basics;

/**
 * A simple most example in JAVA that will print Hello SunilOS at console. This program will be your very first program in Java.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class FirstHello {
	public static void main(String[] args) {

		System.out.println("Hello SunilOS");

		// Define a string variable and run same program
		String name = "SunilOS";
		System.out.println("Hello " + name);

		// Print "Hello SunilOS" five times.
		int i = 0;
		while (i < 5) {
			System.out.println(i + " Hello SunilOS");
			i++;
		}

	}
}
