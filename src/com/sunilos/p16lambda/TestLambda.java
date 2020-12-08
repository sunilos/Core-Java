package com.sunilos.p16lambda;

/**
 * Test class for Lambda functions
 * 
 * @author Sunil Sahu
 * 
 */
public class TestLambda {

	public static void main(String[] args) {

		// Anonymous object using conventional approach
		HelloInt aFun = new HelloInt() {
			public void say() {
				System.out.println("Hello anonymous conventional function");
			}
		};

		aFun.say();

		// Anonymous object using lambda function
		HelloInt lambFun = () -> System.out.println("Hello anonymous lambda  function");

		lambFun.say();

		// Add lambda implementation of Math functional interface
		MathInt add = (a, b) -> {
			return a + b;
		};

		// Multiply lambda implementation of Math functional interface
		MathInt multiply = (a, b) -> {
			return a * b;
		};

		// Subtract lambda implementation of Math functional interface
		MathInt subtract = (a, b) -> {
			return a - b;
		};

		int a = 10;
		int b = 5;

		System.out.println("Add " + add.calculate(a, b));
		System.out.println("Multiply " + multiply.calculate(a, b));
		System.out.println("Suntract " + subtract.calculate(a, b));

		// Method reference in lambda function
		GreetingInt g = System.out::println;
		g.hello("Ram");
		g.hello("Shyam");

	}

}

@FunctionalInterface
interface HelloInt {
	public void say();
}

@FunctionalInterface
interface GreetingInt {
	public void hello(String name);
}

@FunctionalInterface
interface MathInt {
	public int calculate(int a, int b);
}
