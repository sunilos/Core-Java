package com.sunrays.swing.event.x;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowAdaHandler extends WindowAdapter {
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated");
	}
}
