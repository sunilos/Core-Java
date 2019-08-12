package com.sunilos.p03date;

/**
 * Test the key methods of java.lang.Math class
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestMath {

	public static void main(String[] args) {

		int maxVal = Math.max(2, 5);
		int minVal = Math.min(2, 5);
		double absoluteVal = Math.abs(-3.7);
		double expVal = Math.exp(10);
		double randomNo = Math.random();
		double sqrtVal = Math.sqrt(4);
		double ceilVal = Math.ceil(5.4);

		System.out.println("Math functions");
		System.out.println("Max 2,5: " + maxVal);
		System.out.println("Min 2,5: " + minVal);
		System.out.println("Absolute -3.7: " + absoluteVal);
		System.out.println("Exp 10: " + expVal);
		System.out.println("Random Number :" + randomNo);
		System.out.println("Square Root: " + sqrtVal);
		System.out.println("Smallest Integer greater than 5.4 : " + ceilVal);

	}

}
