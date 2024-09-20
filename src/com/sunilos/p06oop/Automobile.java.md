```java
package com.sunilos.p06oop;

/**
 * AutoMobile Class
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Automobile {

	private String color = null; // Variable to store the color of the automobile
	private int speed = 0; // Variable to store the speed of the automobile
	private int gear = 0; // Variable to store the current gear of the automobile
	private String make = null; // Variable to store the make/brand of the automobile

	// Getter method for color
	public String getColor() {
		return color;
	}

	// Setter method for color
	public void setColor(String color) {
		this.color = color; // Set the color of the automobile
	}

	// Getter method for speed
	public int getSpeed() {
		return speed;
	}

	// Setter method for speed
	public void setSpeed(int speed) {
		this.speed = speed; // Set the speed of the automobile
	}

	// Getter method for make
	public String getMake() {
		return make;
	}

	// Setter method for make
	public void setMake(String make) {
		this.make = make; // Set the make of the automobile
	}

	// Getter method for gear
	public int getGear() {
		return gear; // Return the current gear
	}

	// Method to change the gear by a specified amount
	public int changeGear(int g) {
		gear += g; // Update the gear by adding the specified value
		return gear; // Return the updated gear
	}
}
```

### Explanation:
- This class represents an automobile with properties like color, speed, gear, and make.
- It includes getter and setter methods for each property, allowing controlled access and modification.
- The `changeGear` method allows the user to change the gear by a specified amount and returns the new gear value.
