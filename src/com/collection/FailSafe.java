package com.collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {
	
	public void m1() throws CloneNotSupportedException {
		Object clone = this.clone();
		try {
			clone.wait(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
		
//		CopyOnWriteArrayList<Integer> conArr=new CopyOnWriteArrayList<>();
//		conArr.add(1);
//		conArr.add(12);
//		Iterator<Integer> iterator = conArr.iterator();
//		while(iterator.hasNext()) {
//			Integer next = iterator.next();
//			System.out.println(next);
//			conArr.add(13);
//			System.out.println(next);
//		}
//		
		CopyOnWriteArrayList<String> con=new CopyOnWriteArrayList<>();
		con.add("alpha");
		con.add("beta");
		con.add("gama");
		Iterator<String> iterator = con.iterator();
		while(iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
			con.add(next.indent(1));
			System.out.println(next);

		}
		
		
		
		
		
		
		
		
		
	}

}
