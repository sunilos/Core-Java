package com.sunilos.p06oop;

/**
 * Inherits Shape class and contains attributes of Rectangle .
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class Rectangle extends Shape {

	/**
	 * Length of Rectangle
	 */
	private int length;

	/**
	 * Width of Rectangle
	 */
	private int width;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {

		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * Calculates area of Rectangle
	 */
	public double area() {

		return length * width;
	}

}
