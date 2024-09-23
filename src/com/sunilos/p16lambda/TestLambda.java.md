
```java
package com.sunilos.p16lambda;

/**
 * Test class for Lambda functions
 * 
 * @author Sunil Sahu
 */
public class TestLambda {

    public static void main(String[] args) {
        // Anonymous object using conventional approach
        HelloInt aFun = new HelloInt() {
            public void say() {
                System.out.println("Hello anonymous conventional function");
            }
        };

        aFun.say(); // Call the method of the conventional anonymous function

        // Anonymous object using lambda function
        HelloInt lambFun = () -> System.out.println("Hello anonymous lambda function");
        lambFun.say(); // Call the method of the lambda function

        // Add lambda implementation of Math functional interface
        MathInt add = (a, b) -> a + b; // Simplified lambda expression

        // Multiply lambda implementation of Math functional interface
        MathInt multiply = (a, b) -> a * b; // Simplified lambda expression

        // Subtract lambda implementation of Math functional interface
        MathInt subtract = (a, b) -> a - b; // Simplified lambda expression

        int a = 10;
        int b = 5;

        // Calculate and print results
        System.out.println("Add: " + add.calculate(a, b));
        System.out.println("Multiply: " + multiply.calculate(a, b));
        System.out.println("Subtract: " + subtract.calculate(a, b));

        // Method reference in lambda function
        GreetingInt g = System.out::println; // Method reference to println
        g.hello("Ram"); // Call hello method with "Ram"
        g.hello("Shyam"); // Call hello method with "Shyam"
    }
}

// Functional interface with a single abstract method
@FunctionalInterface
interface HelloInt {
    public void say();
}

// Functional interface for greeting with a name
@FunctionalInterface
interface GreetingInt {
    public void hello(String name);
}

// Functional interface for mathematical operations
@FunctionalInterface
interface MathInt {
    public int calculate(int a, int b);
}
```

### Explanation:

- **Main Class (`TestLambda`)**:
  - **Main Method**: Demonstrates the use of lambda functions and method references.

- **Anonymous Objects**:
  - **Conventional Approach**: Creates an anonymous class implementing the `HelloInt` interface, which prints a greeting.
  - **Lambda Function**: Creates a lambda expression that implements the same interface in a more concise way.

- **Mathematical Operations**:
  - Three lambda expressions implement the `MathInt` interface for addition, multiplication, and subtraction. Each operation takes two integers as parameters and returns an integer result.

- **Method References**:
  - Uses a method reference for the `GreetingInt` interface, referencing `System.out.println`. This allows calling the `hello` method with a name, which simply prints it.

### Functional Interfaces:
- Each of the interfaces (`HelloInt`, `GreetingInt`, `MathInt`) is marked with the `@FunctionalInterface` annotation, which ensures that the interface has exactly one abstract method, making it suitable for use with lambda expressions.

### Summary:
This class illustrates how to use lambda expressions and method references in Java, showcasing their conciseness and ease of use compared to traditional anonymous classes. It also highlights the concept of functional interfaces, which are essential for working with lambdas.
