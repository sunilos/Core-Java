```java
package com.sunilos.p11thread;

/**
 * An example thread class created using the Runnable interface
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class HelloRunnable implements Runnable {

    /**
     * Name of the thread
     */
    private String name = null;

    /**
     * Parameterized constructor to initialize the thread's name
     * 
     * @param n The name of the thread
     */
    public HelloRunnable(String n) {
        this.name = n; // Set the name field to the provided parameter
    }

    /**
     * Execute thread operations
     * This method contains the code that will run in the new thread
     */
    public void run() {
        // Loop to print numbers from 0 to 4999 with the thread's name
        for (int i = 0; i < 5000; i++) {
            System.out.println(i + "#" + name); // Print the current index and thread name
        }
    }

    /**
     * Test concurrent thread execution
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String args[]) {
        // Create two Thread objects with HelloRunnable instances
        Thread t1 = new Thread(new HelloRunnable("Ram")); // Thread for "Ram"
        Thread t2 = new Thread(new HelloRunnable("Shyam")); // Thread for "Shyam"
        
        // Start both threads
        t1.start();
        t2.start();
    }
}
```

### मुख्य भागों की व्याख्या:

- **Runnable इंटरफ़ेस**: `HelloRunnable` क्लास `Runnable` इंटरफ़ेस को लागू करती है, जिससे इसकी इंस्टेंस को एक थ्रेड द्वारा निष्पादित किया जा सकता है।

- **थ्रेड का नाम**: `name` फ़ील्ड थ्रेड का नाम संग्रहित करती है, जो यह पहचानने में मदद करती है कि वर्तमान में कौन सा थ्रेड निष्पादित हो रहा है।

- **कंस्ट्रक्टर**: पैरामीटरयुक्त कंस्ट्रक्टर `name` चर को प्रारंभ करता है, जिससे विभिन्न थ्रेड इंस्टेंस के लिए अद्वितीय नाम हो सकते हैं।

- **run विधि**: `run` विधि में वह कोड होता है जो थ्रेड द्वारा किया जाएगा। इस मामले में, यह 0 से 4999 तक के नंबरों को प्रिंट करता है, प्रत्येक नंबर के आगे थ्रेड का नाम जोड़ता है। यह थ्रेड द्वारा किए गए कार्य का अनुकरण करता है।

- **थ्रेड बनाना और प्रारंभ करना**: `main` विधि में, दो `Thread` ऑब्जेक्ट्स बनाए जाते हैं, प्रत्येक `HelloRunnable` के एक इंस्टेंस को लपेटते हैं। `start` विधि को प्रत्येक थ्रेड पर कॉल किया जाता है, जो थ्रेड के `run` विधि को समांतर रूप से निष्पादित करता है।
