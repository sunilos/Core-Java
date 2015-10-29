package com.sunrays.io;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class AppentIntoTextFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		FileWriter writer = new FileWriter("c:/newtest.txt",true);

		PrintWriter printWriter = new PrintWriter(writer);

		for (int i = 0; i < 5; i++) {
			printWriter.println(i + " : Line");
		}
		
		printWriter.flush();
		
		printWriter.close();
		writer.close();		

		System.out.println("DONE");
		
	}

}
