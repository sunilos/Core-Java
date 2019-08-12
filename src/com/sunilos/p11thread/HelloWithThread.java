package com.sunilos.p11thread;

/**
 * An example thread class
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class HelloWithThread extends Thread {

	/**
	 * Name of thread
	 */
	private String name = null;

	/**
	 * Parameterized constructor
	 * 
	 * @param name
	 */
	public HelloWithThread(String name) {
		this.name = name;
	}

	/**
	 * Execute thread operation
	 */
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.println(i + "#" + name);
		}

	}

	/**
	 * Test the example
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		HelloWithThread t1 = new HelloWithThread("Ram");
		HelloWithThread t2 = new HelloWithThread("Shyam");

		t1.start();
		t2.start();

		for (int i = 0; i < 500; i++) {
			System.out.println(i + " I m Main");
		}

	}

}
