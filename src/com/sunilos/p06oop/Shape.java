package com.sunilos.p06oop;

/**
 * Class contains Shape related attribute and methods.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */


public abstract class Shape {

	protected String color = null;
	protected int borderWidth = 0;

	//Default constructor 
	public Shape() {
	}

	//Parameterized constructor
	public Shape(String c, int bw) {
		color = c;
		borderWidth = bw;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}

	/**
	 * Area is abstract since its definition is known by it's specialized child
	 * class.
	 * 
	 * @return
	 */
	public abstract double area();

}
