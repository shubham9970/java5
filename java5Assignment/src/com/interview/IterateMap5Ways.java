package com.interview;

import java.util.*;
import java.util.Map.Entry;

public class IterateMap5Ways {



	public static void main(String[] args) {

     Map<Integer,String>hm=new HashMap<Integer, String>();
     hm.put(101,"shubham");
     hm.put(102,"prashant");
     hm.put(103,"jaydeep");
     hm.put(104, "rohit");
     
     IterateMap5Ways obj=new IterateMap5Ways();
     
     obj.usingEntrySetWithIterator(hm);
     obj.usingKeySetWithIterator(hm);

     obj.usingForeachWithKeySet(hm);
     obj.ForEachWithENtrySet(hm);

     obj.EntrySetWithForEach(hm);
     obj.keySetwithForEach(hm);
     
	}

	private void keySetwithForEach(Map<Integer, String> hm) {

		Set<Integer>keyset=hm.keySet();
			for (Integer key : keyset) {
				System.out.println(key +" "+hm.get(key));
			}
		
	}

	private void ForEachWithENtrySet(Map<Integer, String> hm) {

		for (Entry<Integer, String> entryset : hm.entrySet()) {
			System.out.println(entryset.getKey()+" "+entryset.getValue());
		}
		System.out.println();
		
	}

	private  void EntrySetWithForEach(Map<Integer, String>hm) {
	  
		Set<Entry<Integer, String>> s=hm.entrySet();
		for (Entry<Integer,String>object : s) {
			System.out.println(object.getKey()+" "+object.getValue());
		}
		System.out.println();	
	}

	private void usingEntrySetWithIterator(Map<Integer, String> hm) {

		Set<Entry<Integer, String>> entrySet=hm.entrySet();
		Iterator itr=entrySet.iterator();
		while(itr.hasNext()){
			Entry<Integer,String> e=(Entry<Integer, String>) itr.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
		System.out.println();
	}
	private void usingKeySetWithIterator(Map<Integer, String>hm) {
		Set<Integer> keySet=hm.keySet();
		Iterator<Integer> itr = keySet.iterator();
		while(itr.hasNext()){
			int key=(int) itr.next();
			System.out.println(key+" " +hm.get(key));
		}
	}
	private void usingForeachWithKeySet(Map<Integer, String>hm) {
  
		for (Integer key : hm.keySet()) {
			System.out.println(key+" "+hm.get(key));
		}
	}

}
