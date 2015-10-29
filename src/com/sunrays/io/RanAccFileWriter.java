package com.sunrays.io;

import java.io.*;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 * 
 */

public class RanAccFileWriter {

	public static void main(String[] args) throws Exception {

		long dataPosition = 0; // to be determined later

		RandomAccessFile in = new RandomAccessFile("datafile", "rw");

		// Write the file.
		in.writeLong(0); // placeholder
		in.writeChars("blahblahblah");
		dataPosition = in.getFilePointer();
		in.writeInt(123);
		in.writeBytes("yadayadayada");

		// Rewrite the first byte to reflect updated data position.
		in.seek(0);
		in.writeLong(dataPosition);
		in.close();

	}
}
