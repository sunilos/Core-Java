package com.sunrays.io;

import java.io.*;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 * 
 */

public class RanAccFileReader {

	public static void main(String[] args) throws Exception {
		long dataPosition = 0;
		int data = 0;
		RandomAccessFile raf = new RandomAccessFile("datafile", "r");
		// Get the position of the data to read.
		dataPosition = raf.readLong();

		System.out.println("dataPosition : " + dataPosition);

		// Go to that position.
		raf.seek(dataPosition);
		// Read the data.
		data = raf.readInt();
		raf.close();
		// Tell the world.
		System.out.println("The data is: " + data);
	}
}
