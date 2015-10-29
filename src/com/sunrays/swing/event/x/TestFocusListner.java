package com.sunrays.swing.event.x;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestFocusListner {

	public static void main(String[] args) {

		JFrame f = new JFrame("Test Focus List Win");

		WindowHandler wh = new WindowHandler();
		//WindowAdaHandler wh = new WindowAdaHandler();
		f.addWindowListener(wh);

		JPanel p = (JPanel) f.getContentPane();

		FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
		p.setLayout(fl);

		FocusHandler fh = new FocusHandler();

		JButton b = new JButton("Send");
		b.addFocusListener(fh);
		p.add(b);

		JButton login = new JButton("Login");
		login.addFocusListener(fh);
		p.add(login);

		JTextField t = new JTextField("Enter TExt Here");
		t.addFocusListener(fh);
		p.add(t);

		JButton c = new JButton("Color");

		TestFocusListner tOuterClass = new TestFocusListner();
		
		InnFocusHandler innFl = tOuterClass.new InnFocusHandler();
		
		c.addFocusListener(innFl);
		p.add(c);

		f.setSize(300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

	private class InnFocusHandler extends FocusAdapter {
		public void focusGained(FocusEvent e) {
			JButton b = (JButton) e.getSource();
			b.setBackground(Color.BLUE);
		}

		public void focusLost(FocusEvent e) {
			JButton b = (JButton) e.getSource();
			b.setBackground(Color.GRAY);
		}
	}

}// TestFocusListner
