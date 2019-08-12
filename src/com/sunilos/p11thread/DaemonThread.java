package com.sunilos.p11thread;

/**
 * Daemon Threads has infinite loop that wake in every 500 milliseconds
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */
public class DaemonThread extends Thread {

	public void run() {

		System.out.println("Daemon T started " + Thread.currentThread());

		// Infinite loop wake in every 500ms
		while (true) {
			try {
				Thread.sleep(500);
				System.out.println("Daemon T: woke up again");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	/**
	 * Creates Daemon thread and test
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Main Started");

		// Create Thread, make it Daemon and start
		DaemonThread t = new DaemonThread();
		t.setDaemon(true);
		t.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Leaving main method, now JVM will exit");
	}
}
