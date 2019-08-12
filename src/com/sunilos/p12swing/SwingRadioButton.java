package com.sunilos.p12swing;

import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingRadioButton {
	public static void main(String[] args) {

		JFrame frame = new JFrame("Swing CheckBox");
		JPanel panel = (JPanel) frame.getContentPane();
		FlowLayout layout = new FlowLayout();
		panel.setLayout(layout);

		// Create Checkbox
		JCheckBox checkBox = new JCheckBox("Has Account?");
		panel.add(checkBox);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
	}
}
