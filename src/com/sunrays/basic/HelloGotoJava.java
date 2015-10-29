package com.sunrays.basic;

import com.sun.org.apache.bcel.internal.generic.GOTO;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 */

public class HelloGotoJava {

	static String name = "Swati";

	public static void main(String[] args) {
		int i = 0;
		Label: System.out.println("Hello Java" + name);
		if(i<5){
			System.out.println("Inside " + i);
			i++;
			GOTO Label;
		}
		

	}

	public static void main1(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.println("Hello Java" + name);
		}
	}

}
