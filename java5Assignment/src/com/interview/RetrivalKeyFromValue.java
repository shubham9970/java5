package com.interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RetrivalKeyFromValue {

	public static void main(String[] args) {


		 Map<Integer,String>hm=new HashMap<Integer, String>();
	     hm.put(101,"shubham");
	     hm.put(102,"prashant");
	     hm.put(103,"jaydeep");
	     hm.put(104, "rohit");
	     
	     RetrivalKeyFromValue obj=new RetrivalKeyFromValue();
	     Object key=obj.pritKey(hm,"jaydeep");
	     Object key1=obj.pritKey1(hm,"jaydeep");
	     System.out.println(key);
	     System.out.println(key1);
	}

	private Object pritKey(Map<Integer, String> hm, String myvalue) {
		
		Set s=hm.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()){
		Entry<Integer, String>entrySet=	(Entry<Integer, String>) itr.next();
		if(entrySet.getValue().equals(myvalue))
		   return entrySet.getKey();
		   
		}
		return 0;
		
	}
	private Object pritKey1(Map<Integer, String> hm, String myvalue) {
		
	for (Entry<Integer, String>entryset : hm.entrySet()) {
		if(entryset.getValue().equals(myvalue))
			return entryset.getKey();
	}
	return 0;
	}
}
