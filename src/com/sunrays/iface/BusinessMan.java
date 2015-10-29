package com.sunrays.iface;


/**
 * Businessman implements two interfaces Social Worker and Richman
 *
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 */

public class Businessman implements Richman, SocialWorker {

	private String name;
	private String address;

	public void donation() {
		System.out.println("Giving Donation");
	}

	public void earnMony() {
		System.out.println("Earning Money");
	}

	public void party() {
		System.out.println("Doing Party");
	}

	public void helpToOthers() {
		System.out.println("Helping to Others");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
