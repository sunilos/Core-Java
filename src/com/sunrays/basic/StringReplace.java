package com.sunrays.basic;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class StringReplace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is Google";
		
		System.out.println(str.indexOf("Google"));
		
		String newStr = str.replace("Google", "Sunrays");
		
		System.out.println(newStr);

	}

}
