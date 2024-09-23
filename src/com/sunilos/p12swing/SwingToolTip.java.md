
```java
package com.sunilos.p12swing;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Attaching a tool tip to a button
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class SwingToolTip {

    public static void main(String[] args) {

        JFrame frame = new JFrame(); // Create a JFrame for the application
        JPanel pane = (JPanel) frame.getContentPane(); // Get the content pane of the frame

        // Create a JButton
        JButton button = new JButton("Save");

        // Attach a tool tip to the button
        button.setToolTipText("Click here to save File"); // Tooltip text shown on hover
        pane.add(button); // Add the button to the panel

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit the application when the window is closed
        frame.setVisible(true); // Make the frame visible
        frame.pack(); // Adjust the frame size to fit its content
    }
}
```

### Explanation:
- **JFrame**: A window is created using `JFrame`.
- **JPanel**: The content pane of the frame is retrieved for adding components.
- **JButton**: A button labeled "Save" is created.
- **ToolTip**: A tooltip is attached to the button using `setToolTipText()`, providing a helpful message that appears when the user hovers over the button.
- **Window Properties**: The close operation is set to exit the application when the window is closed, the frame is made visible, and its size is adjusted to fit the components.
