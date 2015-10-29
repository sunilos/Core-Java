package com.sunrays.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 * 
 */

public class WriteBufferedFile {

	public static void main(String[] args) throws Exception {

		FileWriter writer = new FileWriter("c:/newtest.txt");

		BufferedWriter printWriter = new BufferedWriter(writer);

		for (int i = 0; i < 5; i++) {
			printWriter.write(i + " : Line\n");
		}

		printWriter.flush();

		printWriter.close();
		writer.close();

		System.out.println("DONE");

	}

}
