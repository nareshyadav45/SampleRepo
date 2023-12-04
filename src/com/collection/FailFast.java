package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class FailFast {
	public static void main(String[] args) {

		Map<String, String> empName = new HashMap<String, String>();
		empName.put("Sam Hanks", "New york");
		empName.put("Will Smith", "LA");
		empName.put("Scarlett", "Chicago");
		 Iterator<Entry<String, String>> iterator = empName.entrySet().iterator();
		//Iterator<String> iterator = empName.keySet().iterator();
		while(iterator.hasNext()) {
			Entry<String, String> next = iterator.next();
			System.out.println(next);
			empName.put("Naresh", "Yadav");
			
		}
//		while (iterator.hasNext()) {
//			// String next = iterator.next();
//			String string = empName.get(iterator.next());
//			System.out.println(string);
//			empName.put("jane", "williams");
//
//		}

	}

}
