```java
package com.sunilos.p12swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * FirstWindow creates a simple graphical user interface (GUI) with a JFrame 
 * containing a JButton. This program serves as an introductory example of 
 * using Swing components in Java.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class FirstWindow {

    /**
     * The main method initializes the GUI components and makes the window visible.
     * 
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {

        // Create a JFrame (window) and set its title
        JFrame frame = new JFrame("My First Window");

        // Get the default content pane of the JFrame
        JPanel pane = (JPanel) frame.getContentPane();

        // Create a JButton and add it to the JPanel
        JButton b = new JButton("Click Me");
        pane.add(b); // Add the button to the panel

        // Set the default close operation to exit the application when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        // Set the size of the window
        frame.setSize(200, 100); // Width: 200, Height: 100

        // Make the window visible to the user
        frame.setVisible(true);
    }
}
```

### Explanation:
1. **JFrame**:
   - The `JFrame` object (`frame`) is created to serve as the main window for the application. The title is set to "My First Window".

2. **JPanel**:
   - The default content pane of the `JFrame` is obtained as a `JPanel`, which acts as the container for GUI components.

3. **JButton**:
   - A `JButton` labeled "Click Me" is created and added to the panel.

4. **Close Operation**:
   - The `setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)` method ensures that the application exits when the window is closed.

5. **Window Size**:
   - The size of the window is set to 200 pixels wide and 100 pixels high.

6. **Visibility**:
   - Finally, `setVisible(true)` makes the window visible to the user, allowing interaction with the button.
