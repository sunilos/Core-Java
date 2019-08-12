package com.sunilos.p11thread;

/**
 * Creates a Thread Group and add multiple PlayerThread objects to this group.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class PlayerThread extends Thread {

	/**
	 * Constructor receives thread group along with thread name
	 * 
	 * @param tg
	 * @param name
	 */
	public PlayerThread(ThreadGroup tg, String name) {
		super(tg, name);
	}

	public void run() {
		for (int match = 1; match < 10; match++) {
			String msg = getName();
			msg += " played match#" + match;
			System.out.println(msg);
		}
	}

	public static void main(String[] args) {

		ThreadGroup team = new ThreadGroup("Team India");

		PlayerThread p1 = new PlayerThread(team, "Jay");
		PlayerThread p2 = new PlayerThread(team, "Vijay");
		p1.start();
		p2.start();

		System.out.println("Thread Group Info");

		System.out.println("Name:" + team.getName());
		System.out.println("Parent Group " + team.getParent());

		// Number of active threads in the group
		System.out.println("Active Threads " + team.activeCount());
		// Number of active sub groups in the group
		System.out.println("Active subgroups " + team.activeGroupCount());

	}

}
