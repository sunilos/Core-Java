**```java
package com.sunilos.p12swing;

import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * SwingCheckBox demonstrates the creation of a checkbox using Swing.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class SwingCheckBox {
    public static void main(String[] args) {

        // Create a JFrame titled "Swing CheckBox"
        JFrame frame = new JFrame("Swing CheckBox");
        JPanel panel = (JPanel) frame.getContentPane();
        
        // Set the layout of the panel to FlowLayout
        FlowLayout layout = new FlowLayout();
        panel.setLayout(layout);

        // Create a JCheckBox labeled "Has Account?"
        JCheckBox checkBox = new JCheckBox("Has Account?");
        panel.add(checkBox); // Add checkbox to the panel

        // Set default close operation and make the frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); // Display the frame
        frame.pack(); // Adjust the frame to fit the components
    }
}
```

### Explanation:
1. **SwingCheckBox Class**:
   - This class demonstrates how to create a checkbox in a Swing application.

2. **JFrame Creation**:
   - A `JFrame` titled "Swing CheckBox" is created, which serves as the main window for the application.

3. **Panel and Layout**:
   - A `JPanel` is created as the content pane for the frame, and its layout is set to `FlowLayout`, which arranges components in a left-to-right flow.

4. **JCheckBox Creation**:
   - A `JCheckBox` is created with the label "Has Account?" and added to the panel.

5. **Frame Configuration**:
   - The default close operation is set to exit the application when the frame is closed.
   - The frame is made visible and packed to fit the components properly.

### Functionality:
- When you run the program, a window with a checkbox labeled "Has Account?" will appear, allowing users to check or uncheck the box.**
