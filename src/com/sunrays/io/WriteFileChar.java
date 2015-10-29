package com.sunrays.io;

import java.io.FileWriter;
import java.io.PrintWriter;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 * 
 */

public class WriteFileChar {

	public static void main(String[] args) throws Exception {

		FileWriter writer = new FileWriter("c:/newtest.txt");

		for (int i = 0; i < 5; i++) {
			writer.write(i + '1');
		}

		writer.close();

		System.out.println("DONE");

	}

}
