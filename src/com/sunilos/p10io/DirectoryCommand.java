package com.sunilos.p10io;

import java.io.File;

/**
 * Lists files & subdirectories of a folders
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class DirectoryCommand {

	public static void main(String[] args) {

		// File object refer to c:/temp folder
		File directory = new File("g:/temp");
		// get the list of files and subdirectories
		String[] files = directory.list();

		for (String f : files) {
			System.out.println(f);
		}

		// Create subdirectory inside a directory
		File subDir = new File(directory, "test");
		subDir.mkdir();

		// Rename a file or directory
		subDir.renameTo(new File(directory, "Nest"));

		// Remove a file or directory
		subDir.delete();

		// Delete if exist
		subDir.deleteOnExit();

	}

}
