package com.sunrays.swing.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class ButtonListner implements ActionListener {


	public void actionPerformed(ActionEvent e) {

		JButton button = (JButton) e.getSource();

		System.out.println("You have Clicked "+
				button.getText()+" Button");
		
		String t = button.getText();
		if("Click Me".equals(t)){
			button.setText("Don't Click Me");
		}else{
			button.setText("Click Me");
		}
	}

}

