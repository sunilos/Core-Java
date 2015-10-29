package com.sunrays.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class MyWindow4 {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Meri First Window");
		
		BorderLayout layout = new BorderLayout();
		
		frame.setLayout(layout);
				
		JPanel pan = (JPanel)frame.getContentPane();
		
		JButton label = new JButton("North");
		
		pan.add(label,BorderLayout.NORTH);
		
		JButton button = new JButton("Go");
		
		pan.add(button, BorderLayout.SOUTH);
		
		
		JButton cb = new JButton("Right");
		
		pan.add(cb, BorderLayout.EAST);
		
		JButton text = new JButton("West");

		pan.add(text, BorderLayout.WEST);

		JButton center = new JButton("Center");
		
		pan.add(center, BorderLayout.CENTER);
				
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.pack();
		
		frame.setVisible(true);

	}

}
