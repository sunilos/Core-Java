package com.sunrays.awt;

import java.awt.*;

/**
 * 
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 */


public class FirstWindowBL {

	public static void main(String[] args) {

		Frame win = new Frame("Pahali Pahali Window");

		BorderLayout layout = new BorderLayout();
		win.setLayout(layout);
		
		Button b1 = new Button("Button1");
		win.add(b1,BorderLayout.NORTH);

		Button b2 = new Button("Button2");
		win.add(b2,BorderLayout.SOUTH);

		Button b3 = new Button("Button3");
		win.add(b3);

		//win.pack();
		win.setSize(400,200);

		win.setVisible(true);

	}

}
