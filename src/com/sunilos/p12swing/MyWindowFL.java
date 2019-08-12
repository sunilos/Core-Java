package com.sunilos.p12swing;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * Program to create Flow Layout
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class MyWindowFL {

	public static void main(String[] args) {

		JFrame frame = new JFrame("FlowLayout Demo");

		JPanel pan = (JPanel) frame.getContentPane();

		// Flowlayout that left align components
		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		pan.setLayout(layout);

		JButton b1 = new JButton("Button 1");
		pan.add(b1);

		JButton b2 = new JButton("Button 2");
		pan.add(b2);

		JButton b3 = new JButton("Button 3");
		pan.add(b3);

		JButton b4 = new JButton("Long-Named Button 4");
		pan.add(b4);

		JButton b5 = new JButton("5");
		pan.add(b5);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.pack();

		frame.setVisible(true);

	}

}
