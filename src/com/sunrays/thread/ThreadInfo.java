package com.sunrays.thread;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class ThreadInfo {

	public static void main(String[] args) throws Exception{
		
		Thread t = Thread.currentThread();//Get Currect Thread
				
		ThreadGroup tg = t.getThreadGroup();
		
		//Get Root ThreadGroup
		while(tg.getParent() !=null){
			tg=tg.getParent() ;
		}
		
		HelloWithThread t1 = new HelloWithThread("Sachin Tendulakar");
		t1.setPriority(1);
		
		HelloWithThread t2 = new HelloWithThread("Sourabh Ganguly");
		t2.setPriority(1);

		t1.start();
		t2.start();

		info("", tg);
	}

	public static void info(String indent, ThreadGroup tg) {

		int threadCount = tg.activeCount();//Get Active Thread Count
		
		Thread[] threads = new Thread[threadCount];
		tg.enumerate(threads);//Get Active Threads

		System.out.println(indent + "THREAD GROUP NAME: " + tg.getName());
		System.out.println(indent + "Is Daemon : " + tg.isDaemon());
		//Log Threads Details
		for (int i = 0; i < threads.length; i++) {
			log( indent + "\t" , threads[i]);
		}

		int groupCount = tg.activeGroupCount();//Get Active ThreadGroup Count
		ThreadGroup[] groups = new ThreadGroup[groupCount]; 
		tg.enumerate(groups); //Get ThreadGroups
		
		for (int i = 0; i < groups.length; i++) {
			info(indent + "\t", groups[i]);
		}
	}

	public static void log(String indent, Thread t) {
		System.out.println(indent + "THREAD Name :" + t.getName());
		System.out.println(indent + "ID :" + t.getId());
		System.out.println(indent + "Priority :" + t.getPriority());
		System.out.println(indent + "State :" + t.getState());
		System.out.println(indent + "Thread Group :" + t.getThreadGroup().getName());
		System.out.println(indent + "Is Alive :" + t.isAlive());
		System.out.println(indent + "Is Daemon :" + t.isDaemon() +"\n");
	}

}
