package com.sunrays.swing.msg;

import java.awt.BorderLayout;
import java.awt.GridLayout;

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

public class MessengerWin1 extends JFrame {

	public JLabel userName = new JLabel("User Name");
	public JButton send = new JButton("Send");
	public JButton login = new JButton("Login");
	public JTextField message = new JTextField("Enter your message here");
	public JList userList = new JList();
	public JTextArea messageBoard = new JTextArea();
	
	public MessengerWin1() {
		this("sunRays Messenger");
	}

	public MessengerWin1(String title) {

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
		middlePanel.add(messageBoard, BorderLayout.CENTER);
		middlePanel.add(pane, BorderLayout.EAST);

		mainPanel.add(middlePanel, BorderLayout.CENTER);

		// Group Send and Login buttons
		JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
		buttonPanel.add(send);
		buttonPanel.add(login);

		// Bottom Panel
		JPanel bottomPanel = new JPanel(new BorderLayout());
		bottomPanel.add(message, BorderLayout.CENTER);
		bottomPanel.add(buttonPanel, BorderLayout.EAST);

		mainPanel.add(bottomPanel, BorderLayout.SOUTH);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Set Widgets properties
		
		messageBoard.setAutoscrolls(true);
		messageBoard.setEditable(false);
		
	}

	public static void main(String[] args) {

		MessengerWin1 win = new MessengerWin1();
		win.setSize(400, 200);
		win.setVisible(true);

	}

}
