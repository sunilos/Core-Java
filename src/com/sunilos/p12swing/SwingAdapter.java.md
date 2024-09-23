```java
package com.sunilos.p12swing;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * SwingAdapter demonstrates the use of a mouse listener using an adapter.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class SwingAdapter {

    public static void main(String[] args) {

        // Create a JFrame for the button click demo
        JFrame frame = new JFrame("Demo Button Click");
        JPanel pane = (JPanel) frame.getContentPane();
        JButton b = new JButton("Mouse Test");

        // Create button listener and add it to the button
        MouseHandler listener = new MouseHandler();
        b.addMouseListener(listener);

        // Add button to the panel
        pane.add(b);

        // Set default close operation and frame size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 100);
        frame.setVisible(true); // Make the frame visible

    }
}

/**
 * MouseHandler class to handle mouse events using MouseAdapter.
 */
class MouseHandler extends MouseAdapter {
    @Override
    public void mouseEntered(MouseEvent event) {
        System.out.println("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent event) {
        System.out.println("Mouse Exit");
    }
}
```

### Explanation:
1. **SwingAdapter Class**:
   - Demonstrates the usage of a mouse listener with an adapter class to handle mouse events for a button.

2. **JFrame Creation**:
   - A `JFrame` titled "Demo Button Click" is created, along with a `JPanel` and a `JButton` labeled "Mouse Test".

3. **MouseHandler Class**:
   - This inner class extends `MouseAdapter` to override the `mouseEntered` and `mouseExited` methods, providing custom behavior when the mouse enters or exits the button.

4. **Adding Mouse Listener**:
   - An instance of `MouseHandler` is created and added to the button to listen for mouse events.

5. **Frame Configuration**:
   - Sets the default close operation, size, and visibility of the frame.

### Functionality:
- When the mouse pointer enters or exits the button area, the corresponding messages ("Mouse Entered" or "Mouse Exit") are printed to the console, demonstrating how to handle mouse events in a Swing application using an adapter.
