package com.sunrays.swing.event;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class TestMultipleButton {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Meri First Window");

		JPanel pan = (JPanel) frame.getContentPane();
		
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
		pan.setLayout(layout);

		JButton button = new JButton("Yes");
		JButton button1 = new JButton("No");
		JButton button2 = new JButton("Cancel");
		
		MultipleButtonHandler listener = new MultipleButtonHandler();
		
		button.addActionListener(listener);
		button1.addActionListener(listener);
		button2.addActionListener(listener);

		pan.add(button);
		pan.add(button1);
		pan.add(button2);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(400, 200);

		frame.setVisible(true);

	}

}
