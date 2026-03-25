
```java
package com.sunilos.p12swing;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Demonstrates the use of an anonymous class for handling mouse events
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestAnonymousClass {

    public static void main(String[] args) {

        JFrame f = new JFrame(); // Create a new JFrame

        JButton b = new JButton("Send"); // Create a button labeled "Send"
        
        // Add a mouse listener using an anonymous class
        b.addMouseListener(new MouseAdapter() {
            // Override the mouseClicked method to define custom behavior
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Clicked"); // Print message on mouse click
            }
        });

        f.add(b); // Add the button to the frame

        f.pack(); // Adjust the frame size to fit the components
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit the application on close
        f.setVisible(true); // Make the frame visible
    }
}
```

### Explanation:
- **JFrame**: A window is created using `JFrame`.
- **JButton**: A button labeled "Send" is created.
- **Anonymous Class**: A mouse listener is added to the button using an anonymous class, which allows for handling mouse events without explicitly defining a separate class.
- **Mouse Event Handling**: The `mouseClicked` method is overridden to print a message to the console when the button is clicked.
- **Window Properties**: The frame is set to exit the application when closed, and its size is adjusted to fit the button. Finally, the frame is made visible. 

When the button is clicked, "Mouse Clicked" will be printed in the console.
