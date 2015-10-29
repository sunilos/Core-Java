package com.sunrays.io;

import java.io.File;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 * 
 * Lists files is a folder
 */

public class DirFiles {

	public static void main(String[] args) {
		File directory = new File("C:/temp");
		File[] list = directory.listFiles();
		for (int i = 0; i < list.length; i++) {
			if (list[i].isFile()) {
				System.out.println((i + 1) + " : " + list[i].getName());
			}
		}
	}

}
