package com.interview;

public class StringReverse {

	public static void main(String[] args) {

		String s1="good morning ";
		String s2=" yogesh sir";
		String s3="GOOD MORNING";
		String s4=s1;
		
		System.out.println(s1.charAt(6)); //o
        System.out.println(s1.compareTo(s2)); //
		System.out.println(s4.compareToIgnoreCase(s1));
		
        System.out.println(s1.concat(s2));
        System.out.println(s1.contains(s3));
        System.out.println(s1.equals(s3));
        
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.indexOf('m'));
        System.out.println(s1.isEmpty());
        
        System.out.println(s1.toUpperCase());
        System.out.println(s1.lastIndexOf('n'));
        System.out.println(s1.length());
        System.out.println(s1.replace(s1, s2));
        
        
       
        System.out.println(s1.trim());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.valueOf(s2));       
	}

	

}
