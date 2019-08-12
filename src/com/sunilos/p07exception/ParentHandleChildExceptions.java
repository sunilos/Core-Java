package com.sunilos.p07exception;

/**
 * Example of Parent exception class handling exceptions of child and class
 * hierarchy exceptions.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class ParentHandleChildExceptions {

	public static void main(String[] args) {

		String name = null;
		// String name = "Vijay";

		try {
			// Get the length of string
			System.out.println(name.length());
			// Get 7th character of string
			System.out.println(name.charAt(6));
		} catch (RuntimeException e) {
			System.out.println("Parent Handles Exception : " + e.getMessage());
		}

	}

}
