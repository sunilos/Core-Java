package com.sunrays.exception;

public class TestArithmetic {

	public static void main(String[] args) {
		case1();
		// case2();
		// case3();
	}

	/**
	 * Normal arithmetic calclation
	 */

	public static void case1() {

		int k = 05;
		int i = 15;

		double div = i / k;

		System.out.println("Div is " + div);
	}

	/** Divide by Zero and raise exception */

	public static void case2() {

		int k = 0;
		int i = 15;

		double div = i / k;

		System.out.println("Div is " + div);
	}

	/**
	 * Handle exceptional condition and print custom message
	 */

	public static void case3() {

		int k = 0;
		int i = 15;

		try {

			double div = i / k;
			System.out.println("Div is " + div);

		} catch (ArithmeticException e) {
			System.out.println("Divident can not be Zero");
		}

	}
}
