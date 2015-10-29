package com.sunrays.thread;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class HelloWithThread extends Thread {

	String name = null;

	public HelloWithThread(String threadName) {
		super(threadName);
		name = threadName;
	}

	public void run() {

		for (int i = 0; i < 500; i++) {
			System.out.println(i + " Hello Thread " + name);
		}

	}

}
