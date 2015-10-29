package com.sunrays.enumpk;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public enum Human {

	KID(10), MAN(50), OLDMAN(70);

	private final int weight;

	Human(int w) {
		this.weight = w;
	}

	public void display() {
		System.out.println(weight);
	}
}