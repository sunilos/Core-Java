package com.sunilos.p07exception;

/**
 * Example of one try and multiple catch blocks
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class MultiCatchHandling {

	public static void main(String[] args) {

		String name = "Vijay";

		try {
			// Get the length of string
			System.out.println(name.length());
			// Get 7th character of string
			System.out.println(name.charAt(6));
		} catch (NullPointerException e) {
			// Executed when name is null
			System.out.println("Name canot be null");
		} catch (StringIndexOutOfBoundsException e) {
			// Executed when string has less than 7 chars
			System.out.println("String is small");
		}

	}

}
