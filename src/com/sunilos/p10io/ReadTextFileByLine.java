package com.sunilos.p10io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Reads data line by line from a text file using BufferedReader and Scanner
 * class.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class ReadTextFileByLine {

	public static void main(String[] args) throws Exception {
		readByBufferedReader();
		System.out.println();
		readByScanner();
	}

	/**
	 * Reads file line by line with help of BufferedReader object
	 * 
	 * @throws Exception
	 */
	public static void readByBufferedReader() throws Exception {

		System.out.println("Read file by Buffered Reader");
		// Open a File
		FileReader r = new FileReader("c:/test.txt");

		// Wrap reader by BufferedReader object
		BufferedReader br = new BufferedReader(r);

		// Read a single line
		String line = br.readLine();

		// Process loop if line is not null
		while (line != null) {
			System.out.println(line);

			// Read next line
			line = br.readLine();
		}

		// Close buffer
		br.close();

		// Close file
		r.close();
	}

	/**
	 * Reads file line by line with help of Scanner object
	 * 
	 * @throws Exception
	 */
	public static void readByScanner() throws Exception {

		System.out.println("Read file by Scanner");

		// Open a File
		FileReader r = new FileReader("c:/test.txt");

		// Wrap reader by Scanner object
		Scanner sc = new Scanner(r);

		String line = null;

		// Process loop if scanner find next word
		while (sc.hasNext()) {
			line = sc.nextLine();
			System.out.println(line);
		}

		// Close Scanner
		sc.close();
		// Close file
		r.close();
	}

}
