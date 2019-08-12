package com.sunilos.p14system;


/**
 * Performs key operations to run Garbage Collector, load external libraries,
 * map the library name to OS specific String, run the finalize method for any
 * object waiting for finalization and to terminate the JVM.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestSystemKeyOperations {

	public static void main(String[] args) {

		// run the garbage collector
		System.gc();
		System.out.println("Garbage collector executed.");

		// map library name
		String libName = System.mapLibraryName("os.name");
		System.out.println("os.name library=" + libName);

		// run finalization
		System.runFinalization();

		// terminates the currently running JVM
		System.exit(1);

		// this line will never print because JVM is terminated
		System.out.println("JVM is terminated");

	}

}
