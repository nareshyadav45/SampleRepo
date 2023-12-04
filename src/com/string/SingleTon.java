package com.string;

public class SingleTon {
	private static SingleTon singleTon;
	private SingleTon() {
		
	}
	
	public static SingleTon getInstance() {
		if(singleTon==null) {
			singleTon =new SingleTon();
		}
		return singleTon;
	}
	
	public void m1() {
		System.out.println("kkkhjnx");
	}
	public static void main(String[] args) {
		SingleTon t1=new SingleTon();
		t1.getInstance();
		t1.m1();
		
		SingleTon t2=new SingleTon();
		t2.getInstance();
		t2.m1();
	
	}

}
