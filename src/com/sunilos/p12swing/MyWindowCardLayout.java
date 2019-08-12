package com.sunilos.p12swing;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * Program to create Card Layout
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class MyWindowCardLayout {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		JPanel pane = (JPanel) frame.getContentPane();

		CardLayout card = new CardLayout();
		pane.setLayout(card);

		ButtonHandler handler = new ButtonHandler(pane);

		JButton b1 = new JButton("Next Panel");
		b1.addActionListener(handler);
		pane.add(b1);

		JButton b2 = new JButton("Previous Panel");
		b2.addActionListener(handler);
		pane.add(b2);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		frame.setVisible(true);

	}

}

/**
 * Button event listener
 */
class ButtonHandler implements ActionListener {
	JPanel pane = null;

	ButtonHandler(JPanel pane) {
		this.pane = pane;
	}

	public void actionPerformed(ActionEvent e) {
		CardLayout card = (CardLayout) pane.getLayout();
		card.next(pane);
	}
}
