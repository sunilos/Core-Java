
```java
package com.sunilos.p11thread;

/**
 * Account class containing synchronized method and synchronized block
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class Account {

    /**
     * Contains balance of amount
     */
    private int balance = 0; // Initial balance set to 0

    /**
     * Deposits amount in account. It is synchronized, only one thread can
     * deposit amount at a time.
     * 
     * This uses method synchronization
     * 
     * @param msg Message to display the action
     * @param amt Amount to be deposited
     */
    public synchronized void deposit(String msg, int amt) {
        int bal = getBalance() + amt; // Calculate new balance
        setBalance(bal); // Update balance
        System.out.println(msg + " new balance " + bal); // Print new balance
    }

    /**
     * Withdraws amount from account. It is synchronized, only one thread can
     * withdraw amount at a time.
     * 
     * This uses block synchronization
     * 
     * @param msg Message to display the action
     * @param amt Amount to be withdrawn
     */
    public synchronized void withdraw(String msg, int amt) {
        int bal = 0; // Initialize balance variable
        synchronized (this) { // Block synchronization to ensure thread safety
            bal = getBalance() - amt; // Calculate new balance after withdrawal
            setBalance(bal); // Update balance
        }
        System.out.println(msg + " Now Balance is " + bal); // Print updated balance
    }

    /**
     * Gets the account balance
     * 
     * @return Current balance
     */
    public int getBalance() {
        // Simulate database operation delay
        databaseDelay(); 
        return balance; // Return current balance
    }

    /**
     * Sets the balance
     * 
     * @param balance New balance to set
     */
    public void setBalance(int balance) {
        // Simulate database operation delay
        databaseDelay(); 
        this.balance = balance; // Update the balance
    }

    /**
     * Simulates a database operation delay
     * 
     * Assumed that Database operation will take 200 milliseconds
     */
    public void databaseDelay() {
        try {
            Thread.sleep(200); // Simulate delay
        } catch (InterruptedException e) {
            // Handle interruption
        }
        this.balance = balance; // Ensure balance remains unchanged
    }

}
```

### Explanation of Key Parts:

- **Synchronized Methods**: The `deposit` and `withdraw` methods are synchronized, ensuring that only one thread can execute them at a time. This prevents race conditions when multiple threads attempt to modify the balance simultaneously.
  
- **Block Synchronization**: In the `withdraw` method, a synchronized block is used to provide a finer level of control over synchronization. This is useful when you want to synchronize only a part of a method.

- **Database Delay Simulation**: The `databaseDelay` method simulates a time-consuming database operation by putting the thread to sleep for 200 milliseconds. This is done to mimic real-world scenarios where operations might take time.

- **Balance Management**: The class maintains an internal state for the account balance, which is modified by the `deposit` and `withdraw` methods. Access to these methods is controlled to ensure data integrity.

