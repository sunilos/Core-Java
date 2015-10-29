package com.sunrays.thread;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class HelloRunnable implements Runnable {

	public void run() {
		System.out.println("Hello from a thread!");
	}

	public static void main(String args[]) {
		Thread t = new Thread(new HelloRunnable());
		t.start();
	}

}
