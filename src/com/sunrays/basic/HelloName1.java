package com.sunrays.basic;


/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */
public class HelloName1 {

	public static void main(String[] args) {
		if (args.length == 1) {
			System.out.println("Hello " + args[0]);
		} else {
			System.out.println("Usage : java -cp c:/bin com.basic.HelloName1");
		}

	}
}
