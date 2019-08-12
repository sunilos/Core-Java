package com.sunilos.p12swing;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 * Inner and outer Classes 
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class OuterClass {

	private int instanceVar = 0;
	private static int staticVar = 0;

	private void instanceMethod() {
		System.out.println("Intance Method");
	}

	private static void staticMethod() {
		System.out.println("Intance Method");
	}

	// Inner class to handle mouse event
	private class InnMouseHandler extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			System.out.println("Mouse Clicked");
			// Can be used
			instanceVar = 0;
			staticVar = 0;
			instanceMethod();
			staticMethod();
		}
	}

	// Inner class to handle mouse event
	private static class FocusHandler extends FocusAdapter {
		public void focusGained(FocusEvent e) {
			System.out.println("Focus gained");
			// Can be used
			staticVar = 0;
			staticMethod();
		}
	}

	public static void main(String[] args) {

		JFrame f = new JFrame();

		OuterClass o = new OuterClass();
		InnMouseHandler h = o.new InnMouseHandler();

		JButton b = new JButton("Send");
		b.addMouseListener(h);
		f.add(b);

		OuterClass.FocusHandler fh = new OuterClass.FocusHandler();
		b.addFocusListener(fh);

		f.pack();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
