
```java
package com.sunilos.p15streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * It has a Lucky Draw Contest in which contestants have to send SMS. It will
 * select random 3 winners from received SMSs using streams.
 * 
 * @author SunilOS
 */
public class ContestWinner {

    public static void main(String[] args) {

        ArrayList<Contestant> list = new ArrayList<Contestant>();
        list.add(new Contestant("Ram", "9912345678"));
        list.add(new Contestant("Shyam", "9912342222"));
        list.add(new Contestant("Ajay", "9912345770"));
        list.add(new Contestant("Vijay", "9912345678"));
        list.add(new Contestant("Jay", "9912345888"));
        list.add(new Contestant("Pappu", "9912345111"));
        list.add(new Contestant("InvalidNO", "11"));

        System.out.println("Winners !!");

        // 1. Takes phone number,
        // 2. Filters valid phone numbers,
        // 3. Removes duplicates,
        // 4. Shuffles phone numbers,
        // 5. Gets three winners,
        // 6. Displays winners
        list.stream()
            .map(e -> e.phone) // Extract phone numbers
            .filter(e -> e.length() == 10) // Filter valid phone numbers (10 digits)
            .distinct() // Remove duplicates
            .collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
                Collections.shuffle(e); // Shuffle the list
                return e.stream(); // Convert back to stream
            }))
            .limit(3) // Get only three winners
            .forEach(e -> System.out.println(e)); // Display winners
    }
}

/**
 * Contains contestant information
 */
class Contestant {
    public String name = null;
    public String phone = null;

    public Contestant(String n, String p) {
        name = n;
        phone = p;
    }
}
```

### Explanation:
- **Contestant Class**: This class represents a contestant with a name and phone number. It has a constructor to initialize these fields.

- **Main Class (`ContestWinner`)**:
  - **List Initialization**: An `ArrayList` of `Contestant` objects is created, representing the participants in the contest.
  
  - **Stream Processing**:
    - `map(e -> e.phone)`: This transforms the stream of `Contestant` objects into a stream of phone numbers.
    - `filter(e -> e.length() == 10)`: Filters out invalid phone numbers, retaining only those with exactly 10 digits.
    - `distinct()`: Removes duplicate phone numbers to ensure each contestant is counted only once.
    - `collect(Collectors.collectingAndThen(...))`: This is a two-step collection process:
      - First, it collects the filtered and distinct phone numbers into a `List`.
      - Then, it shuffles the list randomly using `Collections.shuffle(e)`.
      - Finally, it converts the shuffled list back into a stream.
    - `limit(3)`: Limits the output to three winners.
    - `forEach(e -> System.out.println(e))`: Prints the selected winners.

This code effectively demonstrates the use of Java Streams for processing collections, including filtering, collecting, and shuffling. It provides a clear, concise way to handle contest logic using modern Java features.
