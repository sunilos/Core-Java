package com.sunrays.thread;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class HelloWithoutThread {

	// Keeps Thraed Name
	String name = null;

	// Constructor
	public HelloWithoutThread(String threadName) {

		name = threadName;
	}

	public void run() { // TODO Auto-generated method stub

		for (int i = 0; i < 50; i++) {
			System.out.println(i + " Hello Thread " + name);
		}

	}

}
