package com.sunrays.io;

import java.io.FileReader;
import java.io.FileWriter;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 * 
 * Copy a text file
 */

public class CopyText {

	public static void main(String[] args) throws Exception{

		String source= "c:/a.txt";
		String target = "c:/b.txt";
		
		FileReader reader = new FileReader(source);
		FileWriter writer = new FileWriter(target);
		
		int ch = reader.read() ;
		
		while (ch != -1){
			writer.write(ch);
			ch = reader.read();
		}
		
		writer.close();
		reader.close();
		System.out.println(source + " is copied to "+ target);

	}

}
