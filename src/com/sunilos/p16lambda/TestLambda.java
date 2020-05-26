package com.sunilos.p16lambda;

public class TestLambda {

	public static void main(String[] args) {

		HelloInt aFun = new HelloInt() {
			public void say() {
				System.out.println("Hello Anonymous Function");
			}
		};

		aFun.say();

		HelloInt lambFun = () -> System.out.println("Hello Lambda");

		lambFun.say();

		MathInt add = (a, b) -> {
			return a + b;
		};

		MathInt multiply = (a, b) -> {
			return a * b;
		};

		MathInt subtract = (a, b) -> {
			return a - b;
		};

		int a = 10;
		int b = 5;

		System.out.println("Add " + add.calculate(a, b));
		System.out.println("Multiply " + multiply.calculate(a, b));
		System.out.println("Suntract " + subtract.calculate(a, b));

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
