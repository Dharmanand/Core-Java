package com.kd.threads.countdownLatches;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * <b>Definition:</b> CountDownLatch in Java is a kind of synchronizer which allows one Thread  to wait for one or more Threads before 
 * starts processing. This is very crucial requirement and often needed in server side core Java application and having this functionality 
 * built-in as CountDownLatch greatly simplifies the development. CountDownLatch in Java is introduced on Java 5 along with other 
 * concurrent utilities like CyclicBarrier, Semaphore, ConcurrentHashMap and BlockingQueue in java.util.concurrent package.</br></br>
 * <b>Ref:</b> https://javarevisited.blogspot.com/2012/07/countdownlatch-example-in-java.html#ixzz69YHrfW6M
 * </br>https://www.youtube.com/watch?v=J3QZ5gfCtAg&list=PLhfHPmPYPPRk6yMrcbfafFGSbE2EPK_A6&index=8

 */

public class CountDownLatchesSimpleDefAndExample {

	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService service = Executors.newFixedThreadPool(10);
		CountDownLatch latch = new CountDownLatch(3);

		Runnable depService = () -> {
			System.out.println("Start Execution by thread : "+Thread.currentThread().getName() + "In");//startup task
			latch.countDown(); //here count of latch is decreasing
			System.out.println("End Execution by thread : "+Thread.currentThread().getName());//continue to other operations
		};

		service.execute(depService);
		service.execute(depService);
		service.execute(depService);	//After this execution main thread will start the execution.  
		service.execute(depService);	// Main thread will not wait for this thread execution start because here latch count is 0.
		
		latch.await(); //Main thread wait until latch count becomes zero.
		
		System.out.println("All dependent services has been initialized");
		
		service.shutdown();
		service.awaitTermination(1, TimeUnit.MINUTES);

	}

}
