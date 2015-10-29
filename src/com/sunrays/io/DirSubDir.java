package com.sunrays.io;

import java.io.*;
import java.util.*;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 * 
 * Lists sub folders in a folder
 */

public class DirSubDir {

	public static String inden = "  ";

	public static void main(String[] args) throws IOException {

		File root = new File("C:/temp/temp");

		list(root, inden);
	}

	public static void list(File dir, String indenArg)throws IOException {
		File[] list = dir.listFiles();
		for (int i = 0; i < list.length; i++) {
			System.out.println(indenArg + list[i].getCanonicalPath()+"\\" + list[i].getName());
			if (list[i].isDirectory()) {
				list(list[i], indenArg + indenArg);
			}
		}
	}

}
