package com.paypal.samples.Trainer.Lambda;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Starter {
	
	public static void main(String[]args){
		
		System.out.println("********Starter ---Simple Lambda Expressions*****");
		Consumer<String> c1 = s-> System.out.println("Length of String is :" +s.length());
		c1.accept("Hello");
		System.out.println();
		
		
		Supplier<String> s1 = ()->"Hello";
		System.out.println(s1.get());
		System.out.println();
		
		System.out.println("*****1- Target type provided by API - Comparator Interface");
		String[] friendList1 = {"Jane","Ann","Frank"};
		Arrays.sort(friendList1,(String f1,String f2)->Integer.compare(f1.length(),f2.length()));
		System.out.println(Arrays.toString(friendList1));
		
		

	}

}
