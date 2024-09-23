
```java
package com.sunilos.p12swing;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Testing of Local Class
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestLocalClass {

    public static void main(String[] args) {
        
        // Define a local class that extends MouseAdapter to handle mouse events
        class LocalClass extends MouseAdapter {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Clicked"); // Action to perform on mouse click
            }
        }

        JFrame f = new JFrame(); // Create a new JFrame

        LocalClass h = new LocalClass(); // Instantiate the local class

        JButton b = new JButton("Send"); // Create a JButton with the label "Send"
        b.addMouseListener(h); // Attach the mouse listener to the button
        f.add(b); // Add the button to the frame

        f.pack(); // Size the frame to fit its components
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit on close
        f.setVisible(true); // Make the frame visible
    }
}
```

### Explanation:
- **Local Class**: A local class `LocalClass` is defined inside the `main` method, extending `MouseAdapter` to handle mouse click events. This class has a method `mouseClicked` that prints a message when the button is clicked.
- **JFrame and JButton**: A `JFrame` is created to hold the components, and a `JButton` labeled "Send" is created.
- **Event Handling**: The local class instance `h` is added as a mouse listener to the button, enabling the click event handling.
- **Frame Configuration**: The frame is packed to fit its components, set to exit on close, and made visible to the user. 

