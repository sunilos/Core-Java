package com.sunrays.swing.event;

import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class TestSimpleButton {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Meri First Window");
	JPanel pan = (JPanel) frame.getContentPane();
	
		pan.setLayout(new FlowLayout());

		JButton button = 
			new JButton("Click Me & See Console");

		ButtonHandler listener = new ButtonHandler();

		button.addActionListener(listener);

			pan.add(button);

		JButton clickMe = new JButton("Click Me");

		clickMe.addActionListener(listener);

		pan.add(clickMe);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(400, 200);

		frame.setVisible(true);

	}

}
