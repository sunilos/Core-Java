package com.sunilos.p15streamapi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Read data from a text file, text file contains comma separated values. Read
 * lines are converted into Marksheet object and then Marksheet data is printed.
 * 
 * Text file marksheets.txt contains following comma separated data 
 * ---File Data ----
 * Ram,80,70,60
 * Shyam,80,80,79
 * Ajay,90,80,60
 * Vijay,70,80,60
 * Jay,85,75
 * Pappu,45,30,67
 * 
 * @author SunilOS
 *
 */
public class TestMarksheet {

	public static void main(String[] args) throws Exception {

		// 1. Read marksheets.txt file
		// 2. Split comma separated values
		// 3. Filter invalid input
		// 4. Create Marksheet object
		// 5. Print data

		try (Stream<String> stream = Files.lines(Paths.get("marksheets.txt"))) {
			stream.map(e -> e.split(",")).filter(e -> e.length == 4).map(
					x -> new Marksheet(x[0], Integer.parseInt(x[1]), Integer.parseInt(x[2]), Integer.parseInt(x[3])))
					.forEach(e -> {
						System.out.print("Name: " + e.name);
						System.out.print(" Physics: " + e.physics);
						System.out.print(" Chemistry: " + e.chemistry);
						System.out.println(" Maths: " + e.maths);
					});
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

/**
 * Contains marksheet data
 *
 */
class Marksheet {

	public String name = null;
	public int physics = 0;
	public int chemistry = 0;
	public int maths = 0;
	public int sum = 0;
	public int percentage = 0;

	public Marksheet(String n, int p, int c, int m) {
		name = n;
		physics = p;
		chemistry = c;
		maths = m;
	}

}
