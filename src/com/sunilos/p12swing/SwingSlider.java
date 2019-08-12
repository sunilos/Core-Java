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
        JPanel panel = (JPanel)frame.getContentPane();

                   // Create a slider
        JSlider slider = new JSlider();

                    // set minor tick spacing
        slider.setMinorTickSpacing(5);

                   // set major tick spacing
        slider.setMajorTickSpacing(10);
                    
                   // set tick visible
        slider.setPaintTicks(true);

                   // set the knob to the closest tick mark next to where the user positioned the knob. 
        slider.setSnapToTicks(true);
        
            // paint track of slider track      
        slider.setPaintTrack(false);
                
                  // paint track of label
        slider.setPaintLabels(true);

        panel.add(slider);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        
    }
}
