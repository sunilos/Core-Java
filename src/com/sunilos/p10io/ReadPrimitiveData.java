package com.sunilos.p10io;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * Reads primitive data from a binary stream.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class ReadPrimitiveData {

	public static void main(String[] args) throws Exception {

		FileInputStream file = new FileInputStream("f:/binary.dat");

		DataInputStream in = new DataInputStream(file);

		System.out.println(in.readInt());
		System.out.println(in.readBoolean());
		System.out.println(in.readChar());
		System.out.println(in.readDouble());

		in.close();
	}

}
