```java
package com.sunilos.p12swing;

import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * SwingComboBox demonstrates the creation of a combo box using Swing.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class SwingComboBox {
    public static void main(String[] args) {

        // Create a JFrame
        JFrame frame = new JFrame("Swing ComboBox");
        JPanel panel = (JPanel) frame.getContentPane();

        // Set the layout of the panel to FlowLayout
        FlowLayout layout = new FlowLayout();
        panel.setLayout(layout);

        // Create a JLabel for the combo box
        JLabel label = new JLabel("Gender: ");
        panel.add(label); // Add label to the panel

        // Create an array of gender options
        String gender[] = { "Male", "Female" };
        // Create a JComboBox with the gender options
        JComboBox<String> comboBox = new JComboBox<>(gender);
        panel.add(comboBox); // Add combo box to the panel

        // Set default close operation and make the frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); // Display the frame
        frame.pack(); // Adjust the frame to fit the components
    }
}
```

### Explanation:
1. **SwingComboBox Class**:
   - This class demonstrates how to create a combo box (dropdown menu) in a Swing application.

2. **JFrame Creation**:
   - A `JFrame` is created to serve as the main window, titled "Swing ComboBox".

3. **Panel and Layout**:
   - A `JPanel` is created and its layout is set to `FlowLayout`, which arranges components in a flowing manner.

4. **JLabel Creation**:
   - A `JLabel` is created with the text "Gender: " and added to the panel.

5. **JComboBox Creation**:
   - An array of gender options ("Male" and "Female") is created.
   - A `JComboBox` is initialized with the gender array and added to the panel.

6. **Frame Configuration**:
   - The default close operation is set to exit the application when the frame is closed.
   - The frame is made visible and packed to fit the components.

### Functionality:
- When you run the program, a window with a label "Gender: " and a combo box with options "Male" and "Female" will appear. Users can select their gender from the dropdown menu.
