package com.sunilos.p10io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * Writes Primitive Data to a binary stream
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class WritePrimitiveData {

	public static void main(String[] args) throws Exception {

		FileOutputStream file = new FileOutputStream("f:/binary.dat");
		DataOutputStream out = new DataOutputStream(file);

		out.writeInt(1);
		out.writeBoolean(true);
		out.writeChar('A');
		out.writeDouble(1.2);
		out.close();

		System.out.println("Primitive Data successfully written");
	}
}
