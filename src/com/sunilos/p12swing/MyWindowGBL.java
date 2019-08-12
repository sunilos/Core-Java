package com.sunilos.p12swing;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * Program to create GridBagLayout
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class MyWindowGBL {

	public static void main(String[] args) {

		JFrame frame = new JFrame("GridBagLayout Demo");

		JPanel pane = (JPanel) frame.getContentPane();

		pane.setLayout(new GridBagLayout());

		GridBagConstraints c = new GridBagConstraints();

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;

		JButton b1 = new JButton("Button1");
		pane.add(b1, c);

		c.gridx = 1;
		c.gridy = 0;

		JButton b2 = new JButton("Button2");
		pane.add(b2, c);

		c.gridx = 2;
		c.gridy = 0;

		JButton b3 = new JButton("Button3");
		pane.add(b3, c);

		c.gridwidth = 3;
		c.gridx = 0;
		c.gridy = 1;
		JButton b4 = new JButton("Button4");
		pane.add(b4, c);

		c.gridheight = 1;
		c.gridx = 2;
		c.gridy = 3;

		JButton b5 = new JButton("Button5");
		pane.add(b5,c);
		

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(400, 200);

		frame.setVisible(true);

	}

}
