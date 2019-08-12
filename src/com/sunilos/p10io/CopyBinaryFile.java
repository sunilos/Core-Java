package com.sunilos.p10io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Copy a Binary File
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class CopyBinaryFile {

	public static void main(String[] args) throws Exception {

		String source = "f:/baby.jpg";
		String target = "f:/girl.jpg";

		FileInputStream in = new FileInputStream(source);
		FileOutputStream out = new FileOutputStream(target);

		int ch = in.read();// Read a byte

		while (ch != -1) {// -1 if EOF
			out.write(ch);// Write a byte
			ch = in.read();// Read a byte
		}
		out.close();
		in.close();
		System.out.println(source + " is copied to " + target);
	}

}
