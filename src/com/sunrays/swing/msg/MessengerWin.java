package com.sunrays.swing.msg;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;



/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class MessengerWin extends JFrame {

	public JLabel userName = new JLabel("User Name");
	public JButton send = new JButton("Send");
	public JButton login = new JButton("Login");
	public JTextField message = new JTextField("Enter your message here");
	public JList userList = new JList();
	public JTextArea messageBoard = new JTextArea();
	
	
	public MessengerWin() {
		this("sunRays Messenger");
	}

	public MessengerWin(String title) {

		super(title);

		// Top Container
		JPanel mainPanel = (JPanel) this.getContentPane();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(userName, BorderLayout.NORTH);

		// Middle panel contains user list and conferrence text

		String label[] = { "Dhoni", "Yuvraj", "Harbhajan" };
		userList = new JList(label);
		JScrollPane pane = new JScrollPane(userList);

		JPanel middlePanel = new JPanel(new BorderLayout());

		//Set widgets properies 
		messageBoard.setAutoscrolls(true);
		messageBoard.setEditable(false);
		middlePanel.add(messageBoard, BorderLayout.CENTER);
		middlePanel.add(pane, BorderLayout.EAST);

		mainPanel.add(middlePanel, BorderLayout.CENTER);

		// Group Send and Login buttons
		send.setEnabled(false);
		
		JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
		buttonPanel.add(send);
		buttonPanel.add(login);

		// Bottom Panel
		JPanel bottomPanel = new JPanel(new BorderLayout());
		message.addFocusListener(new FocusHandler());
		bottomPanel.add(message, BorderLayout.CENTER);
		bottomPanel.add(buttonPanel, BorderLayout.EAST);

		mainPanel.add(bottomPanel, BorderLayout.SOUTH);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		// Add Event Listners
		ButtonLisner buttonLisner = 
			new ButtonLisner(this);
		send.addActionListener(buttonLisner);
		login.addActionListener(buttonLisner);

	}

	public static void main(String[] args) {

		MessengerWin win = new MessengerWin();
		win.setSize(400, 200);
		win.setVisible(true);

	}

}

class FocusHandler implements FocusListener{

	/* (non-Javadoc)
	 * @see java.awt.event.FocusListener#focusGained(java.awt.event.FocusEvent)
	 */
	public void focusGained(FocusEvent event) {
		JTextField tf = (JTextField)event.getSource();
		tf.setText("");
	}

	/* (non-Javadoc)
	 * @see java.awt.event.FocusListener#focusLost(java.awt.event.FocusEvent)
	 */
	public void focusLost(FocusEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
