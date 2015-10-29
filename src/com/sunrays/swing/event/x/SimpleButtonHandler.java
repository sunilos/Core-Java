package com.sunrays.swing.event.x;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class SimpleButtonHandler implements ActionListener {

	public void actionPerformed(ActionEvent event) {

		JButton b = (JButton) event.getSource();
		String label = b.getText();
		if (label.equals("Click Me")) {
			b.setText("Don't Click Me");
		} else if (label.equals("Don't Click Me")) {
			b.setText("Click Me");
		} else {
			System.out.println("Button is Clicked");
		}
	}
}
