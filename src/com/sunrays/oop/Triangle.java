package com.sunrays.oop;

/**
 * Contains Triangle attributes and Child of Shape class.
 * 
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 */

public class Triangle extends Shape {

	private int base = 0;
	private int height = 0;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double area() {
		return (base * height) / 2;
	}

}
