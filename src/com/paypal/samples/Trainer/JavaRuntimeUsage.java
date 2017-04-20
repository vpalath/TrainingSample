package com.paypal.samples.Trainer;

import java.io.IOException;

@MyDocAnnotation(author="John Doe",pubdate="12-Dec-2016",version=2,reviewers ={"vinee","kk"})
public class JavaRuntimeUsage {
	
	public static void main (String[]args) throws IOException{
		
		Runtime rt = Runtime.getRuntime();
		int processorCount = rt.availableProcessors() ; //no of cores
		
		System.out.println("No of processor cores " + processorCount);
		System.out.println("Total memory " +rt.totalMemory()/(1024*1024)+" MB");
		System.out.println("Free memory " +rt.freeMemory()/(1024*1024)+" MB");
		
		rt.exec("notepad");//exec an external program
		
	}

}
