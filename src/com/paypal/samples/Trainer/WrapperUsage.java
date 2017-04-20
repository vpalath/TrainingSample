package com.paypal.samples.Trainer;

import java.util.ArrayList;
import java.util.List;

public class WrapperUsage {
	
	public static void main(String[] args){
		
		Integer a1 ;
		a1=5;
		a1++;
		System.out.println("Value of a1 " + a1);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		
		int sum = 0;
		for(int i : list){
			 sum = sum+i;
		}
		
		System.out.println(sum);
		
		
		
	}

}
