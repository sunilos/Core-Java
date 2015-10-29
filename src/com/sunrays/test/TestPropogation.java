package com.sunrays.test;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class TestPropogation {

	public static void main(String[] args){
		try {
			padosi();
		} catch (Exception e) {
			System.out.println("Handled by mainF");

		}
	}
	public static void padosi() throws FileNotFoundException {
		dad();
	}

	public static void dad() throws FileNotFoundException {
		mom();

	}
	public static void mom()throws FileNotFoundException {
		// try {
		you();
		/*
		 * } catch (ArithmeticException e) { System.out.println("Handled by
		 * mom"); }
		 */
	}

	public static void you() throws FileNotFoundException, RuntimeException {
		int i = 0;

		if (i == 0) {
			FileNotFoundException e = 
				new FileNotFoundException("Mera Exception");
			throw e;
		}
		
		System.out.println("This is You");
	}
}
