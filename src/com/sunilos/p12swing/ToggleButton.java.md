
```java
package com.sunilos.p12swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Creates a button and applies an ActionListener that listens to button click events.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class ToggleButton {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Demo Button Click"); // Create a JFrame with a title
        JPanel pane = (JPanel) frame.getContentPane(); // Get the content pane of the frame

        JButton b = new JButton("ON"); // Create a button labeled "ON"

        // Create button listener and add it to the button
        ButtonListener listener = new ButtonListener();
        b.addActionListener(listener); // Attach the listener to the button

        pane.add(b); // Add the button to the panel

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit on close
        frame.setSize(200, 100); // Set the size of the frame
        frame.setVisible(true); // Make the frame visible
    }
}

/**
 * Listens for button click events
 */
class ButtonListener implements ActionListener {

    /**
     * Change the button label on click
     */
    public void actionPerformed(ActionEvent event) {
        JButton b = (JButton) event.getSource(); // Get the button that triggered the event
        String label = b.getText(); // Get the current label of the button

        // Toggle the button label between "ON" and "OFF"
        if (label.equals("ON")) {
            b.setText("OFF"); // Change label to "OFF"
        } else if (label.equals("OFF")) {
            b.setText("ON"); // Change label back to "ON"
        }
    }
}
```

### Explanation:
- **Main Class**: The `ToggleButton` class contains the main method, where a `JFrame` and a `JButton` are created. The button starts with the label "ON".
- **ActionListener**: An instance of `ButtonListener`, which implements `ActionListener`, is created and attached to the button. This listener handles button click events.
- **Label Toggling**: Inside the `actionPerformed` method, the current label of the button is retrieved. The label toggles between "ON" and "OFF" each time the button is clicked.
- **Frame Configuration**: The frame is set to exit on close, sized appropriately, and made visible.

