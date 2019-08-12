package com.sunilos.p11thread;

/**
 * Prints information of all threads in system
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class ThreadInfo {

	/**
	 * Prints all thread information in JVM
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		Thread t = Thread.currentThread();// Get Current Thread from JVM

		ThreadGroup tg = t.getThreadGroup();// Get thread group object of
											// current running thread

		// Find Root ThreadGroup
		while (tg.getParent() != null) {
			tg = tg.getParent();
		}

		info("", tg);
	}

	/**
	 * Prints information of a thread group
	 * 
	 * @param indent
	 * @param tg
	 */
	public static void info(String indent, ThreadGroup tg) {

		int threadCount = tg.activeCount();// Get Active Thread Count

		Thread[] threads = new Thread[threadCount];
		tg.enumerate(threads);// Get Active Threads

		System.out.println(indent + "THREAD GROUP NAME: " + tg.getName());
		System.out.println(indent + "Is Daemon : " + tg.isDaemon());
		// Log Threads Details
		for (int i = 0; i < threads.length; i++) {
			log(indent + "\t", threads[i]);
		}

		int groupCount = tg.activeGroupCount();// Get Active ThreadGroup Count
		ThreadGroup[] groups = new ThreadGroup[groupCount];
		tg.enumerate(groups); // Get ThreadGroups

		for (int i = 0; i < groups.length; i++) {
			info(indent + "\t", groups[i]);
		}
	}

	/**
	 * Prints information of a thread
	 * 
	 * @param indent
	 * @param t
	 */
	public static void log(String indent, Thread t) {
		System.out.println(indent + "THREAD Name :" + t.getName());
		System.out.println(indent + "ID :" + t.getId());
		System.out.println(indent + "Priority :" + t.getPriority());
		System.out.println(indent + "State :" + t.getState());
		System.out.println(indent + "Thread Group :"
				+ t.getThreadGroup().getName());
		System.out.println(indent + "Is Alive :" + t.isAlive());
		System.out.println(indent + "Is Daemon :" + t.isDaemon() + "\n");
	}

}
