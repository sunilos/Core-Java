package com.sunilos.p01basics;

/**
 * 
 * Test static block call. Static blocks are used to initialize static variables
 * or members It is executed before main method at the time of class loading.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestStaticBlock {

	static {
		System.out.println("I will call first!");
	}

	public static void main(String[] args) {
		System.out.println("I will call second!!");

	}

	/**
	 * I will call first! 
	 * I will call second!!
	 */
}
