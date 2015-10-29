package com.sunrays.basic;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class MyMath {

	public static void main(String[] args) throws Exception {

		int ch = System.in.read();
		System.out.println("Selected ASCII Code " + ch);

		if (ch == 'A' || ch == 'a') {
			Add.main(args);
		} else if (ch == 'D' || ch == 'd') {
			Division.main(args);
		} else {
			System.out.println("Incorrect Choice ");
		}
	}

}
