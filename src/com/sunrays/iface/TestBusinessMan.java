package com.sunrays.iface;

/**
 * Test different views of Businessman
 * 
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 */

public class TestBusinessMan {

	public static void main(String[] args) {

		// Seeing Businessman as a Richman so can access only methods of
		// Richman.
		Richman rm = new Businessman();
		rm.donation();
		rm.earnMony();
		rm.party();

		// Seeing Businessman as a Social Worker so can access only methods of
		// SocialWorker
		SocialWorker sw = new Businessman();
		sw.helpToOthers();

		Businessman bm = new Businessman();
		// Can access all methods
		bm.donation();
		bm.earnMony();
		bm.party();
		bm.helpToOthers();
		bm.setName("Dhirubhai Ambani");
		System.out.println(bm.getName());

	}
}
