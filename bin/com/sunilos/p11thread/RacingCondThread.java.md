```java
package com.sunilos.p11thread;

/**
 * RacingCondThread class demonstrates how multiple threads accessing a shared resource
 * (the Account object) can lead to a race condition. 
 * 
 * The Account class resolves the race condition by synchronizing the deposit method, ensuring 
 * that only one thread can modify the account balance at a time.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class RacingCondThread extends Thread {

    // A static Account object is shared between all threads
    public static Account data = new Account();

    /**
     * Constructor to initialize the name of the thread (the person depositing money).
     * 
     * @param name The name of the thread (person making the deposit).
     */
    public RacingCondThread(String name) {
        super(name); // Call the parent Thread constructor to set the thread's name
    }

    /**
     * Each thread deposits Rs 1000 five times (total Rs 5000) into the shared Account object.
     * This is where the race condition might occur if the deposit method is not synchronized.
     */
    public void run() {
        for (int i = 0; i < 5; i++) { // Loop to deposit Rs 1000 five times
            data.deposit(getName(), 1000); // Deposit money and print the transaction
        }
    }

    /**
     * Main method that creates and starts two threads (Ram and Shyam) to demonstrate
     * the race condition and how synchronization resolves it.
     */
    public static void main(String[] args) {

        // Create two threads representing two users depositing money simultaneously
        RacingCondThread u1 = new RacingCondThread("Ram");
        RacingCondThread u2 = new RacingCondThread("Shyam");

        // Start both threads
        u1.start();
        u2.start();
    }

}

/**
 * Account class represents a bank account that allows deposits.
 * It uses a synchronized method to resolve race conditions, ensuring that only one
 * thread can modify the balance at a time.
 */
class Account {

    private int balance = 0; // Initial account balance

    /**
     * Synchronized method to deposit money into the account. Only one thread can 
     * execute this method at a time, preventing race conditions.
     * 
     * @param name   The name of the person depositing money (the thread's name).
     * @param amount The amount of money being deposited.
     */
    public synchronized void deposit(String name, int amount) {
        balance += amount; // Add the deposit amount to the balance
        System.out.println(name + " deposited Rs " + amount + ", New Balance = " + balance);
    }

}
```

### Explanation:
1. **`RacingCondThread`**: Two threads (`Ram` and `Shyam`) are created, and both try to deposit money into the same account simultaneously.
2. **Race Condition**: Without synchronization, two threads may modify the account balance at the same time, leading to inconsistent results.
3. **`synchronized deposit()`**: The `deposit` method is synchronized, ensuring that only one thread can modify the balance at a time, thus avoiding the race condition.
4. **Static Account**: The `Account` object is shared between both threads as it is declared `static`, meaning both threads act on the same account instance.
