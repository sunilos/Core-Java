package com.sunilos.p01basics;

/* This example is for taking run time arguments 
 * then parse them into integer type for division.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class Division {

	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		double div = a/b;

		System.out.println("Division is " + div);
	}
}
