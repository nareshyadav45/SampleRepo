package com.collection;

public class CollcetionsFrame {
	public static void main(String[] args) {
		
		int[] a= {1,2,4,5,5,5,1};
		int count=0;
		for(int i=0;i<=a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count=count+1;	
				}
			}
		}
		System.out.println(count);
             if(count>0) {
            	 System.out.println("array contains duplicate elements");
             }else {
            	 System.out.println("array doesn't contain any duplicates");
             }
		
		
	}

}
