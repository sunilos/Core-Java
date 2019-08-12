package com.sunilos.p07exception;

/**
 * Tests Arithmetic Exception by dividing a number by ZERO.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestArithmeticException {

	public static void main(String[] args) {

		int k = 0;
		int i = 15;

		System.out.println("Before Exception : I will be executed");

		/**
		 * Divided by ZERO, will raise an Arithmetic Exception
		 */
		double div = i / k;

		/**
		 * Below statements will never be executed because exception is raised by
		 * previous statement and handed over to JVM
		 */
		System.out.println("After Exception : I will NOT be executed");
		System.out.println("Div is " + div);

	}

}
