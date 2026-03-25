```java
package com.sunilos.p11thread;

/**
 * Example of the join() method. In this example, a thread joins the next thread and
 * waits until the next thread is finished.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class JoiningThread extends Thread {

    // Reference to the next thread to join
    private Thread nextThread;

    /**
     * Constructor to initialize the thread with a name
     * 
     * @param name The name of the thread
     */
    public JoiningThread(String name) {
        super(name);
    }

    /**
     * Constructor to initialize the thread with a name and a reference to the next thread
     * 
     * @param name The name of the thread
     * @param other The next thread to join
     */
    public JoiningThread(String name, Thread other) {
        super(name);
        this.nextThread = other; // Store the reference to the next thread
    }

    @Override
    public void run() {
        System.out.println(getName() + " Started");

        // If there is a next thread, wait for it to finish
        if (nextThread != null) {
            if (nextThread.isAlive()) { // Check if the next thread is still running
                try {
                    // Join the next thread and wait until it is finished
                    nextThread.join();
                } catch (InterruptedException e) {
                    // Handle interruption (if needed)
                }
            }
        }

        System.out.println(getName() + " Ended");
    }

    /**
     * Main method to test the JoiningThread class
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        // Create instances of JoiningThread with dependencies
        Thread d = new JoiningThread("D");
        Thread c = new JoiningThread("C", d); // C waits for D
        Thread b = new JoiningThread("B", c); // B waits for C
        Thread a = new JoiningThread("A", b); // A waits for B

        // Start all threads
        a.start();
        b.start();
        c.start();
        d.start();

        try {
            // Main will wait until A is finished
            a.join();
        } catch (InterruptedException e) {
            // Handle interruption (if needed)
        }
        System.out.println("Main is finished");
    }
}

/**
 * Expected Output:
 * D Started
 * C Started
 * B Started
 * A Started
 * D Ended
 * C Ended
 * B Ended
 * A Ended
 * Main is finished
 */
```

### मुख्य भागों की व्याख्या:

- **JoiningThread क्लास**: यह क्लास `Thread` को एक्सटेंड करती है और `join()` विधि का उपयोग करके एक अन्य थ्रेड के समाप्त होने की प्रतीक्षा करने की तर्क शामिल करती है।

- **कंस्ट्रक्टर्स**: दो कंस्ट्रक्टर्स प्रदान किए गए हैं:
  - एक थ्रेड को नाम से प्रारंभ करता है।
  - दूसरा थ्रेड को नाम और उस अगले थ्रेड के संदर्भ के साथ प्रारंभ करता है जिसके लिए यह थ्रेड प्रतीक्षा करेगा।

- **run विधि**: `run` विधि में:
  - थ्रेड अपना नाम प्रिंट करता है जब यह शुरू होता है।
  - यदि इसके पास एक जीवित अगला थ्रेड है, तो यह उस थ्रेड पर `join()` को कॉल करता है, जिससे यह अगले थ्रेड के समाप्त होने तक प्रतीक्षा करता है।
  - अंत में, यह समाप्त होने पर अपना नाम प्रिंट करता है।

- **main विधि**: `main` विधि दिखाती है कि कैसे थ्रेड्स को निर्भरता श्रृंखला में बनाया और शुरू किया जाता है:
  - थ्रेड A, B की प्रतीक्षा करता है, B, C की प्रतीक्षा करता है, और C, D की प्रतीक्षा करता है।
  - थ्रेड्स को उनके बनाए जाने के क्रम में शुरू किया जाता है।
  - मुख्य थ्रेड A के समाप्त होने की प्रतीक्षा करता है इससे पहले कि "Main is finished" प्रिंट किया जाए।
