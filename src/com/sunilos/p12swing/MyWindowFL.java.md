```java
package com.sunilos.p12swing;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * MyWindowFL demonstrates the use of FlowLayout in a JFrame.
 * The program creates a window that arranges components in a flow,
 * aligning them from left to right.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class MyWindowFL {

    /**
     * The main method initializes the GUI components and makes the window visible.
     * 
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {

        // Create a JFrame (window) with a title
        JFrame frame = new JFrame("FlowLayout Demo");

        // Get the content pane of the frame
        JPanel pan = (JPanel) frame.getContentPane();

        // Set FlowLayout that left-aligns components
        FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
        pan.setLayout(layout);

        // Create and add buttons to the panel
        JButton b1 = new JButton("Button 1");
        pan.add(b1);

        JButton b2 = new JButton("Button 2");
        pan.add(b2);

        JButton b3 = new JButton("Button 3");
        pan.add(b3);

        JButton b4 = new JButton("Long-Named Button 4");
        pan.add(b4);

        JButton b5 = new JButton("5");
        pan.add(b5);

        // Set the default close operation for the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Pack the frame to fit its components
        frame.pack();

        // Make the window visible
        frame.setVisible(true);
    }
}
```

### Explanation:
1. **JFrame**:
   - A `JFrame` is created to serve as the main window, titled "FlowLayout Demo."

2. **FlowLayout**:
   - The `FlowLayout` is used as the layout manager for the panel. It arranges components in a left-aligned flow, wrapping them as needed when the window is resized.

3. **Buttons**:
   - Several buttons are created and added to the panel. The buttons will flow from left to right within the panel, automatically adjusting their position based on the available space.

4. **Main Method**:
   - Initializes the GUI components, sets the default close operation for the frame, and packs the components to fit within the window. The frame is then made visible.

5. **Component Arrangement**:
   - When the window is resized, the buttons will re-arrange themselves according to the rules of the `FlowLayout`, maintaining their left alignment.
