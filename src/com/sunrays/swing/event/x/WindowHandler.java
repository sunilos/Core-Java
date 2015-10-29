package com.sunrays.swing.event.x;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowHandler implements WindowListener {
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated");
	}

	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed");
	}

	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");
	}

	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated");
	}

	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");
	}

	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified");
	}

	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened");
	}

}
