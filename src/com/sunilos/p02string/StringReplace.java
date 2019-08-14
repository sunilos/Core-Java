package com.sunilos.p02string;

/**
 * Program to replace the string
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
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
