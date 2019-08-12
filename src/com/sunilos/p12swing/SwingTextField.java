package com.sunilos.p12swing;

import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 * Text Field in Swing
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class SwingTextField {

	public static void main(String[] args) {

		JFrame frame = new JFrame();

		JPanel pane = (JPanel) frame.getContentPane();
		pane.setLayout(new GridLayout(2, 2));

		JLabel login = new JLabel("Login : ");
		pane.add(login);

		JTextField text = new JTextField();
		pane.add(text);

		JLabel pwd = new JLabel("Password : ");
		pane.add(pwd);

		JPasswordField pwdT = new JPasswordField();
		pane.add(pwdT);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(200, 80);

		frame.setVisible(true);

	}

}
