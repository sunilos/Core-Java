package com.sunrays.swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class MyFirstWindow extends JFrame {

	public MyFirstWindow() {

		super("My J Frame - Hello World");

		final JLabel label = new JLabel("Hello World");
		JPanel panel = (JPanel) getContentPane();
		panel.add(label);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();

	}

}
