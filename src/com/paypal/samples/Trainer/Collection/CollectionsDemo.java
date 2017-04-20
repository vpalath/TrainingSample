package com.paypal.samples.Trainer.Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsDemo {
	
	public static void main (String [] args){
		
		List<Integer> li = new LinkedList<>();
		li.add(100);
		li.add(new Integer(200));
		li.add(300);
		
		for(Integer in: li){
			System.out.println(in +"");
		}
		
		System.out.println();
		li.forEach((i) -> System.out.println(i+ ""));
		
		System.out.println("Array List");
		System.out.println("----------------");
		
		System.out.println("Hash Set");
		System.out.println("-----------------");
		
		Set<Integer> s1 = new HashSet<>();
		
		s1.add(1000);
		s1.add(1000);s1.add(1000);
		s1.add(2000);
		s1.add(3000);
		s1.add(null);
		
		System.out.println("Tree Set");
		System.out.println("-----------------");
		
		Set<Integer> s2 = new TreeSet<>();
		s2.add(null);
		s2.add(1000);
		s2.add(1000);s1.add(1000);
		s2.add(2000);
		s2.add(3000);
		
		
		
		
	System.out.println(s1.size());
	
	System.out.println("Hash Map");
	System.out.println("-----------------");
	
	Map<String,String> hashMap = new HashMap<>();
	
	hashMap.put("CH", "Chennai");
	hashMap.put("CO", "Cochin");
	hashMap.put("BL", "Bangalore");
	hashMap.put("HY", "Hyderabad");
	
	//iterating using forEach
	System.out.println("-----------------");
	System.out.println("Iterating uisng for each");
	System.out.println("_________________");
	
	for(String key : hashMap.keySet()){
		System.out.println("Key  " + key + " Value  " + hashMap.get(key) );
	}
	
	//iterating using Iterators
	System.out.println("-----------------");
	System.out.println("Iterating uisng iterators");
	System.out.println("_________________");
	
	Iterator<String> keyIterator = hashMap.keySet().iterator();
	
	while(keyIterator.hasNext()){
		String key = keyIterator.next();
		System.out.println("Key is "+ key );
		System.out.println("Value is " + hashMap.get(key));
	}
	
	
	
	
		
		
		
		
		
		
		
		
	}

}
