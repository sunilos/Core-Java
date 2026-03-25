```java
/**
 * The Division1 class demonstrates runtime argument passing
 * for performing division of two integers.
 * 
 * This program expects two command-line arguments. If less than
 * two arguments are provided, it prints a usage message. The first
 * argument is divided by the second, and the result is printed to 
 * the console.
 * 
 * @author Sunil Sahu
 * @version 1.0
 * @since 16 Nov 2014
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Division1 {

    /**
     * The main method is the entry point of the application.
     * It takes two command-line arguments, performs division, and 
     * prints the result. If less than two arguments are provided, 
     * it prints a usage message instead.
     *
     * @param args The runtime arguments, expected to be two integers.
     */
    public static void main(String[] args) {
        
        // Check if the number of arguments is less than 2
        if(args.length < 2){
            System.out.println("USAGE : java -cp <bin path> com.basic.Division1 <n1> <n2>");
            return;
        }

        // Parse the arguments into integers
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        // Perform division
        double div = a / b;

        // Output the result of the division to the console
        System.out.println("Division is " + div);
    }
}
```

Explanation:
- The program checks if at least two arguments are provided. If not, it shows a usage message.
- If valid arguments are given, they are parsed as integers, divided, and the result is displayed.
