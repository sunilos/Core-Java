package com.sunrays.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class FileIOExample {

	public static void main(String[] args) {
		String outfile = "Output.txt";
		// get file name from command line
		if (args.length > 0)
			outfile = args[0];

		// create keyboard reader
		Scanner in = new Scanner(System.in);

		// create file writer
		PrintWriter out = null;// why declared here?
		// why null?
		try {
			out = new PrintWriter(outfile);
		} catch (FileNotFoundException e) {
			System.out.println("Cannot create file " + outfile + ": "
					+ e.getMessage());
			System.exit(1);
		}
		
		String line;
		
		System.out.println("Enter lines (<Enter> to quit):");
		
		// read strings from keyboard
		while ((line = in.nextLine()).length() > 0) {
			out.println(line); // write to file
		}
		
		out.close(); // don't forget this!
	}
}
