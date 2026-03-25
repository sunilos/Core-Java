
```java
package com.sunilos.p12swing;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 * Window Handler Using Window Listener
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class WindowHandler implements WindowListener {

    // Triggered when the window is opened
    public void windowOpened(WindowEvent e) {
        System.out.println("Opened");
    }

    // Triggered when the window is activated (focused)
    public void windowActivated(WindowEvent e) {
        System.out.println("Activated");
    }

    // Triggered when the window is deactivated (unfocused)
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Minimized");
    }

    // Triggered when the window is restored from a minimized state
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Maximized");
    }

    // Triggered when the window is minimized
    public void windowIconified(WindowEvent e) {
        System.out.println("Iconified");
    }

    // Triggered when the window is closing (when the user initiates close)
    public void windowClosing(WindowEvent e) {
        System.out.println("Closing");
    }

    // Triggered when the window is completely closed
    public void windowClosed(WindowEvent e) {
        System.out.println("Closed");
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Demo WindowListener"); // Create a JFrame with a title
        frame.addWindowListener(new WindowHandler()); // Attach the WindowListener to the frame

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit on close
        frame.setSize(200, 100); // Set the size of the frame
        frame.setVisible(true); // Make the frame visible
    }
}
```

### Explanation:
- **WindowListener Interface**: The `WindowHandler` class implements the `WindowListener` interface, which provides methods for handling various window events.
- **Event Methods**: Each method corresponds to a different window event:
  - `windowOpened`: Called when the window is opened.
  - `windowActivated`: Called when the window gains focus.
  - `windowDeactivated`: Called when the window loses focus (often minimized).
  - `windowDeiconified`: Called when the window is restored from a minimized state.
  - `windowIconified`: Called when the window is minimized.
  - `windowClosing`: Called when the window is about to close.
  - `windowClosed`: Called after the window is closed.
- **Main Method**: In the `main` method, a `JFrame` is created, and the `WindowHandler` instance is added as a listener. The frame is configured to exit on close, sized appropriately, and made visible.

