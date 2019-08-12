package com.sunilos.p12swing;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 * Message Dialog Box using JOption Pane
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		JFrame frame = new JFrame();
		JOptionPane.showMessageDialog(frame, "Data is saved !");

		// Set a event : when window is closed, it is removed from memory
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit from
		// Size window as per contained components
		frame.setSize(400, 200);
		// Window will made visible to User
		frame.setVisible(true);

	}

}
