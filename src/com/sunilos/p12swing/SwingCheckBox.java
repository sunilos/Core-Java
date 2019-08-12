package com.sunilos.p12swing;

import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * Create check box using swing
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class SwingCheckBox {
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
