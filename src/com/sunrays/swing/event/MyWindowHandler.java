package com.sunrays.swing.event;

import java.awt.event.WindowEvent;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class MyWindowHandler extends MyWindowAdapter
{
	@Override
	public void windowDeactivated(WindowEvent arg0) {
		System.out.println("Window Deactiveted");
	}

	
}
