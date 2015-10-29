package com.sunrays.swing.event;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.EventObject;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class MeraButton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		JFrame win = new JFrame("Button Window");
		JPanel panel = (JPanel) win.getContentPane();
		panel.setLayout(new FlowLayout());

		JButton button = new JButton("Click Me");
		panel.add(button);

		ButtonListner listner = new ButtonListner();
		button.addActionListener(listner);

		MeraButton.MyFocHandler focHandler = new MeraButton.MyFocHandler();

		JButton button1 = new JButton("You can not Click Me");
		panel.add(button1);
		button1.addFocusListener(focHandler);

		MyWinHandler handler = new MyWinHandler();
		win.addWindowListener(handler);

		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		win.setSize(400, 200);

		win.setVisible(true);

	}

	private static class MyFocHandler extends FocusAdapter {

		public void focusGained(FocusEvent arg0) {
			System.out.println("Got Focus");
		}

	}

}

class MyWinHandler implements WindowListener {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.WindowListener#windowActivated(java.awt.event.WindowEvent)
	 */
	public void windowActivated(WindowEvent e) {

		System.out.println("Window is activated");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.WindowListener#windowClosed(java.awt.event.WindowEvent)
	 */
	public void windowClosed(WindowEvent e) {
		System.out.println("Window is Closed");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.WindowListener#windowClosing(java.awt.event.WindowEvent)
	 */
	public void windowClosing(WindowEvent e) {

		System.out.println("Window is Closing");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.WindowListener#windowDeactivated(java.awt.event.WindowEvent)
	 */
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Window is Deactivated");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.WindowListener#windowDeiconified(java.awt.event.WindowEvent)
	 */
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Window is Deiconified");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.WindowListener#windowIconified(java.awt.event.WindowEvent)
	 */
	public void windowIconified(WindowEvent e) {
		System.out.println("Window is iconified");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.WindowListener#windowOpened(java.awt.event.WindowEvent)
	 */
	public void windowOpened(WindowEvent e) {
		System.out.println("Window is Opened");

	}
}
