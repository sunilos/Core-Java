package com.sunrays.swing;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class MeriWindow {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Meri Pahali Pahali Window");
		
		JPanel pan = (JPanel)frame.getContentPane();
		
		//FlowLayout layout = new FlowLayout();
		//GridLayout layout = new GridLayout(3,2);
		BorderLayout layout = new BorderLayout();
		
		pan.setLayout(layout);
		
		JButton b = new JButton("Click Me");

		pan.add(b, BorderLayout.SOUTH);
		
		JLabel label = new JLabel("Hello World");
		
		pan.add(label,BorderLayout.NORTH);
		
		TextField text = new TextField(40);
		
		pan.add(text,BorderLayout.EAST);

		
		JCheckBox box = new JCheckBox();
		
		pan.add(box, BorderLayout.WEST);
							
		JTextArea area = new JTextArea(5,10);
		
		pan.add(area);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.pack();
		
		frame.setVisible(true);

	}

}
