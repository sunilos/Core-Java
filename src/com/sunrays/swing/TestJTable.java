package com.sunrays.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class TestJTable {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Meri First Window");

		JPanel pan = (JPanel) frame.getContentPane();

		String[][] data = { { "eggs", "sandwich", "steak", "snickers" },
				{ "bacon", "pickles", "potato", "apple" },
				{ "syrup", "mayo", "corn", "banana" },
				{ "pancakes", "chips", "broccoli", "crunch bar" },
				{ "sausage", "pizza", "pie", "protein shake" } };
		String[] headers = { "Breakfast", "Lunch", "Dinner", "Snack" };
		DefaultTableModel model = new DefaultTableModel(data, headers);
		JTable table = new JTable(model);

		pan.add(table);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(250, 100);

		frame.setVisible(true);

	}

}
