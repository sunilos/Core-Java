package com.sunilos.p14system;


/**
 * Apply application security manager
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class SystemSecurityManager {

	public static void main(String[] args)  {

		SecurityManager secManager = System.getSecurityManager();
		if (secManager == null) {
			System.out.println("SecurityManager is not configured");
		}
		SecurityManager mySecManager = new SecurityManager();
		System.setSecurityManager(mySecManager);

		secManager = System.getSecurityManager();
		if (secManager != null) {
			System.out.println("SecurityManager is configured");
		}
	}
}
