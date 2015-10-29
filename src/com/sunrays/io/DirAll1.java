package com.sunrays.io;

import java.io.File;
import java.util.List;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class DirAll1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File directory = new File("C:/temp");
		String[] list = directory.list();

		File f = null;

		for (int i = 0; i < list.length; i++) {
			f = new File("C:/temp", list[i]);
			if (f.isFile()) {
				System.out.println((i + 1) + " : " + list[i]);
			}

		}
	}

}
