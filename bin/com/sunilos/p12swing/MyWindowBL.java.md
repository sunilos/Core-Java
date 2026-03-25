```java
package com.sunilos.p12swing;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * MyWindowBL demonstrates the use of BorderLayout in a JFrame.
 * The program creates a window with buttons placed in different regions 
 * of the BorderLayout (North, South, East, West, and Center).
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class MyWindowBL {

    /**
     * The main method initializes the GUI components and makes the window visible.
     * 
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {

        // Create a JFrame (window) with a title
        JFrame frame = new JFrame("BorderLayout Demo");

        // Set the layout manager to BorderLayout
        BorderLayout layout = new BorderLayout();
        frame.setLayout(layout);

        // Get the default content pane of the JFrame
        JPanel pan = (JPanel) frame.getContentPane();

        // Create buttons for different regions of the BorderLayout
        JButton b1 = new JButton("North");
        pan.add(b1, BorderLayout.NORTH); // Add button to the North region

        JButton b2 = new JButton("South");
        pan.add(b2, BorderLayout.SOUTH); // Add button to the South region

        JButton b3 = new JButton("Right");
        pan.add(b3, BorderLayout.EAST); // Add button to the East region

        JButton b4 = new JButton("West");
        pan.add(b4, BorderLayout.WEST); // Add button to the West region

        JButton b5 = new JButton("Center");
        pan.add(b5); // Add button to the Center region (default)

        // Set the default close operation to exit the application when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Pack the components within the window
        frame.pack();

        // Make the window visible to the user
        frame.setVisible(true);
    }
}
```

### Explanation:
1. **JFrame**:
   - A `JFrame` is created with the title "BorderLayout Demo".

2. **BorderLayout**:
   - The layout manager is set to `BorderLayout`, which allows components to be added in five regions: North, South, East, West, and Center.

3. **JPanel**:
   - The default content pane is obtained as a `JPanel` to hold the buttons.

4. **JButtons**:
   - Five buttons are created and added to different regions of the `BorderLayout`:
     - `b1` is added to the North region.
     - `b2` is added to the South region.
     - `b3` is added to the East region.
     - `b4` is added to the West region.
     - `b5` is added to the Center region (by default).

5. **Close Operation**:
   - The application will exit when the window is closed, specified by `setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)`.

6. **Packing and Visibility**:
   - `frame.pack()` adjusts the frame size to fit the preferred size of its components.
   - Finally, `setVisible(true)` makes the window visible to the user.
