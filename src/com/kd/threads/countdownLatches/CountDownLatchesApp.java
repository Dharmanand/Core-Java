package com.kd.threads.countdownLatches;
/*
 * @author: Kumar
 * 
 *   A java.util.concurrent.CountDownLatch is a concurrency construct that
 *   allows one or more threads to wait for a given set of operations to complete.
 *
 *	 A CountDownLatch is initialized with a given count. 
 *   This count is decremented by calls to the countDown() method. 
 *   Threads waiting for this count to reach zero can call one of the await() methods. 
 *   Calling await() blocks the thread until the count reaches zero. 
 *  
 */
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CountDownLatchesApp {

	public static void main(String[] args) {

		CountDownLatch latch = new CountDownLatch(6);
		ExecutorService executer = Executors.newFixedThreadPool(2);
		
		for(int i=0; i<6; i++) {
			executer.submit(new Task(latch));
		}
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		executer.shutdown();
		System.out.println("Task execution completed");
		try {
			executer.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class Task implements Runnable {

	private CountDownLatch latch;

	public Task(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		System.out.println("Starting");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		latch.countDown();
	}

}