package com.sunilos.p01basics;

/**
 * Test Conditional Operators 
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestConditionalOperators {

	public static void main(String[] args) {

		int value1 = 1;
		int value2 = 2;

		if (value1 == 1 && value2 == 2) //AND Operator
		{
			System.out.println("value1 is 1 AND value2 is 2");
		}
		if (value1 == 1 || value2 == 1) //OR Operator
		{
			System.out.println("value1 is 1 OR value2 is 1");
		}

	}
}
