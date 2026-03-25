
```java
package com.sunilos.p12swing;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;

/**
 * Spinner in Swing
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class SwingSpinner {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Spinner"); // Create a JFrame with the title "Swing Spinner"
        JPanel panel = (JPanel) frame.getContentPane(); // Get the content pane of the frame
        panel.setLayout(new GridLayout(1, 2)); // Set the layout to a grid with 1 row and 2 columns

        JLabel label = new JLabel("  Exp : "); // Create a label for the spinner
        panel.add(label); // Add the label to the panel

        // Create a spinner for selecting numeric values
        JSpinner spinner = new JSpinner();
        spinner.setSize(20, 30); // Set the preferred size of the spinner (not usually effective)
        panel.add(spinner); // Add the spinner to the panel

        // Set the default close operation for the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit the application when the window is closed
        frame.pack(); // Size the frame to fit the components
        frame.setVisible(true); // Make the frame visible
    }
}
```

### Explanation:
- **JFrame and JPanel**: The main window is created using `JFrame`, and a `JPanel` is used to organize components.
- **GridLayout**: The panel uses a `GridLayout` to arrange the label and spinner side by side.
- **JLabel**: A label is created to indicate what the spinner represents (in this case, "Exp").
- **JSpinner**: A spinner is instantiated, allowing users to select numeric values incrementally. While size is set, it typically does not affect the display.
- **Window Properties**: The close operation is defined to exit the application, and the frame is resized and made visible.
