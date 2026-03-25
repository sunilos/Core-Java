```java
package com.sunilos.p11thread;

/**
 * PlayerThread class demonstrates the creation of a ThreadGroup and the addition
 * of multiple PlayerThread objects to this group.
 * 
 * Each PlayerThread represents a player who plays a series of matches. The class 
 * illustrates how to manage and control multiple threads through a thread group.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class PlayerThread extends Thread {

    /**
     * Constructor initializes a thread with the specified thread group and name.
     * 
     * @param tg   The thread group to which this thread belongs.
     * @param name The name of the thread (the player's name).
     */
    public PlayerThread(ThreadGroup tg, String name) {
        super(tg, name); // Calls the parent Thread class constructor to set the thread group and name
    }

    /**
     * This method defines the actions performed by the thread when it starts.
     * It simulates a player playing multiple matches by printing messages.
     */
    public void run() {
        for (int match = 1; match < 10; match++) { // Simulate 9 matches
            String msg = getName(); // Get the name of the current thread (player's name)
            msg += " played match#" + match; // Append the match number
            System.out.println(msg); // Print the message indicating which match was played
        }
    }

    /**
     * Main method where the ThreadGroup is created and PlayerThread objects are added to it.
     * The thread group information is then printed, including active threads and subgroups.
     */
    public static void main(String[] args) {

        // Create a new ThreadGroup named "Team India"
        ThreadGroup team = new ThreadGroup("Team India");

        // Create PlayerThread objects (representing players) and add them to the thread group
        PlayerThread p1 = new PlayerThread(team, "Jay");
        PlayerThread p2 = new PlayerThread(team, "Vijay");

        // Start both player threads
        p1.start();
        p2.start();

        // Print information about the thread group
        System.out.println("Thread Group Info");

        // Print the name of the thread group
        System.out.println("Name: " + team.getName());

        // Print the parent thread group (the system thread group)
        System.out.println("Parent Group: " + team.getParent());

        // Print the number of active threads in the thread group
        System.out.println("Active Threads: " + team.activeCount());

        // Print the number of active subgroups in the thread group
        System.out.println("Active Subgroups: " + team.activeGroupCount());

    }

}
```

### Explanation:
1. **`PlayerThread`**: Represents a player, each thread simulates a player playing multiple matches. Each thread is part of a thread group (`team` in this case).
2. **`ThreadGroup`**: A mechanism to group multiple threads together, making it easier to manage, control, or retrieve information about them.
3. **`team.getName()`**: Retrieves the name of the thread group ("Team India").
4. **`team.getParent()`**: Retrieves the parent of the thread group, which is typically the system thread group.
5. **`activeCount()`**: Returns the number of active threads in the thread group.
6. **`activeGroupCount()`**: Returns the number of active subgroups within the thread group.
