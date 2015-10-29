package com.sunrays.swing.event.x;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class ButtonClickEvent {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Meri First Window");
		
		JPanel pan = (JPanel)frame.getContentPane();
		FlowLayout layout = new FlowLayout();
		pan.setLayout(layout);
		
		JButton button = new JButton("Click Me");
		SimpleButtonHandler handler
		= new SimpleButtonHandler();
		
		button.addActionListener(handler);
		pan.add(button);

		JButton b = new JButton("Click Me & See Console");
		b.addActionListener(handler);
		pan.add(b);

/*		MouseHandler handler2 = new MouseHandler();
		b.addMouseListener(handler2);
*/		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//frame.setSize(400, 200);
		frame.pack();
		
		frame.setVisible(true);

	}

}
