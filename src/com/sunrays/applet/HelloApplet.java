package com.sunrays.applet;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JApplet;
import javax.swing.JButton;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class HelloApplet extends JApplet {

	public void init() {

		Container content = getContentPane();
		content.setBackground(Color.red);
		content.setLayout(new FlowLayout());

		JButton clickMe = new JButton("Click Me");

		ButtonHandler dh = new ButtonHandler();
		clickMe.addActionListener(dh);
		clickMe.addMouseListener(new MouseHandler());

		content.add(clickMe);

		JButton b2 = new JButton("Button 2");
		FocusHandler fh = new FocusHandler();
		b2.addFocusListener(fh);

		content.add(b2);

		JButton b3 = new JButton("Button 3");
		b3.addFocusListener(new FocusAdapter(){
			@Override
			public void focusGained(FocusEvent e) {
				JButton b = (JButton)e.getSource();
				b.setBackground(Color.BLUE);
			}
			@Override
			public void focusLost(FocusEvent e) {
				JButton b = (JButton)e.getSource();
				b.setBackground(Color.GRAY);
			}
		});
		
		content.add(b3);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.applet.Applet#destroy()
	 */
	@Override
	public void destroy() {
		System.out.println("This is applet destroy");
	}

	@Override
	public void start() {
		System.out.println("This is applet start");
	}

	@Override
	public void stop() {
		System.out.println("This is applet stop");

	}

	@Override
	public void paint(Graphics g) {
		g.drawLine(0, 0, 200, 200);
		g.draw3DRect(5, 5, 50, 40, true);
		System.out.println("This is applet paint");
	}

	private static class ButtonHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			System.out.println("Clicked Me");

		}

	}// End ButtonHandler class

	private static class MouseHandler extends MouseAdapter {

		@Override
		public void mouseEntered(MouseEvent e) {
			System.out.println("Mouse is entered");
		}

	}

}// End HelloApplet class

