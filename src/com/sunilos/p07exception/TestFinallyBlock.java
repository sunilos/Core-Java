package com.sunilos.p07exception;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Tests Finally block to cleanup resources.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestFinallyBlock {

	public static void main(String[] args) throws IOException {

		InputStream input = null;

		try {
			input = new FileInputStream("file.txt");
			int data = input.read();
			while (data != -1) {
				System.out.print((char) data);
				data = input.read();
			}
		} finally {
			// Cleanup file resource
			if (input != null) {
				input.close();
			}
		}
	}
}
