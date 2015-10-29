package com.sunrays.awt;

import java.awt.*;

public class FirstWindowFL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Frame win = new Frame("Pahali Pahali Window");

		Button b = new Button("CLick Me");

		win.add(b);

		//win.pack();
		win.setSize(400,200);

		win.setVisible(true);

	}

}
