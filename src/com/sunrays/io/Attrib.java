package com.sunrays.io;

import java.io.File;
import java.util.Date;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */
public class Attrib {

	public static void main(String[] args) {
		File f = new File("c:/a.txt");

		System.out.println("Exist : " + f.exists());

		if (f.exists()) {
			System.out.println("Absolute path: " + f.getAbsolutePath());
		}

		if (f.canWrite())
			System.out.println(f.getName() + " is writable.");
		if (f.canRead())
			System.out.println(f.getName() + " is readable.");

		if (f.isFile()) {
			System.out.println(f.getName() + " is a file.");
		} else if (f.isDirectory()) {
			System.out.println(f.getName() + " is a directory.");
		} else {
			System.out.println("What is this?");
		}

		if (f.isAbsolute()) {
			System.out.println(f.getPath() + " is an absolute path.");
		} else {
			System.out.println(f.getPath() + " is not an absolute path.");
		}

		long lm = f.lastModified();
		if (lm != 0)
			System.out.println("Last Modified at " + new Date(lm));

		long length = f.length();
		if (length != 0) {
			System.out.println(f.getName() + " is " + length + " bytes long.");
		}

	}

}
