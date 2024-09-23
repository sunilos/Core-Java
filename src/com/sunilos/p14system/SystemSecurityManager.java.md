
```java
package com.sunilos.p14system;

/**
 * Apply application security manager.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class SystemSecurityManager {

    public static void main(String[] args)  {

        // Get the current security manager
        SecurityManager secManager = System.getSecurityManager();
        
        // Check if a security manager is configured
        if (secManager == null) {
            System.out.println("SecurityManager is not configured");
        }

        // Create a new instance of SecurityManager
        SecurityManager mySecManager = new SecurityManager();
        
        // Set the new security manager
        System.setSecurityManager(mySecManager);

        // Retrieve the current security manager again
        secManager = System.getSecurityManager();
        
        // Confirm if the security manager is now configured
        if (secManager != null) {
            System.out.println("SecurityManager is configured");
        }
    }
}
```

### Explanation:
- **Security Manager**: The `SecurityManager` class in Java is used to implement a security policy for the application, defining what resources an application can access.
- **Checking Current Security Manager**: The program first checks if a `SecurityManager` is already set. If not, it prints a message indicating that.
- **Setting a New Security Manager**: A new `SecurityManager` instance is created and set as the current security manager using `System.setSecurityManager()`.
- **Verification**: After setting the new security manager, the program checks again to confirm that the security manager is now configured and prints a corresponding message.

### Note:
Using a security manager can help enforce security policies in Java applications, especially those that perform sensitive operations. However, be aware that starting from Java 17, the security manager has been deprecated, and applications are encouraged to use alternatives for security management.
