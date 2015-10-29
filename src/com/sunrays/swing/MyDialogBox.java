package com.sunrays.swing;


import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class MyDialogBox {

	public static void main(String[] args) {

		JFrame frame = new JFrame("sunRays Technologies");

		JLabel label = new JLabel("Hello World");
		frame.getContentPane().add(label);

		JTextField text = new JTextField();
		frame.getContentPane().add(text);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		
		FlowLayout flowLayout = new FlowLayout();
		frame.getContentPane().setLayout(flowLayout);
		frame.setVisible(true);

		Object[] options = { "Yes!", "No, I'll pass", "Well, if I must" };

		int n = JOptionPane.showOptionDialog(frame,
				"Duke is a cartoon mascot. \n"
						+ "Do you still want to cast your vote?",
				"A Follow-up Question", 
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, 
				null, options, options[2]);

		text.setText(String.valueOf(n));

	}

}
