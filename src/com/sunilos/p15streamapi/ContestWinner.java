package com.sunilos.p15streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * It has Lucky Draw Contest in which contestants have to send SMS. It will
 * select random 3 winners from received SMSs using streams.
 * 
 * @author SunilOS
 *
 */
public class ContestWinner {

	public static void main(String[] args) {

		ArrayList<Contestant> list = new ArrayList<Contestant>();
		list.add(new Contestant("Ram", "9912345678"));
		list.add(new Contestant("Shyam", "9912342222"));
		list.add(new Contestant("Ajay", "9912345770"));
		list.add(new Contestant("Vijay", "9912345678"));
		list.add(new Contestant("Jay", "9912345888"));
		list.add(new Contestant("Pappu", "9912345111"));
		list.add(new Contestant("InvalidNO", "11"));

		System.out.println("Winners !!");

		// 1.Takes phone number,
		// 2. filter valid phone numbers,
		// 3. remove duplicate,
		// 4. shuffle phone numbers,
		// 5. get three winner,
		// 6. display winner
		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(3).forEach(e -> System.out.println(e));

	}
}

/**
 * Contains contestant information
 */
class Contestant {
	public String name = null;
	public String phone = null;

	public Contestant(String n, String p) {
		name = n;
		phone = p;
	}
}