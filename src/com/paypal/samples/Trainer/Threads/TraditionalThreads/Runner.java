package com.paypal.samples.Trainer.Threads.TraditionalThreads;

public class Runner {

	private int i = 1;

	public synchronized void OddPrint() {

		while (i % 2 != 1) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(i);
		i = i + 1;
		notify();

	}

	public synchronized void EvenPrint()  {
		
		while(i%2 != 0){
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(i);
		i =i+1;
		notify();

}
}
