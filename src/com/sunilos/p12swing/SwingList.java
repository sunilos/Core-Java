package com.sunilos.p12swing;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
/**
 * Create List Using Swing
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class SwingList {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Swing List");
		JPanel panel = (JPanel) frame.getContentPane();
		BorderLayout layout = new BorderLayout();
		panel.setLayout(layout);

		JLabel label = new JLabel("Skill :");
		panel.add(label, BorderLayout.NORTH);

		// String array is created
		String number[] = { "JAVA", ".NET", "PHP", "VB" };
		// list is created
		JList list = new JList(number);

		// list.setSize(25, 10);
		panel.add(list, BorderLayout.AFTER_LAST_LINE);

		// Set a event : when window is closed, it is removed from memory
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Window will made visible to User
		frame.setVisible(true);
		frame.pack();

	}

}
