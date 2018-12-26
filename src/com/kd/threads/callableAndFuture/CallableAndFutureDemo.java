package com.kd.threads.callableAndFuture;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/*
 * Future: A Future represents the result of an asynchronous computation. 
 * 		   Methods are provided to check if the computation is complete, 
 * 		   to wait for its completion, and to retrieve the result of the computation. 
 * 		   The result can only be retrieved using method get when the computation has 
 * 		   completed, blocking if necessary until it is ready. 
 * 		   Cancellation is performed by the cancel method.
 * 
 * Callable: A task that returns a result and may throw an exception. 
 * 			 Implementors define a single method with no arguments called call. 
 * 			 The Callable interface is similar to java.lang.Runnable, in that both are 
 * 			 designed for classes whose instances are potentially executed by another 
 * 			 thread. A Runnable, however, does not return a result and cannot throw a 
 * 			 checked exception. 
 * 
 */
public class CallableAndFutureDemo {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newCachedThreadPool();

		Future<Integer> future = executor.submit(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				Random random = new Random();
				int duration = random.nextInt(4000);
				System.out.println(duration);
				System.out.println("Starting..");
				try {
					Thread.sleep(duration);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Finished..");
				return duration;
			}
		});

		executor.shutdown();

		try {
			System.out.println("Result is: " + future.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}