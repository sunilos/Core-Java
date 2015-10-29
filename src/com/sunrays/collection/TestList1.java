package com.sunrays.collection;

import java.util.ArrayList;
import java.util.Vector;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class TestList1 {

	public static void main(String[] args) {

		// ArrayList strList = new ArrayList(20); //Initial Capacity
		//ArrayList strList = new ArrayList();
		Vector strList = new Vector();

		
		
		for (int i = 0; i < 25; i++) {
			String str = "#" + (i + 1);
			strList.add(str);
		}

		/*
		 * int Integer long Long double Double boolean Boolean
		 */

		for (int i = 0; i < 25; i++) {

			Integer integ = new Integer(i + 1);

			strList.add(integ);
		}

		// strList.ensureCapacity(50);

		int size = strList.size();

		for (int i = 0; i < 25; i++) {
			String str = (String)strList.get(i);
			
			System.out.println(str);
		}
		

		for (int i = 25; i < size; i++) {
			Integer inte = (Integer)strList.get(i);
			
			System.out.println(inte);
		}

	}

}
