package com.sunrays.basic;
/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class TestPoly {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shape[] s = new Shape[3];
		s[0] = new Rectangle();
		s[1] = new Circle();
		s[2] = new Triangle();
		double totalArea = calcArea(s);

		System.out.println(totalArea);
	}

	public static double calcArea(Shape[] s) {

		double totalArea = 0;
		for (int i = 0; i < s.length; i++) {
			totalArea = s[i].area();
		}
		return totalArea;
	}

	public static Shape getShape(int i) {

		if (i == 1)
			return new Rectangle();
		if (i == 1)
			return new Circle();
		if (i == 1)
			return new Triangle();
		
		return null;
	}

}
