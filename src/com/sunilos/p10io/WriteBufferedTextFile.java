package com.sunilos.p10io;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * Writes buffered character stream to a Text File. BuffredWriter and
 * PrintWriter class objects can be used for efficient writing.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class WriteBufferedTextFile {

	public static void main(String[] args) throws Exception {

		System.out.println("Write to a Text file char by char");

		// Open a file
		FileWriter file = new FileWriter("f:/test11.txt");
		BufferedWriter out = new BufferedWriter(file);
		char[] cArray = { 'H', 'i' };
		out.write(cArray); // write char array
		out.write(','); // write a char
		out.write("SUNRAYS"); // write string
		out.close();
		file.close();
	}

}
