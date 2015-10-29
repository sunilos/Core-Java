package com.sunrays.swing.msg;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;



public class TestButtonCick {

	public static void main(String[] args) {
		
		Frame win = new Frame("Pahali Pahali Window");

		FlowLayout layout = new FlowLayout();
		win.setLayout(layout);
		
		
		Button b1 = new Button("Click Me");
		
		ButtonHandler bh = new ButtonHandler();
		b1.addActionListener(bh);
		
		win.add(b1);

		//win.pack();
		win.setSize(400,200);

		win.setVisible(true);

	}

}
