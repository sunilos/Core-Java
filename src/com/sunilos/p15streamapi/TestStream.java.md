
```java
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
 * This class tests Stream APIs. It has example code for stream inputs, basics,
 * and statistical operations.
 * 
 * @author SunilOS
 */
public class TestStream {

    public static void main(String[] args) throws IOException {
        inputs();
        basics();
        statistics();
    }

    /**
     * Shows Stream inputs
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

        // Generator for random numbers
        Random random = new Random();
        Stream<Double> randomNumbers = Stream.generate(Math::random);
        randomNumbers.limit(5).forEach(System.out::println); // Print 5 random doubles

        System.out.println("Input ends");
    }

    /**
     * It shows stream basic operations
     */
    public static void basics() {

        // Stream created from a Collection
        List<String> items = Arrays.asList("One", "Two", "Three", "Three", "Four");
        Stream<String> stream = items.stream();

        // Print all elements of collection
        System.out.println("# Print all elements of collection");
        items.stream().forEach(System.out::println);

        // Sort a collection and print
        System.out.println("# Sort a collection and print");
        items.stream().sorted().forEach(System.out::println);

        // Convert and Print all elements of collection to uppercase
        System.out.println("# Convert collection elements to uppercase and print");
        items.stream().map(String::toUpperCase).forEach(System.out::println);

        // Filter, convert and Print elements starting with 'T'
        System.out.println("# Filter names starting with 'T', convert to uppercase and print");
        items.stream()
            .filter(e -> e.startsWith("T"))
            .map(String::toUpperCase)
            .forEach(System.out::println);

        // Filter, convert, remove duplicates and print elements starting with 'T'
        System.out.println("# Filter names starting with 'T', convert to uppercase, remove duplicates, and print");
        items.stream()
            .filter(e -> e.startsWith("T"))
            .distinct()
            .map(String::toUpperCase)
            .forEach(System.out::println);

        // Collect filtered, converted elements into a list
        List<String> filteredList = items.stream()
            .filter(e -> e.startsWith("T"))
            .distinct()
            .map(String::toUpperCase)
            .sorted()
            .collect(Collectors.toList());

        long count = items.stream().count(); // Count total elements

        System.out.println("Count = " + count);
    }

    /**
     * It shows statistical data of Integer/Double series
     */
    public static void statistics() {

        List<Integer> marks = Arrays.asList(80, 90, 75, 50, 45, 95, 75);

        // Get statistical data for Marks
        IntSummaryStatistics mStats = marks.stream()
            .mapToInt(x -> x)
            .summaryStatistics();

        System.out.println("## Marks statistics ##");
        System.out.println("Max Marks: " + mStats.getMax());
        System.out.println("Min Marks: " + mStats.getMin());
        System.out.println("Average Marks: " + mStats.getAverage());
        System.out.println("Sum: " + mStats.getSum());
        System.out.println();

        List<Double> accountBalance = Arrays.asList(10000.89, 20000.77, 5000.66, 5500.55, 7000.88, 30000.99, 50000.00);

        // Get statistical data for Balance
        DoubleSummaryStatistics aStats = accountBalance.stream()
            .mapToDouble(x -> x)
            .summaryStatistics();
        System.out.println("## Balance statistics ##");
        System.out.println("Max Balance: " + aStats.getMax());
        System.out.println("Min Balance: " + aStats.getMin());
        System.out.println("Average Balance: " + aStats.getAverage());
        System.out.println("Sum: " + aStats.getSum());
    }
}
```

### Explanation:

- **Main Class (`TestStream`)**:
  - **Main Method**: Calls three methods (`inputs`, `basics`, and `statistics`) to demonstrate various Stream operations.

- **`inputs` Method**: 
  - Demonstrates how to create streams from different sources: arrays, collections, files, and random number generators.
  - Uses `Math.random` to generate random double values.

- **`basics` Method**: 
  - Shows basic operations on streams:
    - Printing all elements.
    - Sorting and printing elements.
    - Converting elements to uppercase and printing.
    - Filtering elements (e.g., those starting with 'T'), converting them to uppercase, and removing duplicates.
    - Collecting results into a new list and counting elements.

- **`statistics` Method**: 
  - Uses `IntSummaryStatistics` and `DoubleSummaryStatistics` to compute and display statistical data (max, min, average, sum) for integer and double lists.

