package com.sunilos.p10io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Serialize an object and write to a file
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class WriteObject {

	public static void main(String[] args) throws Exception {

		FileOutputStream file = new FileOutputStream("f:/object.ser");

		// Wrap file with ObjectOutputStream
		ObjectOutputStream out = new ObjectOutputStream(file);

		// Create objects and set values
		MarksheetBean m = new MarksheetBean();
		m.setName("Raju");
		m.setMaths(90);
		m.setPhysics(80);
		m.setChemistry(89);
		m.setTemp(99);

		System.out.println("Total Marks : " + m.getTotal());
		System.out.println("Percentage : " + m.getPercentage());

		// Serialize object
		out.writeObject(m);

		// Close the file
		out.close();

		System.out.println("Object is serialized and persisted.");
	}
}
