package com.paypal.samples.Trainer.Threads.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OddEvenPrinter {
	
	public static void main(String[] args){
		
		ExecutorService executeServ = Executors.newFixedThreadPool(2);
		
		executeServ.submit(new OddPrinter());
		executeServ.submit(new EvenPrinter());
		
		executeServ.shutdown();		
		
	}

}
