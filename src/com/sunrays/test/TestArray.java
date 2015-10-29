package com.sunrays.test;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class TestArray {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		twoDim();

	}

	public static void treeDim() {

		int[][][] tableoftable = new int[10][9][3];
	}

	public static void twoDim() {

		int[][] tableoftable = new int[10][9];

		tableoftable[5][1] = 18;
		tableoftable[9][8] = 100;

		System.out.println(" Value 10th Row , 9th Column  "
				+ tableoftable[9][8]);

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 9; j++) {
				tableoftable[i][j] = (i + 1) * (j + i + 1);
			}
		}

		System.out.println(" Value 6th Row , 2ndth Column  "
				+ tableoftable[5][1]);

		System.out.println(" Value 10th Row , 9th Column  "
				+ tableoftable[9][8]);

	}

	public static void oneDim() {

		int[] table = new int[10];

		table[0] = 2;
		table[1] = 4;

		for (int i = 0; i < 10; i++) {
			table[i] = 2 * (i + 1);
		}

		System.out.println(" 2 ka table ");
		for (int i = 0; i < 10; i++) {
			System.out.println(table[i]);
		}

	}

}
