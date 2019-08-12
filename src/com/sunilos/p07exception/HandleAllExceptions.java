package com.sunilos.p07exception;

/**
 * Exception class handles all exceptions in hierarchy.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class HandleAllExceptions {

	public static void main(String[] args) {

		String name = null;
		// String name = "Vijay";

		try {
			// Get the length of string
			System.out.println(name.length());
			// Get 7th character of string
			System.out.println(name.charAt(6));
		} catch (Exception e) {
			System.out.println("Universal Exception Handler: " + e.getMessage());
		}

	}

}
