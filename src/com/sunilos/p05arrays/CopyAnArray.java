package com.sunilos.p05arrays;

/**
 * Copy array elements using java.lang.System
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class CopyAnArray {

	public static void main(String[] args) {

		char[] copyFrom = { 'S', 'U', 'N', 'R', 'A', 'Y', 'S' };
		char[] copyTo = new char[4];

		/**
		 * Parameters of System.arraycopy() method are 
		 * Source Array, 
		 * Start Index of Source Array, 
		 * Target Array 
		 * Start Index of destination array 
		 * No of elements to be copied
		 */

		System.arraycopy(copyFrom, 3, copyTo, 0, 4);

		System.out.println(new String(copyTo));
		
	}
}
