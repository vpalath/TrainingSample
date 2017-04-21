package com.paypal.samples.Trainer.Threads.Executors;

public class EvenPrinter implements Runnable {

	@Override
	public void run() {
		for (int i=2 ;i<10;i=i+2){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
	}

}
