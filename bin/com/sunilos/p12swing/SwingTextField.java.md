
```java
package com.sunilos.p12swing;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * Text Field in Swing
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class SwingTextField {

    public static void main(String[] args) {

        JFrame frame = new JFrame(); // Create a JFrame for the application

        JPanel pane = (JPanel) frame.getContentPane(); // Get the content pane of the frame
        pane.setLayout(new GridLayout(2, 2)); // Set the layout to a grid with 2 rows and 2 columns

        JLabel login = new JLabel("Login : "); // Create a label for the login field
        pane.add(login); // Add the login label to the panel

        JTextField text = new JTextField(); // Create a text field for user input
        pane.add(text); // Add the text field to the panel

        JLabel pwd = new JLabel("Password : "); // Create a label for the password field
        pane.add(pwd); // Add the password label to the panel

        JPasswordField pwdT = new JPasswordField(); // Create a password field to hide user input
        pane.add(pwdT); // Add the password field to the panel

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit the application when the window is closed

        frame.setSize(200, 80); // Set the size of the frame

        frame.setVisible(true); // Make the frame visible

    }
}
```

### Explanation:
- **JFrame**: A window is created using `JFrame`.
- **JPanel**: The content pane of the frame is retrieved and a grid layout is set, organizing components in 2 rows and 2 columns.
- **JLabel**: Labels are created for the login and password fields to inform the user what input is expected.
- **JTextField**: A regular text field is created for the user to input their login.
- **JPasswordField**: A password field is created, which obscures the text input for security purposes.
- **Window Properties**: The close operation is set to exit the application, the frame size is defined, and the frame is made visible.
