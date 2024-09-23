```java
package com.sunilos.p11thread;

/**
 * ThreadInfo class prints detailed information of all threads and thread groups
 * running in the JVM.
 * 
 * It navigates through the root thread group and logs information about each thread 
 * and thread group, including their name, ID, priority, state, and whether they are daemon threads.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class ThreadInfo {

    /**
     * The main() method gets the root ThreadGroup and prints all threads and groups information.
     * 
     * @param args Command-line arguments.
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        // Get the current thread (the one running this program)
        Thread t = Thread.currentThread();

        // Get the thread group of the current thread
        ThreadGroup tg = t.getThreadGroup();

        // Navigate to the root ThreadGroup (the highest parent in the hierarchy)
        while (tg.getParent() != null) {
            tg = tg.getParent();
        }

        // Print information of the root ThreadGroup and all its threads and subgroups
        info("", tg);
    }

    /**
     * Recursively prints information of a thread group and its threads.
     * 
     * @param indent String used for indentation to format the output.
     * @param tg     The thread group whose information is to be printed.
     */
    public static void info(String indent, ThreadGroup tg) {

        // Get the count of active threads in the thread group
        int threadCount = tg.activeCount();

        // Create an array to hold all active threads in the group
        Thread[] threads = new Thread[threadCount];
        tg.enumerate(threads); // Populate the threads array with active threads

        // Print the thread group information
        System.out.println(indent + "THREAD GROUP NAME: " + tg.getName());
        System.out.println(indent + "Is Daemon : " + tg.isDaemon());

        // Log details for each thread in the group
        for (int i = 0; i < threads.length; i++) {
            log(indent + "\t", threads[i]);
        }

        // Get the count of active subgroups in the thread group
        int groupCount = tg.activeGroupCount();

        // Create an array to hold the active thread subgroups
        ThreadGroup[] groups = new ThreadGroup[groupCount];
        tg.enumerate(groups); // Populate the groups array with active subgroups

        // Recursively print information for each subgroup
        for (int i = 0; i < groups.length; i++) {
            info(indent + "\t", groups[i]);
        }
    }

    /**
     * Prints information of a specific thread.
     * 
     * @param indent String used for indentation to format the output.
     * @param t      The thread whose information is to be printed.
     */
    public static void log(String indent, Thread t) {
        System.out.println(indent + "THREAD Name: " + t.getName());
        System.out.println(indent + "ID: " + t.getId());
        System.out.println(indent + "Priority: " + t.getPriority());
        System.out.println(indent + "State: " + t.getState());
        System.out.println(indent + "Thread Group: " + t.getThreadGroup().getName());
        System.out.println(indent + "Is Alive: " + t.isAlive());
        System.out.println(indent + "Is Daemon: " + t.isDaemon() + "\n");
    }

}
```

### Explanation:
1. **`Thread.currentThread()`**: Gets the current thread running this program.
2. **`ThreadGroup`**: Each thread belongs to a thread group. The `tg.getParent()` loop navigates to the root thread group.
3. **`info()`**: Recursively prints information about a thread group, including its threads and subgroups.
4. **`log()`**: Logs detailed information about each thread, such as its name, ID, priority, state, whether it is alive, and whether it is a daemon thread.
5. **Daemon threads**: Threads that run in the background and do not prevent the JVM from exiting when all non-daemon threads have finished.
