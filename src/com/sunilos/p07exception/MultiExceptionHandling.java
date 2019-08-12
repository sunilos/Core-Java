package com.sunilos.p07exception;

/**
 * Example of multiple Exception Types in a single catch. Supported in JAVA 7
 * and later
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class MultiExceptionHandling {

	public static void main(String[] args) {

		String name = "Vijay";

		try {
			// Get the length of string
			System.out.println(name.length());
			// Get 7th character of string
			System.out.println(name.charAt(6));
		} catch (NullPointerException | StringIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
