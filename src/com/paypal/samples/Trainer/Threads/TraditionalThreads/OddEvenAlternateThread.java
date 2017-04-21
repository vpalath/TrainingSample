package com.paypal.samples.Trainer.Threads.TraditionalThreads;

public class OddEvenAlternateThread {
	
	
	public static void main(String[] args) throws InterruptedException{
		
	 Runner runner = new Runner();

		
		Thread t1 = new Thread(new Runnable(){
			@Override
			public void run(){
				for(int j=0;j<10;j++){
					runner.OddPrint();
				}
				
			}
			
		});
		
		Thread t2 = new Thread(new Runnable(){
			
			@Override
			public void run(){
				for(int j=0;j<10;j++){
					runner.EvenPrint();
				}
			}
			
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
	}

}
