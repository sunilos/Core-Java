package com.sunrays.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class MyWindow {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Meri First Window");

		JPanel pan = (JPanel) frame.getContentPane();

		JButton b = new JButton("Click Me");

		pan.add(b);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.pack();

		frame.setVisible(true);

	}

}
