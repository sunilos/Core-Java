package com.sunrays.io;

import java.io.*;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */
public class Copy {

	public static void main(String[] args) throws IOException {
		
		String sourceFile = "E:/ns/workspace/SampleAcn.jar";
		String targetFile = "E:/ns/workspace/new.jar";

		FileInputStream in = new FileInputStream(sourceFile);
		FileOutputStream out = new FileOutputStream(targetFile);

		int c;

		while ((c = in.read()) != -1) {
			out.write(c);
		}

		out.close();
		in.close();

	}

}
