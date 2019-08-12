package com.sunilos.p06oop;
/**
 * Class Employee extends Class Person 
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Employee extends Person {

	private float salary = 0;

	public Employee() {
	}

	public Employee(String name, String add, float sal) {
		super(name, add);
		salary = sal;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
