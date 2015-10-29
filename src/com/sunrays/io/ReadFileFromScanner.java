package com.sunrays.io;

import java.io.FileReader;
import java.util.Scanner;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 * 
 * Read line by line data from a text file by java.util.Scanner
 * 
 */

public class ReadFileFromScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		FileReader reader = new FileReader("c:/newtest.txt");

		Scanner sc = new Scanner(reader);
		while (sc.hasNext()) {

			System.out.println(sc.nextLine());

		}

		reader.close();

	}

}
