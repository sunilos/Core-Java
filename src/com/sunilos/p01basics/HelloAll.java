package com.sunilos.p01basics;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class HelloAll {

	public static void main(String[] args) {

		for (int i = 0; i < args.length; i++) {
			System.out.println(i + " = Hello " + args[i]);
		}

	}
}
