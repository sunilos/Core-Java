package com.sunrays.swing;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyWindowGL {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Meri First Window");
		
		JPanel pan = (JPanel)frame.getContentPane();
		
		GridLayout layout = new GridLayout(3,2);
		pan.setLayout(layout);
		
		JButton b1 = new JButton("Button1");
		pan.add(b1);
				
		JButton b2 = new JButton("Button2");
		pan.add(b2);
		
		JButton b3 = new JButton("Button3");
		pan.add(b3);
		
		JButton b4 = new JButton("Button4");
		pan.add(b4);

		JButton b5 = new JButton("Button5");
		pan.add(b5);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(400, 200);
		//frame.pack();
		
		frame.setVisible(true);

	}

}
