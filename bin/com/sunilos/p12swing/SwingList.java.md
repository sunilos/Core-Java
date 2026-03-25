```java
package com.sunilos.p12swing;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * SwingList demonstrates how to create a list using Swing.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class SwingList {

    public static void main(String[] args) {

        // Create a JFrame
        JFrame frame = new JFrame("Swing List");
        JPanel panel = (JPanel) frame.getContentPane();
        BorderLayout layout = new BorderLayout();
        panel.setLayout(layout);

        // Create a JLabel and add it to the top of the panel
        JLabel label = new JLabel("Skill:");
        panel.add(label, BorderLayout.NORTH);

        // Create a string array of skills
        String[] skills = { "JAVA", ".NET", "PHP", "VB" };
        // Create a JList using the skills array
        JList<String> skillList = new JList<>(skills);

        // Add a JScrollPane to make the list scrollable
        JScrollPane scrollPane = new JScrollPane(skillList);
        panel.add(scrollPane, BorderLayout.CENTER); // Add the scroll pane to the center of the panel

        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible and adjust size to fit components
        frame.setVisible(true);
        frame.pack();
    }
}
```

### Explanation:
1. **SwingList Class**:
   - This class demonstrates the creation of a list in a Swing application.

2. **JFrame Creation**:
   - A `JFrame` is created titled "Swing List".

3. **Panel and Layout**:
   - A `JPanel` is created and set to use a `BorderLayout`.

4. **JLabel Creation**:
   - A `JLabel` is created with the text "Skill:" and added to the northern region of the panel.

5. **JList Creation**:
   - An array of skill strings ("JAVA", ".NET", "PHP", "VB") is created.
   - A `JList` is created using this array.

6. **JScrollPane**:
   - The `JList` is wrapped in a `JScrollPane` to allow scrolling if there are too many items to fit in the visible area.

7. **Frame Configuration**:
   - The default close operation is set to exit the application when the window is closed.
   - The frame is made visible and packed to fit the components.

### Functionality:
- When you run the program, a window will appear displaying a label "Skill:" and a list of programming skills. Users can scroll through the list if needed.
