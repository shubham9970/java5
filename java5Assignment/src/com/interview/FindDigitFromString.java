/*
 * prog1. Find out digits from string.
 * prog2. sum of digits from string.
 * prog3. sum numbers from the strings
*/
package com.interview;

public class FindDigitFromString {

	public static void main(String[] args) throws Exception {
		String s = "b2b67c21t"; //Note-int this prog we must add our own one character at last to the string......
		String s1="";
		int sum = 0;
		int count=0;
		char[] c = s.toCharArray();
		boolean b = false;

		for (int i = 0; i < c.length; i++) {
			if (Character.isDigit(c[i])) {
				s1=Character.toString(c[i])+s1;
				b = true;
				System.out.print(Character.getNumericValue(c[i]));
				count=count+Character.getNumericValue(c[i]);
			}
			else
			{
				if (b)
				{
					sum = sum + Integer.parseInt(s1);				b = false;
					s1 = "";
				}
			}
		}
		System.out.println(" sum of digit in the String "+count);
		System.out.print(" These are the digits in the String "+s);
		System.out.println("\n Sum of Numbers In Strings "+sum);

	}

}
