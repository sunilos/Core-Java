package com.sunrays.swing;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.TextField;

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

public class MyWindow2 {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Meri First Window");
		
		//FlowLayout layout = new FlowLayout();
		//FlowLayout layout = new FlowLayout(FlowLayout.RIGHT);
		GridLayout layout = new GridLayout(2,2);
		
		JPanel pan = (JPanel)frame.getContentPane();
		pan.setLayout(layout);
		
		JLabel label = new JLabel("Hello World");
		pan.add(label);
		
		JTextField text = new JTextField("This is Text Field");
		pan.add(text);

		JTextArea textArea = new JTextArea("This is Text Area");
		textArea.setSize(200,400);
		pan.add(textArea);
		
		JCheckBox cb = new JCheckBox("Select Me");
		pan.add(cb);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		
		frame.setVisible(true);

	}

}
