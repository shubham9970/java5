package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindDuplicatesElementsFromArray {

	public static void main(String[] args) {

	
		Integer[] a1={1,2,1,3,1,2,4,1};
		List list1=new ArrayList(Arrays.asList(a1));
		HashSet s=new HashSet();
		HashSet s1=new HashSet();
		for (Object object : list1) {
			if(s.add(object)==false){
				s1.add(object);
			}
		}
		System.out.println(s1);
		
		
		//   l.retainAll(l); if u use two aaraylist then use retainall().

		Integer[] a2={1,2,7,8,4};
		List list2=new ArrayList(Arrays.asList(a2));
		
		list1.retainAll(list2);
		System.out.println(list1);//o/p= [1, 2, 1, 1, 2, 4, 1]see the output it contain duplicates if we dont want duplicate then convert it list into hashset.
		
		
		list2.retainAll(list1);
		System.out.println(list2);//o/p= [1, 2, 4]

		
		Integer[] a3={1,2,7,8,4};
		List list3=new ArrayList(Arrays.asList(a2));
		
		list1.containsAll(list2); //use contain() or cointainAll().
		System.out.println(list1);//o/p= [1, 2, 1, 1, 2, 4, 1]see the output it contain duplicates if we dont want duplicate then convert it list into hashset.
		
		
		list2.containsAll(list1);  //use contain() or cointainAll().
		System.out.println(list2);//o/p= [1, 2, 4]
	}

}
