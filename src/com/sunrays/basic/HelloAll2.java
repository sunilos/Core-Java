package com.sunrays.basic;

/**
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 * 
 */

public class HelloAll2 {

	public static void main(String[] args) {
		myMethod(args);
	}// main

	public static void myMethod(String[] args) {
		int size;
		size = args.length;

		if (size == 0) {
			System.out.println("Usage : java HelloAll1 name1 name2 name3 .. ");
		} else {
			for (int i = 0; i < size; i++) {
				System.out.println((i + 1) + " = Hello " + args[i]);
			}
		}

	}
}// class
