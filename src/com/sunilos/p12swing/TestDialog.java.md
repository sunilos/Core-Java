
```java
package com.sunilos.p12swing;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Creates and tests the dialog window.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestDialog {

    public static void main(String[] args) {

        // Create the main window and set its title
        JFrame frame = new JFrame("My First Window");

        // Get the default panel of the frame
        JPanel pane = (JPanel) frame.getContentPane();

        // Create a button labeled "Click Me" and add it to the panel
        JButton b = new JButton("Click Me");
        pane.add(b);

        // Set the default close operation to exit the application on window close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the size of the window
        frame.setSize(200, 100);

        // Make the window visible
        frame.setVisible(true);
        
        // Create a dialog window
        JDialog dialog = new JDialog();
        dialog.setTitle("Alarm!!"); // Set the dialog title
        dialog.add(new JButton("Ok")); // Add an "Ok" button to the dialog
        dialog.pack(); // Adjust the dialog size to fit its components
        dialog.setVisible(true); // Make the dialog visible
    }
}
```

### Explanation:
- **JFrame**: A main window titled "My First Window" is created.
- **JPanel**: The default panel of the frame is retrieved to add components.
- **JButton**: A button labeled "Click Me" is created and added to the panel.
- **Window Properties**: The application is set to exit when the window is closed, and the size of the frame is defined.
- **JDialog**: A dialog titled "Alarm!!" is created, which contains an "Ok" button. The dialog is sized to fit its components and made visible.

