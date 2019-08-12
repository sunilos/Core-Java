package com.sunilos.p06oop;
/**
 * Use of Other class in current Package
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class ThisPkgOtherClass {

	public static void main(String[] args) {

		MyClass c = new MyClass();
		System.out.println(c.defaultAttribute);
		System.out.println(c.protectedAttribute);
		System.out.println(c.publicAttribute);
	}

}
