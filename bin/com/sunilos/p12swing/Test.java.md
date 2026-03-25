
```java
package com.sunilos.p12swing;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Message Dialog Box using JOptionPane
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Test {

    /**
     * Main method to display a message dialog
     * @param args Command line arguments
     */
    public static void main(String[] args) {

        JFrame frame = new JFrame(); // Create a JFrame for the application
        
        // Show a message dialog box with a message
        JOptionPane.showMessageDialog(frame, "Data is saved !");

        // Set a close operation to exit the application when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit on close
        frame.setSize(400, 200); // Set the size of the window
        frame.setVisible(true); // Make the frame visible
    }
}
```

### Explanation:
- **JFrame**: A window is created using `JFrame`.
- **JOptionPane**: A message dialog box is displayed using `showMessageDialog()`, which informs the user that the data has been saved.
- **Window Properties**: The close operation is set to exit the application when the window is closed, the frame size is defined, and the frame is made visible. 

