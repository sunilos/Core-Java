package com.sunilos.p11thread;

import java.util.Date;

/**
 * WaiterThread object releases the lock from the Message object by calling
 * wait() method and wait until notified by NotifierThread.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */

public class WaiterThread extends Thread {

	private Message msg = null;

	/**
	 * initializes thread name and message
	 * 
	 * @param name
	 * @param m
	 */
	public WaiterThread(String name, Message m) {
		super(name);
		this.msg = m;
	}

	/**
	 * Calls wait() method and releases lock from the Message object
	 */
	@Override
	public void run() {

		String name = getName();
		System.out.println(name + " started ");
		synchronized (msg) {
			try {
				System.out.println(name + " waiting since " + new Date());
				msg.wait(); // release lock
			} catch (InterruptedException e) {
			}
			System.out.println(name + " got notified at " + new Date());

			// process the message now
			System.out.println(name + " processed message " + msg.getMsg());
		}
	}

}
