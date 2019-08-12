package com.sunilos.p11thread;

/**
 * Test Threads execution with different priorities
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class PriorityThread extends Thread {

	public PriorityThread(String name) {
		super(name);
	}

	public void run() {
		for (int x = 1; x <= 500; x++)
			System.out.println(getName() + " P = " + getPriority());
	}

	public static void main(String[] args) {

		PriorityThread t1 = new PriorityThread("T # A");
		PriorityThread t2 = new PriorityThread("T # B");
		PriorityThread t3 = new PriorityThread("T # C");

		t1.setPriority(3);// priority
		t2.setPriority(1); // Lowest priority
		// t3 has default priority 5

		t1.start();
		t2.start();
		t3.start();
	}

}
