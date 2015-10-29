package com.sunrays.swing;

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

public class MyWindow1 {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Meri First Window");
		
		JPanel pan = (JPanel)frame.getContentPane();
		
		JButton button = new JButton("Click Me");
		
		pan.add(button);
				
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//frame.setSize(400, 200);
		frame.pack();
		
		frame.setVisible(true);

	}

}
