package com.sunilos.p12swing;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * Window Handler Using Window Listener
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class WindowHandler implements WindowListener {

	public void windowOpened(WindowEvent e) {
		System.out.println("Opened");
	}

	public void windowActivated(WindowEvent e) {
		System.out.println("Activated");
	}

	public void windowDeactivated(WindowEvent e) {
		System.out.println("Minimized");
	}

	public void windowDeiconified(WindowEvent e) {
		System.out.println("Maximized");
	}

	public void windowIconified(WindowEvent e) {
		System.out.println("Iconified");
	}

	public void windowClosing(WindowEvent e) {
		System.out.println("Closing");
	}

	public void windowClosed(WindowEvent e) {
		System.out.println("Closed");
	}

	public static void main(String[] args) {

		JFrame frame = new JFrame("Demo WindowListner");
		frame.addWindowListener(new WindowHandler());

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 100);
		frame.setVisible(true);
	}

}
