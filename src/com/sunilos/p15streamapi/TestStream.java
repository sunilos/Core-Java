package com.sunilos.p15streamapi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This class tests Steam APIs. It has example code for stream inputs, basics,
 * and statistical operations.
 * 
 * @author SunilOS
 *
 */
public class TestStream {

	public static void main(String[] args) throws IOException {
		inputs();
		basics();
		statistics();
	}

	/**
	 * Shows Stream inputes
	 * 
	 * @throws IOException
	 */
	public static void inputs() throws IOException {

		// From array
		String[] team = { "Ram", "Shyam", "Ajay", "Vijay" };
		Stream<String> arrayStream = Arrays.stream(team);

		// From collection
		List<String> items = Arrays.asList("One", "Two", "Three", "Three", "Four");
		Stream<String> collectionStream = items.stream();

		// From file
		Stream<String> stream = Files.lines(Paths.get("marksheets.txt"));

		// Generator
		Random random = new Random();

		// Stream<Integer> randomNumbers = Stream.generate(random::nextInt);
		Stream<Double> randomNumbers = Stream.generate(Math::random);
		randomNumbers.limit(5).forEach(System.out::println);

		System.out.println("Input ends");

	}

	/**
	 * It shows stream basic operations
	 */
	public static void basics() {

		// Stream can be created by a Collection
		List<String> items = Arrays.asList("One", "Two", "Three", "Three", "Four");

		Stream<String> stream = items.stream();

		// Print all elements of collection
		System.out.println("#Print all elements of collection");
		items.stream().forEach(e -> {
			System.out.println(e);
		});

		// Sort a collection and print
		System.out.println("#Sort a collection and print");
		items.stream().sorted().forEach(e -> {
			System.out.println(e);
		});

		// Convert and Print all elements of collection
		System.out.println("#Convert collection elements to uppercase and print");
		items.stream().map(e -> e.toUpperCase()).forEach(e -> {
			System.out.println(e);
		});

		// Filter, convert and Print all elements of collection
		System.out.println("#Filter T% name, convert to uppercase and print all elements of stream");
		items.stream().filter(e -> e.startsWith("T")).map(e -> e.toUpperCase()).forEach(e -> {
			System.out.println(e);
		});

		// Filter, convert and Print all elements of collection
		System.out.println(
				"#Filter names starting with T character, convert to uppercase, remove duplicate, and print all elements of stream");
		items.stream().filter(e -> e.startsWith("T")).distinct().map(e -> e.toUpperCase()).forEach(e -> {
			System.out.println(e);
		});

		// Get the collection from stream
		List<String> l = items.stream().filter(e -> e.startsWith("T")).distinct().map(e -> e.toUpperCase()).sorted()
				.collect(Collectors.toList());

		long count = items.stream().count();

		System.out.println("count = " + count);

	}

	/**
	 * It shows statistical data of Integer/Double series
	 */
	public static void statistics() {

		List<Integer> marks = Arrays.asList(80, 90, 75, 50, 45, 95, 75);

		// Get statistical data for Marks
		IntSummaryStatistics mStats = marks.stream().mapToInt(x -> x).summaryStatistics();

		System.out.println("## Marks statistics ##");
		System.out.println("Max Marks: " + mStats.getMax());
		System.out.println("Min Matrks: " + mStats.getMin());
		System.out.println("Average Marks:" + mStats.getAverage());
		System.out.println("Sum : " + mStats.getSum());
		System.out.println();

		List<Double> accountBalance = Arrays.asList(10000.89, 20000.77, 5000.66, 5500.55, 7000.88, 30000.99, 50000.00);

		// Get statistical data for Balance
		DoubleSummaryStatistics aStats = accountBalance.stream().mapToDouble(x -> x).summaryStatistics();
		System.out.println("## Balance statistics ## ");
		System.out.println("Max Balance: " + aStats.getMax());
		System.out.println("Min Balance: " + aStats.getMin());
		System.out.println("Average Balance:" + aStats.getAverage());
		System.out.println("Sum : " + aStats.getSum());

	}

}
