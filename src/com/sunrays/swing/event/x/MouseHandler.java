package com.sunrays.swing.event.x;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class MouseHandler extends MouseAdapter {

	public void mouseEntered(MouseEvent event) {
		System.out.println("Mouse Enetred");

	}

	public void mouseExited(MouseEvent event) {
		System.out.println("Mouse Exit");

	}

}
