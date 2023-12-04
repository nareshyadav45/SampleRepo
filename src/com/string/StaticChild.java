package com.string;

public class StaticChild extends StaicMethodParent{
	static void m1() {
		System.out.println("child static");
	}
	public static void main(String[] args) {
		StaticChild p=new StaticChild();
		p.m1();
		
		
		
		
	}

}
