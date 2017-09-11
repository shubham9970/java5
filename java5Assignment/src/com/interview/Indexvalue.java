package com.interview;

public class Indexvalue {
	public static void main(String[] args) {
		int [] a={1,2,3,7,11,4};

		int temp=1;
		while(a.length>temp){
			System.out.println(a[temp]);
			if(a[temp]==temp)
				break;
			temp=a[temp];
		}	
	}
}
