package com.sunrays.swing.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class MultipleButtonHandler implements ActionListener {

	public void actionPerformed(ActionEvent event) {
		
		Date d = new Date();
		
		Object source = event.getSource();
		JButton button = (JButton)source;
		
		System.out.println("You have Clicked Button : " + button.getText());

	}

}
