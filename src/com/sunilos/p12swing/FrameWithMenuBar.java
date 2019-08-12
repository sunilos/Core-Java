package com.sunilos.p12swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
/**
 * Program to create frame with menu bar
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class FrameWithMenuBar {

	public static void main(String[] args) {

		// Create window
		JFrame frame = new JFrame();

		// Set title bar to "My First Window"
		frame.setTitle("My First Window");

		// Get default panel
		JPanel pane = (JPanel) frame.getContentPane();

		// Create a button and add to Panel
		JButton b = new JButton("Click Me");
		pane.add(b);

		// Create a Menu Bar
		JMenuBar bar = new JMenuBar();

		// Build a File Menu and its Menu Items
		JMenu fileMenu = new JMenu("File");
		JMenuItem newFile = new JMenuItem("New");
		JMenuItem open = new JMenuItem("Open");

		// Add Menu Items to its Menu
		fileMenu.add(newFile);
		fileMenu.add(open);

		// Build a Edit Menu and its Menu Items
		JMenu editMenu = new JMenu("Edit");
		JMenuItem cut = new JMenuItem("Cut");
		JMenuItem copy = new JMenuItem("Copy");
		JMenuItem paste = new JMenuItem("Paste");

		// Add Menu Items to its Menu
		editMenu.add(cut);
		editMenu.add(copy);
		editMenu.add(paste);

		// Add Menus to bar
		bar.add(fileMenu);
		bar.add(editMenu);

		// Set Menu Bar to Frame
		frame.setJMenuBar(bar);

		// Remove window from memory when window is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit from

		// Size window as per contained components
		// frame.pack();

		frame.setSize(200, 100);

		// Make window visible
		frame.setVisible(true); 

	}
}
