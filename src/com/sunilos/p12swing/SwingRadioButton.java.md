
```java
package com.sunilos.p12swing;

import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * SwingRadioButton demonstrates the use of a checkbox in Swing.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class SwingRadioButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing CheckBox");
        JPanel panel = (JPanel) frame.getContentPane();
        FlowLayout layout = new FlowLayout();
        panel.setLayout(layout);

        // Create Checkbox
        JCheckBox checkBox = new JCheckBox("Has Account?");
        panel.add(checkBox);

        // Set default close operation and make the frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
    }
}
```

### Explanation:
1. **Class Declaration**:
   - The class `SwingRadioButton` demonstrates the use of a checkbox.

2. **Main Method**:
   - Creates a `JFrame` titled "Swing CheckBox" and a `JPanel` with a `FlowLayout`.
   - A `JCheckBox` labeled "Has Account?" is created and added to the panel.

3. **Window Properties**:
   - Sets the default close operation to exit the application when the window is closed.
   - The frame is made visible, and `pack()` is called to size the frame to fit the components.

### Functionality:
- When the program runs, a window appears with a checkbox labeled "Has Account?". Users can check or uncheck it.
