package com.paypal.samples.Trainer.Threads.Executors;

import java.util.concurrent.Callable;

public class CallableNews implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		for(int i =0;i<5;i++){
			Thread.sleep(500);
			System.out.println("Todays Headlines are ");
		}
		return 200;
	}

	

}
