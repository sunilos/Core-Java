package com.sunrays.swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyWindowFL {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Meri First Window");

		JPanel pan = (JPanel) frame.getContentPane();

		//FlowLayout layout = new FlowLayout();

		FlowLayout layout = 
			new FlowLayout(FlowLayout.LEFT); //Align Left
		// FlowLayout layout = new FlowLayout(FlowLayout.CENTER);//Align
		// Center(Default)
		// FlowLayout layout = new FlowLayout(FlowLayout.RIGHT);//Align Right

		pan.setLayout(layout);

		JButton b1 = new JButton("Button1");
		pan.add(b1);

		JTextField text = new JTextField("Enter Text");
		pan.add(text);

		JCheckBox cb = new JCheckBox("Select Here");
		pan.add(cb);

		JButton b2 = new JButton("Button2");
		pan.add(b2);
		
		JLabel label = new JLabel("This is Label");
		pan.add(label);

		JButton b3 = new JButton("Button3");
		pan.add(b3);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(400, 200);
		// frame.pack();

		frame.setVisible(true);

	}

}
