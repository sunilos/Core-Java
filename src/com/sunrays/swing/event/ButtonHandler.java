package com.sunrays.swing.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Date;

import javax.swing.JButton;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class ButtonHandler implements ActionListener {

	public void actionPerformed(ActionEvent event) {

	    System.out.println("Button is Clicked");
		
		JButton b = (JButton) event.getSource();

		String label = b.getText();

		if (label.equals("Click Me")) {
			b.setText("Don't Click Me");
		} else if (label.equals("Don't Click Me")) {
			b.setText("Click Me");
		} else {
			Date d = new Date();
			System.out.println(b.getText());
			System.out.println("You have Clicked Button @ " + d);
		}
	}
}
