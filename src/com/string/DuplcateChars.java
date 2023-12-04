package com.string;

public class DuplcateChars {
public static void main(String[] args) {
	
	String str="Rainier SoftTech";
	String lowerCase = str.toLowerCase();
	String trim = lowerCase.trim();
	for(int i=0;i<trim.length();i++) {
		for(int j=i+1;j<trim.length();j++) {
			if(i==j) {
				System.out.println(i);
			}
		}
	}
	
	
	
}
}
