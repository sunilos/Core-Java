
```java
package com.sunilos.p12swing;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * Text Area in Swing
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class SwingTextArea {

    public static void main(String[] args) {

        JFrame frame = new JFrame(); // Create a JFrame for the application

        JPanel pane = (JPanel) frame.getContentPane(); // Get the content pane of the frame

        JLabel label = new JLabel("Email : "); // Create a label for the text area
        pane.add(label, BorderLayout.NORTH); // Add the label to the north position of the panel

        JTextArea text = new JTextArea(5, 80); // Create a JTextArea with 5 rows and 80 columns
        pane.add(text); // Add the text area to the panel

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit the application when the window is closed

        frame.setSize(200, 100); // Set the size of the frame

        frame.setVisible(true); // Make the frame visible

    }
}
```

### Explanation:
- **JFrame**: The main window of the application is created using `JFrame`.
- **JPanel**: A panel is obtained from the frame to hold the components.
- **JLabel**: A label is created to indicate that the text area is for entering an email.
- **JTextArea**: A multi-line text area is created to allow users to input text, configured with a specific number of rows and columns.
- **Window Properties**: The close operation is set to exit the application, the frame size is defined, and the frame is made visible.
