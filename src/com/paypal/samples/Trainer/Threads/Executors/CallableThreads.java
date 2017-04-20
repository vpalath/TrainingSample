package com.paypal.samples.Trainer.Threads.Executors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableThreads {
	public static void main(String[] args) throws InterruptedException, ExecutionException{
	
	List<Future<Integer>> futures = new ArrayList<>();
	
	List<Integer> results = new ArrayList<>();
	final ExecutorService service = Executors.newFixedThreadPool(2);
	try{
		futures.add(service.submit(new CallableStockData()));
		futures.add(service.submit(new CallableNews()));
		//service.execute(new RunnablePrintHello());
		
		for(Future<Integer> future : futures){
			results.add(future.get());
		}
	}finally{
		service.shutdown();
		}
	for(Integer res: results){
		System.out.println("Got the result " + res);
		System.out.println();
		
	}
	
	

}
}
