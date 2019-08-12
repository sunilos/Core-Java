package com.sunilos.p10io;

import java.io.File;
import java.util.Date;

/**
 * gets the File information for file system and print.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class FileInfo {

	public static void main(String[] args) {

		// Refer to a.txt file
		File f = new File("c:/a.txt");

		// Check file does exist
		if (f.exists()) {
			// Name of file
			System.out.println("Name:" + f.getName());
			// Path of File
			System.out.println("Path:" + f.getAbsolutePath());

			// Check access permission
			System.out.println("Access permission");
			System.out.println("Writable:" + f.canWrite());
			System.out.println("Readable:" + f.canRead());

			// Check name is of director or a file
			System.out.println("Is File:" + f.isFile());
			System.out.println("Is Dir:" + f.isDirectory());

			// Check File's last modified date
			Date d = new Date(f.lastModified());
			System.out.println("Date Modified:" + d);

			// Length of File
			long length = f.length();
			System.out.println("Length:" + length + " bytes");

		} else {
			System.out.println("File does not exists");
		}
	}

}
