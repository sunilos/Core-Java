package com.sunilos.p10io;

import java.io.FileReader;

/**
 * Reads a Text File charter by charter and by char array
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class ReadTextFile {

	public static void main(String[] args) throws Exception {
		readByChar();
		System.out.println();
		readByArray();
	}

	private static void readByChar() throws Exception {

		System.out.println("Read file char by char");

		// Open a file
		FileReader r = new FileReader("c:/test.txt");

		// Reads a single character
		int ch = r.read();
		char chr;

		// ch is -1 if no more character in file
		while (ch != -1) {
			chr = (char) ch; // cast to chr
			System.out.print(chr);
			ch = r.read();
		}
		r.close();
	}

	private static void readByArray() throws Exception {

		System.out.println("Read file by char Array");

		// Open a file
		FileReader r = new FileReader("c:/test.txt");

		// Create char array
		char[] buffer = new char[10];

		// Reads a character array
		int count = r.read(buffer);

		// count is 0 if no more character in file
		while (count > 0) {

			// Create string from array
			String str = new String(buffer);

			// Trim empty characters
			str = str.substring(0, count);

			System.out.print(str);

			// Read more characters
			count = r.read(buffer);
		}
		// Close file
		r.close();
	}
}
