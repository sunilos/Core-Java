
```java
package com.sunilos.p06oop;

/**
 * The Rectangle class inherits from the Shape class and represents a rectangle
 * with attributes for length and width. It also provides methods for calculating
 * the area of the rectangle.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Rectangle extends Shape {

    /**
     * The length of the rectangle. 
     * This attribute is private and accessed through getter and setter methods.
     */
    private int length;

    /**
     * The width of the rectangle. 
     * This attribute is private and accessed through getter and setter methods.
     */
    private int width;

    /**
     * Getter method for the length of the rectangle.
     * 
     * @return the length of the rectangle.
     */
    public int getLength() {
        return length;
    }

    /**
     * Setter method for the length of the rectangle.
     * 
     * @param length the length to set for the rectangle.
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * Getter method for the width of the rectangle.
     * 
     * @return the width of the rectangle.
     */
    public int getWidth() {
        return width;
    }

    /**
     * Setter method for the width of the rectangle.
     * 
     * @param width the width to set for the rectangle.
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Calculates and returns the area of the rectangle.
     * The area is calculated by multiplying the length by the width.
     * 
     * @return the area of the rectangle.
     */
    public double area() {
        return length * width;
    }
}
```

### Explanation:

- **Inheritance:** The `Rectangle` class extends the `Shape` class, meaning it inherits properties and methods from `Shape`. (Although the `Shape` class is not provided, we assume it is a parent class with common attributes or methods for shapes.)
- **Encapsulation:** The `length` and `width` attributes are private and accessed through getter and setter methods.
- **Area Calculation:** The `area()` method calculates the area of the rectangle by multiplying its `length` and `width`, and it returns the result as a `double`.
