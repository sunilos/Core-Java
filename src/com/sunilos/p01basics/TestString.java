package com.sunilos.p01basics;

/**
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 * 
 * Test String methods
 */

public class TestString {

	public static void main(String[] args) {

		String name = "Vijay Dinanth Chouhan";

		System.out.println(" String Length- " + name.length());
		System.out.println(" 7 ths caharcter is- " + name.charAt(6));
		System.out.println(" Dina index is- " + name.indexOf("Dina"));
		System.out.println(" First i Position- " + name.indexOf("i"));
		System.out.println(" Last i Position- " + name.lastIndexOf("i"));
		System.out.println(" a is replaced by b- " + name.replace("a", "b"));
		System.out.println(" All a is replaced by b- "
				+ name.replaceAll("a", "b"));
		System.out.println(" Chota vijay- " + name.toLowerCase());
		System.out.println(" Bada vijay- " + name.toUpperCase());
		System.out.println(" Starts With Vijay- " + name.startsWith("Vijay"));
		System.out.println(" Ends with han- " + name.endsWith("han"));
		System.out.println(" Substring- " + name.substring(6));

	}

}
