package com.sunilos.p12swing;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 * testing of Local Class
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestLocalClass {
	
	public static void main(String[] args) {
		
		 class LocalClass extends MouseAdapter {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Mouse Clicked");
			}
		}

		JFrame f = new JFrame();

		LocalClass h = new LocalClass();

		JButton b = new JButton("Send");
		b.addMouseListener(h);
		f.add(b);

		f.pack();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}
}
