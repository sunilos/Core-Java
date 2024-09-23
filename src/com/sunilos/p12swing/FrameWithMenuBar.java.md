```java
package com.sunilos.p12swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 * FrameWithMenuBar creates a JFrame that includes a menu bar with File and Edit menus.
 * This program serves as an example of using Swing components to create a GUI with a menu.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class FrameWithMenuBar {

    /**
     * The main method initializes the GUI components and makes the window visible.
     * 
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {

        // Create a JFrame (window)
        JFrame frame = new JFrame();

        // Set the title of the window
        frame.setTitle("My First Window");

        // Get the default content pane of the JFrame
        JPanel pane = (JPanel) frame.getContentPane();

        // Create a JButton and add it to the JPanel
        JButton b = new JButton("Click Me");
        pane.add(b); // Add the button to the panel

        // Create a JMenuBar (menu bar)
        JMenuBar bar = new JMenuBar();

        // Build a File Menu and its Menu Items
        JMenu fileMenu = new JMenu("File");
        JMenuItem newFile = new JMenuItem("New"); // Menu item for creating a new file
        JMenuItem open = new JMenuItem("Open"); // Menu item for opening a file

        // Add Menu Items to the File Menu
        fileMenu.add(newFile);
        fileMenu.add(open);

        // Build an Edit Menu and its Menu Items
        JMenu editMenu = new JMenu("Edit");
        JMenuItem cut = new JMenuItem("Cut"); // Menu item for cut action
        JMenuItem copy = new JMenuItem("Copy"); // Menu item for copy action
        JMenuItem paste = new JMenuItem("Paste"); // Menu item for paste action

        // Add Menu Items to the Edit Menu
        editMenu.add(cut);
        editMenu.add(copy);
        editMenu.add(paste);

        // Add Menus to the menu bar
        bar.add(fileMenu);
        bar.add(editMenu);

        // Set the menu bar to the JFrame
        frame.setJMenuBar(bar);

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
   - A `JFrame` is created to serve as the main window, with its title set to "My First Window".

2. **JPanel**:
   - The default content pane is obtained as a `JPanel`, which will contain GUI components.

3. **JButton**:
   - A `JButton` labeled "Click Me" is created and added to the panel.

4. **JMenuBar**:
   - A `JMenuBar` is created to hold the menus.

5. **Menus and Menu Items**:
   - A "File" menu is created with "New" and "Open" items.
   - An "Edit" menu is created with "Cut," "Copy," and "Paste" items.

6. **Adding Menus to Menu Bar**:
   - The "File" and "Edit" menus are added to the menu bar, which is then set to the `JFrame`.

7. **Close Operation**:
   - The application will exit when the window is closed, as specified by `setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)`.

8. **Window Size and Visibility**:
   - The size of the window is set to 200 pixels wide and 100 pixels high, and the window is made visible to the user.
