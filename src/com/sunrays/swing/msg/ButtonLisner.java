package com.sunrays.swing.msg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class ButtonLisner implements ActionListener{

	private MessengerWin win = null;

	public ButtonLisner(MessengerWin win) {
		this.win = win;
	}

	public void actionPerformed(ActionEvent event) {

		Object o = event.getSource();

		if (o instanceof JButton) {
			
			JButton button = (JButton) o;
			
			//Get Button Label
			String label = button.getText();
			//System.out.println(" Event Source is " + label);

			if ("Login".equals(label)) {
				String t = win.message.getText();
				win.userName.setText(t);
				win.message.setText("");
				win.send.setEnabled(true);
				
				button.setText("Logout");
				
				
			} else if ("Logout".equals(label)) {
				win.userName.setText("User Name");
				win.send.setEnabled(false);
				button.setText("Login");
			} else if ("Send".equals(label)){
				String t = win.message.getText();
				String buddy = (String)win.userList.getSelectedValue();
				String msg = win.userName.getText();
			
				msg = msg + " says " + buddy + " -> " + t +"\n";
				
				win.messageBoard.append(msg);
				win.message.setText("");
			}

		}

	}

}
