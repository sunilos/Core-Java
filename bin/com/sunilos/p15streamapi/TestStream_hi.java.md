
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
 * यह क्लास Stream API को टेस्ट करती है। इसमें स्ट्रीम इनपुट्स, बेसिक ऑपरेशन्स, 
 * और सांख्यिकीय ऑपरेशन्स के उदाहरण कोड दिए गए हैं।
 * 
 * @लेखक SunilOS
 */
public class TestStream {

    public static void main(String[] args) throws IOException {
        inputs();
        basics();
        statistics();
    }

    /**
     * Stream इनपुट्स दिखाता है
     * 
     * @throws IOException
     */
    public static void inputs() throws IOException {

        // Array से Stream
        String[] team = { "Ram", "Shyam", "Ajay", "Vijay" };
        Stream<String> arrayStream = Arrays.stream(team);

        // Collection से Stream
        List<String> items = Arrays.asList("One", "Two", "Three", "Three", "Four");
        Stream<String> collectionStream = items.stream();

        // फ़ाइल से Stream
        Stream<String> stream = Files.lines(Paths.get("marksheets.txt"));

        // रैंडम नंबर जनरेटर
        Random random = new Random();
        Stream<Double> randomNumbers = Stream.generate(Math::random);
        randomNumbers.limit(5).forEach(System.out::println); // 5 रैंडम डबल प्रिंट करें

        System.out.println("Input समाप्त");
    }

    /**
     * Stream के बेसिक ऑपरेशन्स दिखाता है
     */
    public static void basics() {

        // Collection से Stream बनाई
        List<String> items = Arrays.asList("One", "Two", "Three", "Three", "Four");
        Stream<String> stream = items.stream();

        // Collection के सभी एलिमेंट्स प्रिंट करें
        System.out.println("# Collection के सभी एलिमेंट्स प्रिंट करें");
        items.stream().forEach(System.out::println);

        // Collection को sort करके प्रिंट करें
        System.out.println("# Collection को sort करके प्रिंट करें");
        items.stream().sorted().forEach(System.out::println);

        // सभी एलिमेंट्स को uppercase में बदलें और प्रिंट करें
        System.out.println("# Collection के एलिमेंट्स को uppercase में बदलें और प्रिंट करें");
        items.stream().map(String::toUpperCase).forEach(System.out::println);

        // 'T' से शुरू होने वाले नामों को uppercase में बदलें और प्रिंट करें
        System.out.println("# 'T' से शुरू होने वाले नामों को uppercase में बदलें और प्रिंट करें");
        items.stream()
            .filter(e -> e.startsWith("T"))
            .map(String::toUpperCase)
            .forEach(System.out::println);

        // 'T' से शुरू होने वाले नामों को uppercase में बदलें, डुप्लिकेट्स हटाएँ और प्रिंट करें
        System.out.println("# 'T' से शुरू होने वाले नामों को uppercase में बदलें, डुप्लिकेट्स हटाएँ और प्रिंट करें");
        items.stream()
            .filter(e -> e.startsWith("T"))
            .distinct()
            .map(String::toUpperCase)
            .forEach(System.out::println);

        // फ़िल्टर किए गए एलिमेंट्स को एक लिस्ट में संग्रह करें
        List<String> filteredList = items.stream()
            .filter(e -> e.startsWith("T"))
            .distinct()
            .map(String::toUpperCase)
            .sorted()
            .collect(Collectors.toList());

        long count = items.stream().count(); // कुल एलिमेंट्स की गिनती

        System.out.println("Count = " + count);
    }

    /**
     * Integer/Double सीरीज के सांख्यिकीय डेटा को दिखाता है
     */
    public static void statistics() {

        List<Integer> marks = Arrays.asList(80, 90, 75, 50, 45, 95, 75);

        // Marks का सांख्यिकीय डेटा प्राप्त करें
        IntSummaryStatistics mStats = marks.stream()
            .mapToInt(x -> x)
            .summaryStatistics();

        System.out.println("## Marks का सांख्यिकीय डेटा ##");
        System.out.println("अधिकतम अंक: " + mStats.getMax());
        System.out.println("न्यूनतम अंक: " + mStats.getMin());
        System.out.println("औसत अंक: " + mStats.getAverage());
        System.out.println("कुल: " + mStats.getSum());
        System.out.println();

        List<Double> accountBalance = Arrays.asList(10000.89, 20000.77, 5000.66, 5500.55, 7000.88, 30000.99, 50000.00);

        // Balance का सांख्यिकीय डेटा प्राप्त करें
        DoubleSummaryStatistics aStats = accountBalance.stream()
            .mapToDouble(x -> x)
            .summaryStatistics();
        System.out.println("## Balance का सांख्यिकीय डेटा ##");
        System.out.println("अधिकतम बैलेंस: " + aStats.getMax());
        System.out.println("न्यूनतम बैलेंस: " + aStats.getMin());
        System.out.println("औसत बैलेंस: " + aStats.getAverage());
        System.out.println("कुल: " + aStats.getSum());
    }
}
```

### व्याख्या:

- **मुख्य क्लास (`TestStream`)**:
  - **मुख्य विधि**: तीन विधियों (`inputs`, `basics`, और `statistics`) को कॉल करती है, जो विभिन्न Stream ऑपरेशन्स को दिखाती हैं।

- **`inputs` विधि**:
  - यह विभिन्न स्रोतों से स्ट्रीम बनाने का तरीका दिखाती है: arrays, collections, files, और random number generators।
  - `Math.random` का उपयोग करके रैंडम डबल वैल्यूज जेनरेट करती है।

- **`basics` विधि**:
  - स्ट्रीम के बेसिक ऑपरेशन्स दिखाती है:
    - सभी एलिमेंट्स को प्रिंट करना।
    - एलिमेंट्स को sort करके प्रिंट करना।
    - एलिमेंट्स को uppercase में बदलना और प्रिंट करना।
    - 'T' से शुरू होने वाले एलिमेंट्स को uppercase में बदलकर प्रिंट करना और डुप्लिकेट्स हटाना।
    - फ़िल्टर किए गए रिजल्ट्स को एक नई लिस्ट में संग्रह करना और एलिमेंट्स की गिनती करना।

- **`statistics` विधि**:
  - `IntSummaryStatistics` और `DoubleSummaryStatistics` का उपयोग करके integer और double लिस्ट्स के सांख्यिकीय डेटा (max, min, average, sum) को कंप्यूट और डिस्प्ले करती है।

यह कोड स्ट्रीम API के विभिन्न फंक्शनलिटी और ऑपरेशन्स को दर्शाता है, जैसे स्ट्रीम बनाना, बेसिक ऑपरेशन्स करना और सांख्यिकीय डेटा प्राप्त करना।
