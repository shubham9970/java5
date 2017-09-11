package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*public class ReverseString5Ways {

	public static void main(String[] args) {

		String s = "shubham";
		for (int i = s.length()-1; i >= 0; i--)
			System.out.print(s.charAt(i));
	}
}*/

/*public class ReverseString5Ways {

	public static void main(String[] args) {

		String s = "shubham";
		StringBuffer s1=new StringBuffer(s);
			System.out.print(s1.reverse());
	}
}*/

/*public class ReverseString5Ways {

	public static void main(String[] args) {

		String s = "shubham";
		StringBuilder s1=new StringBuilder(s);
			System.out.print(s1.reverse());
	}
}*/

/*public class ReverseString5Ways {

	public static void main(String[] args) {

		String s = "shubham";
		char[] c=s.toCharArray();
		for (int i = s.length()-1; i >= 0; i--) //and for each loop
			System.out.print(c[i]);
	}
}*/


public class ReverseString5Ways {

	public static void main(String[] args) {
		ReverseString5Ways obj = new ReverseString5Ways();
		String str = "shubham";
		System.out.println("Reverse of \'" + str + "\' is \'"+ obj.reverse1(str) + "\'");
	System.out.println(str.substring(1)+str.charAt(0));
	}
	public String reverse1(String str) {
		if ((str == null) || (str.length() <= 1))
			return str;
		return reverse1(str.substring(1)) + str.charAt(0);
	}

}
