```java
package com.sunilos.p12swing;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * OuterClass demonstrates the use of inner and static inner classes
 * for handling mouse and focus events in a Swing application.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class OuterClass {

    private int instanceVar = 0; // Instance variable
    private static int staticVar = 0; // Static variable

    /**
     * Instance method to demonstrate instance-level access.
     */
    private void instanceMethod() {
        System.out.println("Instance Method");
    }

    /**
     * Static method to demonstrate static-level access.
     */
    private static void staticMethod() {
        System.out.println("Static Method");
    }

    // Inner class to handle mouse events
    private class InnMouseHandler extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Mouse Clicked");
            // Accessing instance and static variables/methods
            instanceVar = 0;
            staticVar = 0;
            instanceMethod();
            staticMethod();
        }
    }

    // Static inner class to handle focus events
    private static class FocusHandler extends FocusAdapter {
        @Override
        public void focusGained(FocusEvent e) {
            System.out.println("Focus gained");
            // Accessing static variables/methods
            staticVar = 0;
            staticMethod();
        }
    }

    /**
     * Main method to create a JFrame and demonstrate inner class usage.
     * 
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {

        // Create a JFrame
        JFrame f = new JFrame();

        // Create an instance of OuterClass
        OuterClass o = new OuterClass();
        InnMouseHandler h = o.new InnMouseHandler(); // Create inner class instance

        // Create a JButton and add mouse listener
        JButton b = new JButton("Send");
        b.addMouseListener(h);
        f.add(b);

        // Create and add focus listener for the button
        FocusHandler fh = new OuterClass.FocusHandler();
        b.addFocusListener(fh);

        // Set up the frame
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
```

### Explanation:
1. **OuterClass**:
   - Contains instance and static variables and methods. It demonstrates how inner and static inner classes can access these members.

2. **Inner Class (InnMouseHandler)**:
   - A non-static inner class that extends `MouseAdapter`. It overrides the `mouseClicked` method to perform actions when the button is clicked. It can access both instance and static members of `OuterClass`.

3. **Static Inner Class (FocusHandler)**:
   - A static inner class that extends `FocusAdapter`. It overrides the `focusGained` method to respond when the button gains focus. It can only access static members of `OuterClass`.

4. **Main Method**:
   - Sets up a simple Swing interface with a `JFrame` containing a `JButton`. It creates instances of both inner classes to handle mouse clicks and focus events.

5. **Event Handling**:
   - When the button is clicked, `InnMouseHandler` is triggered, printing "Mouse Clicked" and calling the relevant methods. When the button gains focus, `FocusHandler` prints "Focus gained."
