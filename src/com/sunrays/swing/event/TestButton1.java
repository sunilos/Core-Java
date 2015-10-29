package com.sunrays.swing.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class TestButton1 {
	
	private static String temp;

	public static void main(String[] args) {

		
		JFrame frame = new JFrame("Meri First Window");
		WindowHandler windowHandler = new WindowHandler();
		frame.addWindowListener(windowHandler);
		
		

		JPanel pan = (JPanel) frame.getContentPane();

		JButton button = new JButton("Click Me & See Console");
		
		button.addActionListener(new TestButton1.InnerButtonHandler());
		
		pan.add(button);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(400, 200);

		frame.setVisible(true);

	}
	
	//Inner Classes
	private static class InnerButtonHandler implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			System.out.println("This is Inner Class");
						
		}
		
		
	}

}
