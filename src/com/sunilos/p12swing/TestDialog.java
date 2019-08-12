package com.sunilos.p12swing;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Creates and tests the dialog window.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestDialog {

	public static void main(String[] args) {

		// Create window and set title to "My First Window"
		JFrame frame = new JFrame("My First Window");

		// Get default panel
		JPanel pane = (JPanel) frame.getContentPane();

		// Create a button and add to Panel
		JButton b = new JButton("Click Me");
		pane.add(b);

		// Remove window from memory when window is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Size window as per contained components
		// frame.pack();
		frame.setSize(200, 100);

		// Make window visible
		frame.setVisible(true);
		
		JDialog dialog = new JDialog();
		dialog.setTitle("Alarm!!");
		dialog.add(new JButton("Ok"));
		dialog.pack();
		dialog.setVisible(true);
		
	}
}
