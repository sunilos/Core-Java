
```java
package com.sunilos.p07exception;

/**
 * Tests the custom LoginException class by simulating a login authentication process.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestCustomLoginException {

    public static void main(String[] args) {
        try {
            // Attempt to authenticate with provided credentials
            authenticate("SUNRAYS", "SUNRAYS");
        } catch (LoginException e) {
            // Catch the LoginException and print its message
            System.out.println(e.getMessage());
        }
    }

    /**
     * Authenticates a user based on login and password.
     * Throws LoginException if authentication fails.
     *
     * @param login The user login ID
     * @param pwd The user password
     * @throws LoginException if the login fails
     */
    public static void authenticate(String login, String pwd) throws LoginException {
        boolean flag = true; // Simulates a failed authentication
        if (flag) {
            // If authentication fails, throw a new LoginException
            throw new LoginException();
        }
    }

}
```

### Explanation:

- **Purpose:** The `TestCustomLoginException` class is designed to demonstrate the usage of a custom exception, `LoginException`, during a simulated login authentication process.

- **Main Method:**
  - The `main` method attempts to authenticate a user by calling the `authenticate` method with example credentials.
  - If the authentication fails and a `LoginException` is thrown, the exception is caught in the `catch` block, and its message is printed.

- **Authenticate Method:**
  - This method takes a `login` and `pwd` as parameters.
  - It contains a boolean flag (`flag`) that simulates whether the authentication is successful. In this case, it's set to `true`, indicating a failure.
  - If the flag is `true`, a new `LoginException` is thrown, simulating an invalid login attempt.

- **Exception Handling:**
  - The `LoginException` is defined to provide a specific message for authentication failures, which is output when the exception is caught in the `main` method.

- **Output:**
  - When executed, the program will output the message defined in the `LoginException`, indicating that the login attempt was invalid.
