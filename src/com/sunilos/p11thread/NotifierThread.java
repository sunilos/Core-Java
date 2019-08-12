package com.sunilos.p11thread;

import java.util.Date;

/**
 * Notifier notifies to thread(s), waiting for acquiring lock (monitor) on
 * Message object
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */
public class NotifierThread extends Thread {

	private Message msg;

	/**
	 * initializes message and thread name
	 * 
	 * @param msg
	 */
	public NotifierThread(Message msg) {
		super("Notifier");
		this.msg = msg;
	}

	/**
	 * notifies waiter who are waiting for message lock
	 */
	@Override
	public void run() {

		String name = getName();
		System.out.println(name + " started");

		try {
			Thread.sleep(1000);
			synchronized (msg) {

				msg.setMsg(name + " notified at " + new Date());
				msg.notify();// Notify to one waiting thread
				// msg.notifyAll(); // Notify to all waiting thread
			}
		} catch (InterruptedException e) {
		}

	}

}