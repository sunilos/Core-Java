package com.sunilos.p11thread;

/**
 * Example of join() method. In this example a thread joins the next thread and
 * wait until next thread is finished
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */
public class JoiningThread extends Thread {

	private Thread nextThread;

	public JoiningThread(String name) {
		super(name);
	}

	public JoiningThread(String name, Thread other) {
		super(name);
		this.nextThread = other;
	}

	@Override
	public void run() {

		System.out.println(getName() + " Started");

		if (nextThread != null) {
			if (nextThread.isAlive()) {
				try {
					// join to next thread and wait until it is finished
					nextThread.join();
				} catch (InterruptedException e) {
				}
			}
		}

		System.out.println(getName() + " Ended");
	}

	public static void main(String[] args) {

		// Start d
		Thread d = new JoiningThread("D");
		// C will wait until D is finished
		Thread c = new JoiningThread("C", d);
		// B will wait until C is finished
		Thread b = new JoiningThread("B", c);
		// A will wait until B is finished
		Thread a = new JoiningThread("A", b);

		a.start();
		b.start();
		c.start();
		d.start();

		try {
			// Main will wait until A is finished
			a.join();
		} catch (InterruptedException e) {
		}
		System.out.println("Main is finished");

	}

}

/**
 * B Started C Started A Started D Started D Ended C Ended B Ended A Ended Main
 * is finished
 */

