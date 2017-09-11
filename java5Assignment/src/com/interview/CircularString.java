package com.interview;

public class CircularString {

	public static void main(String[] args) {

		String myString = "goodmorning";
		String checkString = "ninggoodmor";
		
		boolean retValue = isRotational(myString, checkString);
		System.out.println(retValue);

	}

	public static boolean isRotational(String myString, String checkString) {
		String str = myString + myString;
		if (str.contains(checkString))
			return true;
		else
			return false;
	}

}
