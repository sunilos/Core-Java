```java
package com.sunilos.p06oop;

/**
 * Inherits Shape class and contains attributes of Circle.
 * This class represents a circle, which is a specific type of shape.
 *
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class Circle extends Shape {

	/**
	 * Instance variable contains radius of Circle
	 */
	private int radius; // Radius of the circle

	/**
	 * PI is the constant
	 */
	public static final double PI = 3.14; // Static variable for the value of π

	/**
	 * Gets the radius of the circle.
	 * 
	 * @return The current radius.
	 */
	public int getRadius() {
		return radius;
	}

	/**
	 * Sets the radius of the circle.
	 * 
	 * @param radius The radius to be set.
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}

	/**
	 * Calculates area of Circle.
	 * 
	 * @return The area of the circle based on its radius.
	 */
	public double area() {
		double area = 0; // Initialize area
		area = PI * radius * radius; // Formula for area of a circle: πr²
		return area; // Return the calculated area
	}
}
```

### Explanation:
- The `Circle` class extends the `Shape` class, indicating that it inherits attributes and methods from the `Shape` class.
- It contains a private instance variable `radius` to store the circle's radius.
- The constant `PI` is defined as a static variable to hold the value of π.
- The class provides getter and setter methods for the `radius` attribute, allowing access and modification of its value.
- The `area` method calculates and returns the area of the circle using the formula \( \text{area} = \pi \times \text{radius}^2 \).
