package com.sunilos.p01basics;

/**
 * Runtime argument passing with doDivision method 
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class Division2 {

	public static void main(String[] args) {

		if (args.length < 2) {
			System.out
					.println("USAGE : java -cp <bin path> com.basic.Division1 <n1> <n2>");
			return;
		}
		doDivision(args);
	}

	public static void doDivision(String[] args) {
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		double div = a/b;

		System.out.println("Division is " + div);
		
	}
}
