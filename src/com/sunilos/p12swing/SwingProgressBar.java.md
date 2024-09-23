```java
package com.sunilos.p12swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.UIManager;

/**
 * SwingProgressBar demonstrates the use of a progress bar in Swing.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class SwingProgressBar extends JFrame {

    protected int min = 20;
    protected int max = 100;
    protected int counter = 25;
    protected JProgressBar jpb;

    public SwingProgressBar() {
        super("JProgressBar");
        setSize(300, 80);

        // Set background color for the progress bar
        UIManager.put("ProgressBar.selectionBackground", Color.black);
        UIManager.put("ProgressBar.selectionForeground", Color.white);
        UIManager.put("ProgressBar.foreground", new Color(8, 32, 128));

        // Create the progress bar
        jpb = new JProgressBar();
        jpb.setMinimum(min);
        jpb.setMaximum(max);
        jpb.setStringPainted(true); // Show progress as text on the bar

        // Create the start button
        JButton start = new JButton("Go ..");

        // Add action listener to the button
        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Thread runner = new Thread() {
                    public void run() {
                        counter = min; // Reset counter to minimum
                        while (counter <= max) {
                            jpb.setValue(counter); // Update the progress bar value
                            counter += 1; // Increment the counter
                            try {
                                Thread.sleep(100); // Sleep for a short duration
                            } catch (InterruptedException ex) {
                                // Handle exception
                            }
                        }
                    }
                };
                runner.start(); // Start the thread
            }
        });

        // Add components to the frame
        getContentPane().add(jpb, BorderLayout.CENTER);
        getContentPane().add(start, BorderLayout.WEST);
    }

    public static void main(String[] args) {
        SwingProgressBar frame = new SwingProgressBar();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

### Explanation:
1. **SwingProgressBar Class**:
   - This class extends `JFrame` and demonstrates the use of a progress bar.

2. **Variables**:
   - `min` and `max` set the range of the progress bar.
   - `counter` is used to track the current value of the progress bar.
   - `jpb` is the `JProgressBar` instance.

3. **Constructor**:
   - Initializes the frame and sets its size.
   - Configures the appearance of the progress bar using the `UIManager`.
   - Creates the progress bar and sets its minimum, maximum, and string display properties.
   - Creates a "Go .." button and adds an action listener.

4. **ActionListener**:
   - When the button is clicked, a new thread is started.
   - The thread increments the counter and updates the progress bar value every 100 milliseconds until it reaches the maximum.

5. **Main Method**:
   - Creates an instance of `SwingProgressBar`, sets the default close operation, and makes the frame visible.

### Functionality:
- When the program runs, a window appears with a progress bar and a button. Clicking the button starts the progress bar, which fills up over time.
