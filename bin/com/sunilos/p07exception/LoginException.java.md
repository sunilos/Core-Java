
```java
package com.sunilos.p07exception;

/**
 * The LoginException class represents a custom checked exception 
 * that is thrown when there is an issue with user authentication,
 * such as an invalid user ID or password. 
 * It inherits from the Exception class, making it a checked exception.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class LoginException extends Exception {

    /**
     * Default constructor for LoginException.
     * It calls the superclass constructor with a predefined error message.
     */
    public LoginException() {
        super("Invalid User ID/Password");
    }
}
```

### Explanation:

- **Purpose:** The `LoginException` class defines a custom checked exception that can be used in situations where a user authentication process fails, specifically when an invalid user ID or password is provided.

- **Inheritance:** This class extends `Exception`, which makes it a checked exception. This means that any method that throws this exception must declare it in its `throws` clause, and the caller must handle it either with a try-catch block or by declaring it further up the call stack.

- **Constructor:**
  - The default constructor (`LoginException()`) initializes the exception with a specific message: "Invalid User ID/Password". This message is passed to the superclass (`Exception`) constructor, providing a clear indication of the error when the exception is thrown.

- **Usage:** This custom exception can be thrown in methods related to user authentication, allowing for more descriptive error handling and improving the clarity of error messages within the application. Using a specific exception like `LoginException` helps differentiate authentication-related errors from other types of exceptions in the application.
