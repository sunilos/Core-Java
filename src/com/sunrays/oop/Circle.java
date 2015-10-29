package com.sunrays.oop;

/**
 * Contains Circle attributes and Child of Shape class.
 * 
* @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 */

public class Circle extends Shape {

	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double area() {

		return 3.14 * radius * radius;
	}

}
