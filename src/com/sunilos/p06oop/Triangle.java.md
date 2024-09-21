
```java
package com.sunilos.p06oop;

/**
 * The Triangle class extends the Shape class and represents a geometric triangle.
 * It includes attributes for the base and height of the triangle, and provides 
 * methods to calculate the area and access its properties.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Triangle extends Shape {

    /**
     * Base of the Triangle.
     */
    private int base;

    /**
     * Height of the Triangle.
     */
    private int height;

    /**
     * Gets the base of the Triangle.
     * 
     * @return The base of the Triangle.
     */
    public int getBase() {
        return base;
    }

    /**
     * Sets the base of the Triangle.
     * 
     * @param base The base value to set.
     */
    public void setBase(int base) {
        this.base = base;
    }

    /**
     * Gets the height of the Triangle.
     * 
     * @return The height of the Triangle.
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets the height of the Triangle.
     * 
     * @param height The height value to set.
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Calculates the area of the Triangle using the formula: 
     * (base * height) / 2.
     * 
     * @return The area of the Triangle.
     */
    public double area() {
        return (base * height) * 1 / 2;  // Calculate and return the area.
    }
}
```

### Explanation:

- **Purpose:** The `Triangle` class models a geometric triangle by extending the abstract `Shape` class. It defines specific attributes (base and height) and methods related to triangle geometry.

- **Attributes:**
  - `base`: An integer representing the base length of the triangle.
  - `height`: An integer representing the height of the triangle.

- **Getters and Setters:**
  - The `getBase` and `setBase` methods allow access to and modification of the `base` attribute.
  - The `getHeight` and `setHeight` methods allow access to and modification of the `height` attribute.

- **Area Calculation:** The `area` method implements the formula for the area of a triangle: \((\text{base} \times \text{height}) / 2\). This method calculates and returns the area based on the current values of base and height, demonstrating polymorphism by providing an implementation for the abstract method defined in the `Shape` class.
