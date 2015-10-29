package com.sunrays.swing.msg;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		Button b = (Button) e.getSource();
		String label = b.getLabel();
		
		if("Click Me".equals(label)){
			b.setLabel("Don't Click Me");
		}else{
			b.setLabel("Click Me");
		}
		System.out.println("Your have clicked a button");
	}
}
