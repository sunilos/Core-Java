package com.sunilos.p14system;

/**
 * A Class read a line from Keyboard and print at Console.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
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
