package com.sunrays.swing.event;

import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class TestButton {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Meri First Window");

		//Case 1 - Listener implemented WindowListner
/*		WindowHandler windowHandler = 
			new WindowHandler();
			frame.addWindowListener(windowHandler);
		*/
		
		//Case 2 - Listner extends Adapter class
/*		MyWindowHandler handler = new MyWindowHandler();

		frame.addWindowListener(handler);
*/
		//Case 3
		frame.addWindowListener(new WindowAdapter(){
			public void windowDeactivated(WindowEvent arg0) {
				System.out.println("Window Anon Deactiveted");
			}			
		});
		JPanel pan = (JPanel) frame.getContentPane();
		pan.setLayout(new FlowLayout());

		JButton button = 
			new JButton("Click Me & See Console");

		ButtonHandler listener = new ButtonHandler();

		button.addActionListener(listener);

		ButtonMouseHandler buttonMouseHandler = 
			new ButtonMouseHandler();

		button.addMouseListener(buttonMouseHandler);

		pan.add(button);

		JButton clickMe = new JButton("Click Me");

		clickMe.addActionListener(listener);

		pan.add(clickMe);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(400, 200);

		frame.setVisible(true);

	}

}

class WindowHandler implements WindowListener {

	public void windowActivated(WindowEvent arg0) {
		System.out.println("WIndows Acticated");

	}

	public void windowClosed(WindowEvent arg0) {
		System.out.println("WIndows Closed");

	}

	public void windowClosing(WindowEvent arg0) {
		System.out.println("WIndows Closing");

	}

	public void windowDeactivated(WindowEvent arg0) {
		System.out.println("WIndows Deactivated");

	}

	public void windowDeiconified(WindowEvent arg0) {
		System.out.println("WIndows DEiconified");

	}

	public void windowIconified(WindowEvent arg0) {
		System.out.println("WIndows Acticated");

	}

	public void windowOpened(WindowEvent arg0) {
		System.out.println("WIndows OPened");

	}

}
