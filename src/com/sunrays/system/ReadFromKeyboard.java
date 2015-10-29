package com.sunrays.system;

/**
 * A Class read a line from Keyboard and print at Console.
 * 
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 */
public class ReadFromKeyboard {

	public static void main(String[] args) throws Exception {

		int ch = 0;
		char chr = (char) ch;
		StringBuffer sb = new StringBuffer();

		System.out.print("Enter a Line : ");

		do {
			// Read a unicode of character
			ch = System.in.read();

			// Convert it into character
			chr = (char) ch;

			sb.append(chr);

		} while (ch != 13); // 13 is the end line character represents Enter
							// Key, If Enter Key is pressed then terminate the
							// loop

		System.out.println("You have entered : " + sb.toString());

	}
}
