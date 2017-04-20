package com.paypal.samples.Trainer.Threads;

public class MultipleThreadExample extends Thread{

	private String name, msg;

	public MultipleThreadExample(String name, String msg) {
		this.name = name;
		this.msg = msg;
	}

	@Override
	public void run() {

		System.out.println(name + " starts executing");
		System.out.println(Thread.currentThread().getName());

		for (int i = 0; i < 5; i++) {
			System.out.println(name + " says " + msg + " for " + i + " times");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException ie) {}
		}

		System.out.println((name + " finishes execution"));
	}

	public static void main(String[] args) throws InterruptedException {

		MultipleThreadExample mth1 = new MultipleThreadExample("Thread1", "HelloWorld");
		MultipleThreadExample mth2 = new MultipleThreadExample("Thread2", "HelloWorld");
		System.out.println(Thread.currentThread().getName());
		mth1.start();
		mth2.start();
		mth1.join();
		mth2.join();
		System.out.println("Finished Executing");
	}
}
