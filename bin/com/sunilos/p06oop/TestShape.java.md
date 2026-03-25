
```java
package com.sunilos.p06oop;

/**
 * The TestShape class demonstrates the functionality of the Circle class,
 * which is a subclass of the Shape class. It tests the methods for setting
 * and getting attributes, as well as calculating the area of the circle.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestShape {

    public static void main(String[] args) {

        // Create an instance of Circle.
        Circle c = new Circle();
        
        // Set properties for the Circle instance.
        c.setColor("Red");              // Set the color to "Red".
        c.setBorderWidth(5);            // Set the border width to 5.
        c.setRadius(2);                 // Set the radius to 2.

        // Print the properties of the Circle.
        System.out.println(c.getColor());          // Output the color.
        System.out.println(c.getBorderWidth());    // Output the border width.
        System.out.println(c.getRadius());          // Output the radius.
        System.out.println(c.area());               // Output the area of the Circle.

        // Declare a Shape reference and assign it to a Circle object.
        Shape s = new Circle();

        // Set properties for the Shape reference, which points to a Circle object.
        s.setColor("Red");              // Set the color to "Red".
        s.setBorderWidth(5);            // Set the border width to 5.

        // Print the properties using the Shape reference.
        System.out.println(s.getColor());          // Output the color.
        System.out.println(s.getBorderWidth());    // Output the border width.
    }
}
```

### Explanation:

- **Purpose:** The `TestShape` class is designed to test the functionality of the `Circle` class, which extends the `Shape` class. It demonstrates setting attributes, retrieving them, and calculating the area.

- **Creating Circle Instance:** An instance of `Circle` is created, allowing access to its methods for setting properties like color, border width, and radius.

- **Setting Properties:** The `setColor`, `setBorderWidth`, and `setRadius` methods are called to initialize the `Circle` object's attributes.

- **Printing Properties:** The program retrieves and prints the attributes using their respective getter methods, including the calculated area using the `area` method.

- **Using Shape Reference:** A `Shape` reference variable `s` is declared and initialized with a `Circle` object. This demonstrates polymorphism, where a subclass (Circle) is referenced by a superclass type (Shape).

- **Setting and Printing via Shape Reference:** Properties are set and printed using the `Shape` reference, showcasing that the `Shape` reference can still access the overridden methods from the `Circle` class.
