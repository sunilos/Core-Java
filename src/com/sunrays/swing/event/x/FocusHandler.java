package com.sunrays.swing.event.x;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class FocusHandler implements FocusListener {

	public void focusGained(FocusEvent e) {
		Object o = e.getSource();
		String msg = null;

		if (o instanceof JButton) {
			JButton button = (JButton) o;
			msg = button.getText();
		} else if (o instanceof JTextField) {
			JTextField t = (JTextField) o;
			msg = t.getText();
		}
		System.out.println(msg + " Focus Gained");

	}

	public void focusLost(FocusEvent e) {
		Object o = e.getSource();
		// JButton button = (JButton) o;
		System.out.println("Focus Lost");
	}

}
