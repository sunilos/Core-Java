package com.sunilos.p01basics;

/**
 * Program to print runtime argument list  
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class HelloAll {

	public static void main(String[] args) {

		for (int i = 0; i < args.length; i++) {
			System.out.println(i + " = Hello " + args[i]);
		}

	}
}
