package com.sunilos.p05arrays;

/**
 * Prints the name of array class.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class ClassOfArray {

	public static void main(String[] args) {

		char[] myArray = { 'S', 'U', 'N', 'R', 'A', 'Y', 'S' };
		String name = myArray.getClass().getName();
		System.out.println("Name of char[] array is " + name);

	}
}
