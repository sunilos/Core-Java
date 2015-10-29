package com.sunrays.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.sunrays.dto.Employee;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 * 
 */

public class ObjectWriter {

	public static void main(String[] args) throws IOException {

		FileOutputStream fileOutputStream = new FileOutputStream(
				"c:/object.ser");

		ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);

		Employee emp = new Employee(1, "Nikku", "Rathore");
		emp.setTempValue("This is temp value");

		out.writeObject(emp);

		out.close();

		System.out.println("Object successfully persisted");
	}

}
