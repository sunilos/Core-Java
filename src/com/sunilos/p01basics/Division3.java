package com.sunilos.p01basics;

/**
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 * 
 */
public class Division3 {

	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		double div = getDivision(a, b);

		System.out.println("Division is " + div);

	}

	public static double getDivision(int a, int b) {

		double div = a / b;

		return div;

	}
}
