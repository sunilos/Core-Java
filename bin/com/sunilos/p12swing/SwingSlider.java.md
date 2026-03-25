
```java
package com.sunilos.p12swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

/**
 * Slider in Swing
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class SwingSlider {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Slider");
        JPanel panel = (JPanel) frame.getContentPane();

        // Create a slider
        JSlider slider = new JSlider();

        // Set minor tick spacing
        slider.setMinorTickSpacing(5);

        // Set major tick spacing
        slider.setMajorTickSpacing(10);

        // Set ticks to be visible
        slider.setPaintTicks(true);

        // Snap the knob to the closest tick mark
        slider.setSnapToTicks(true);

        // Paint track of the slider track
        slider.setPaintTrack(false);

        // Paint track of labels
        slider.setPaintLabels(true);

        // Add slider to the panel
        panel.add(slider);
        
        // Set default close operation and make the frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
    }
}
```

### Explanation:
1. **Class Declaration**:
   - The class `SwingSlider` demonstrates the use of a slider in a Swing application.

2. **Main Method**:
   - Creates a `JFrame` titled "Swing Slider" and a `JPanel`.
   - A `JSlider` is created with various properties set:
     - Minor and major tick spacing for finer control.
     - Visibility of ticks and labels.
     - Option to snap the knob to the closest tick mark.
     - Customizes the appearance of the slider's track.

3. **Window Properties**:
   - Sets the default close operation to exit the application when the window is closed.
   - The frame is made visible, and `pack()` is called to size the frame to fit the components.

### Functionality:
- When the program runs, a window appears with a slider, allowing users to adjust a value visually. The ticks and labels enhance usability.
