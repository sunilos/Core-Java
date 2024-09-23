```java
package com.sunilos.p12swing;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * MyWindowGL demonstrates the use of GridLayout in a Swing application.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class MyWindowGL {

    public static void main(String[] args) {

        // Create a JFrame for the GridLayout demo
        JFrame frame = new JFrame("GridLayout Demo");

        // Get the content pane and set the layout to GridLayout
        JPanel pane = (JPanel) frame.getContentPane();
        pane.setLayout(new GridLayout(3, 2)); // 3 rows and 2 columns

        // Create buttons and add them to the panel
        JButton b1 = new JButton("Button1");
        pane.add(b1);

        JButton b2 = new JButton("Button2");
        pane.add(b2);

        JButton b3 = new JButton("Button3");
        pane.add(b3);

        JButton b4 = new JButton("Button4");
        pane.add(b4);

        JButton b5 = new JButton("Button5");
        pane.add(b5);

        // Set default close operation and frame size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setVisible(true); // Make the frame visible
    }
}
```

### Explanation:
1. **MyWindowGL Class**:
   - Demonstrates the usage of `GridLayout`, which arranges components in a grid of specified rows and columns.

2. **JFrame Creation**:
   - A `JFrame` titled "GridLayout Demo" is created.

3. **JPanel and Layout**:
   - The content pane of the frame is set to use `GridLayout`, configured with 3 rows and 2 columns.

4. **Button Addition**:
   - Five buttons (`Button1`, `Button2`, `Button3`, `Button4`, and `Button5`) are created and added to the panel. They will be arranged in the specified grid layout.

5. **Frame Configuration**:
   - Sets the default close operation, size, and visibility of the frame.

The `GridLayout` automatically resizes the buttons to fill the available space in the grid cells, providing a neat and organized layout.
