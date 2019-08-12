package com.sunilos.p12swing;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
/**
 * Spinner in Swing
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class SwingSpinner {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Swing Spinner");
		JPanel panel = (JPanel) frame.getContentPane();
		panel.setLayout(new GridLayout(1, 2));

		JLabel label = new JLabel("  Exp : ");
		panel.add(label);

		// Create a spinner
		JSpinner spinner = new JSpinner();
		spinner.setSize(20, 30);
		// set starting step, lower bound, upper bound , and setpSize
		panel.add(spinner);

		// Set a event : when window is closed, it is removed from memory
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit from
		// Size window as per contained components
		frame.pack();
		// Window will made visible to User
		frame.setVisible(true);

	}

}
