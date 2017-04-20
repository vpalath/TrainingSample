package com.paypal.training.subclass;

import com.paypal.training.basics.ProtectedTest;

public class ProtectedSubclassTest extends ProtectedTest {
	
	public static void main(String[] args){
		
		ProtectedSubclassTest pst = new ProtectedSubclassTest();
		 // ProtectedTest pt = new ProtectedTest();
		
		System.out.println(pst.superClassValue);
	}

}
