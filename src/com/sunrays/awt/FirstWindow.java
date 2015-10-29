package com.sunrays.awt;

import java.awt.*;

public class FirstWindow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Frame win = new Frame("Pahali Pahali Window");

		//FlowLayout layout = new FlowLayout();
		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		win.setLayout(layout);
		
		Button b1 = new Button("Button1");
		win.add(b1);

		Button b2 = new Button("Button2");
		win.add(b2);

		Button b3 = new Button("Button3");
		win.add(b3);

		//win.pack();
		win.setSize(400,200);

		win.setVisible(true);

	}

}
