package com.sunilos.p05arrays;

/**
 * Test multi-dimension array basic operations
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestMultdimensionArray {

	public static void main(String[] args) {
		// Declares an array of integers
		int[][] tables = new int[10][2];

		// Row 1-10 and Column # 1
		tables[0][0] = 2;
		tables[1][0] = 4;
		tables[2][0] = 6;
		tables[3][0] = 8;
		tables[4][0] = 10;
		tables[5][0] = 12;
		tables[6][0] = 14;
		tables[7][0] = 16;
		tables[8][0] = 18;
		tables[9][0] = 20;

		// Row 1-10 and Column # 2
		tables[0][1] = 3;
		tables[1][1] = 6;
		tables[2][1] = 9;
		tables[3][1] = 12;
		tables[4][1] = 15;
		tables[5][1] = 18;
		tables[6][1] = 21;
		tables[7][1] = 24;
		tables[8][1] = 27;
		tables[9][1] = 30;

		System.out.println("Tables ");
		System.out.println("#2\t#3");

		for (int row = 0; row < tables.length; row++) {

			for (int col = 0; col < tables[0].length; col++) {
				System.out.print(tables[row][col] + "\t");
			}
			System.out.println();
		}

		// Three dimension array
		int[][][] threeD = new int[10][3][2];
		threeD[0][1][1] = 100;

		// Four dimension array
		int[][][][] fourD = new int[10][3][2][3];
		fourD[0][1][1][0] = 100;

	}
}
