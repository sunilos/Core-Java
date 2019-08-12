package com.sunilos.p10io;

import java.io.FileWriter;

/**
 * Writes to a Text File. You can write character, char array and string
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class WriteTextFile {

	public static void main(String[] args) throws Exception {

		System.out.println("Write to a Text file char by char");

		// Open a file
		FileWriter file = new FileWriter("f:/test1.txt");

		char[] cArray = { 'H', 'i' };

		file.write(cArray); // write char array
		file.write(','); // write a char
		file.write("SUNRAYS"); // write string

		file.close();
	}

}
