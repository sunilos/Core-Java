package com.sunilos.p01basics;

/**
 * Test Arithmetic & Unary Operations
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestArithmeticOperators {

	public static void main(String[] args) {

		// Arithmetic Operators
		int a = 17;
		int b = 5;
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		int val = a + b; //Addition
		System.out.println("a + b =" + val);

		val = a - b; //Substraction
		System.out.println("a - b =" + val);

		val = a * b;//Multiplication
		System.out.println("a * b =" + val);

		val = a / b; //Division
		System.out.println("a / b =" + val);

		val = a % b; //Modulo
		System.out.println("a % b =" + val);

		// Unary Operators

		val = ++a; //Increment by 1
		System.out.println("++a =" + val);

		val = b--; // Decrement by 1
		System.out.println("b-- =" + val);

		
	}

}
