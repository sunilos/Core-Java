```java
package com.sunilos.p12swing;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * MyWindowGBL demonstrates the use of GridBagLayout in a Swing application.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class MyWindowGBL {

    public static void main(String[] args) {

        // Create a JFrame for the GridBagLayout demo
        JFrame frame = new JFrame("GridBagLayout Demo");

        // Get the content pane and set the layout to GridBagLayout
        JPanel pane = (JPanel) frame.getContentPane();
        pane.setLayout(new GridBagLayout());

        // Create an instance of GridBagConstraints
        GridBagConstraints c = new GridBagConstraints();

        // Configure constraints for Button1
        c.fill = GridBagConstraints.HORIZONTAL; // Fill the space horizontally
        c.gridx = 0; // Column 0
        c.gridy = 0; // Row 0
        JButton b1 = new JButton("Button1");
        pane.add(b1, c); // Add Button1 to the panel

        // Configure constraints for Button2
        c.gridx = 1; // Column 1
        JButton b2 = new JButton("Button2");
        pane.add(b2, c); // Add Button2 to the panel

        // Configure constraints for Button3
        c.gridx = 2; // Column 2
        JButton b3 = new JButton("Button3");
        pane.add(b3, c); // Add Button3 to the panel

        // Configure constraints for Button4 (spans across 3 columns)
        c.gridwidth = 3; // Span 3 columns
        c.gridx = 0; // Column 0
        c.gridy = 1; // Row 1
        JButton b4 = new JButton("Button4");
        pane.add(b4, c); // Add Button4 to the panel

        // Configure constraints for Button5 (placed in Row 3, Column 2)
        c.gridwidth = 1; // Reset to span 1 column
        c.gridheight = 1; // Reset to span 1 row
        c.gridx = 2; // Column 2
        c.gridy = 3; // Row 3
        JButton b5 = new JButton("Button5");
        pane.add(b5, c); // Add Button5 to the panel

        // Set default close operation and frame size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setVisible(true); // Make the frame visible
    }
}
```

### Explanation:
1. **MyWindowGBL Class**:
   - Demonstrates the usage of `GridBagLayout`, which allows flexible positioning of components in a grid.

2. **JFrame Creation**:
   - A `JFrame` titled "GridBagLayout Demo" is created.

3. **JPanel and Layout**:
   - The content pane of the frame is set to use `GridBagLayout`, allowing complex component arrangements.

4. **GridBagConstraints**:
   - `GridBagConstraints` is used to specify constraints for components:
     - `fill` specifies how the component should be resized.
     - `gridx` and `gridy` specify the position of the component in the grid.
     - `gridwidth` and `gridheight` define how many columns and rows the component spans.

5. **Button Addition**:
   - Buttons (`Button1`, `Button2`, `Button3`, `Button4`, and `Button5`) are added to the panel with specific constraints.

6. **Frame Configuration**:
   - Sets the default close operation, size, and visibility of the frame.

This layout allows components to be easily arranged and resized in a flexible manner, making it ideal for complex interfaces.
