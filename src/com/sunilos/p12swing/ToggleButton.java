package com.sunilos.p12swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Creates a button and apply Action listner that listen button click event.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class ToggleButton {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Demo Button Click");
		JPanel pane = (JPanel) frame.getContentPane();

		JButton b = new JButton("ON");

		// Create button listener and add with button
		ButtonListener listener = new ButtonListener();
		b.addActionListener(listener);

		pane.add(b);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 100);
		frame.setVisible(true);
	}
}

/**
 * Listens button click even
 * 
 */
class ButtonListener implements ActionListener {

	/**
	 * Change the button label on click
	 */
	public void actionPerformed(ActionEvent event) {

		JButton b = (JButton) event.getSource();
		String label = b.getText();
		if (label.equals("ON")) {
			b.setText("OFF");
		} else if (label.equals("OFF")) {
			b.setText("ON");
		}

	}
}
