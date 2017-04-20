package com.paypal.samples.Trainer;

public class StringBuilderUsage {
	
	public static void main (String[]args){

	StringBuilder sb = new StringBuilder(100);
	System.out.println(sb.capacity());
	
	StringBuilder sb1 = new StringBuilder();
	System.out.println(sb1.capacity());
	
	sb1.append("Vinee");
	sb1.append("Veda");
	System.out.println(sb1);
	
	sb1.insert(6, "Bond");
	
	System.out.println(sb1);
	System.out.println(sb1.toString());
	
	}
}
