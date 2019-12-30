package com.kd.threads.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * <b>Definition :</b> CyclicBarrier is used to make threads wait for each other. It is used when different threads process a part of 
 * computation and when all threads have completed the execution, the result needs to be combined in the parent thread. In other words, a CyclicBarrier is 
 * used when multiple thread carry out different sub tasks and the output of these sub tasks need to be combined to form the final output. 
 * After completing its execution, threads call await() method and wait for other threads to reach the barrier. Once all the threads have 
 * reached, the barriers then give the way for threads to proceed.CyclicBarriers are defined in java.util.concurrent package. 
 * First a new instance of a CyclicBarriers is created specifying the number of threads that the barriers should wait upon.
 * </br></br>
 * 
 * <b>Ref:</b> https://www.youtube.com/watch?v=J3QZ5gfCtAg&list=PLhfHPmPYPPRk6yMrcbfafFGSbE2EPK_A6&index=8
 * </br>https://javarevisited.blogspot.com/2012/07/cyclicbarrier-example-java-5-concurrency-tutorial.html
 * 
 */

public class CyclicBarrierDefAndExample {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = Executors.newFixedThreadPool(10);
		CyclicBarrier barrier = new CyclicBarrier(3);

		Runnable task = () -> {
			
			while(true) {
				try {
					Thread.sleep(1000);
					barrier.await();
					System.out.println(Thread.currentThread().getName());
				} catch (InterruptedException | BrokenBarrierException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		};

		service.submit(task);
		service.submit(task);
		service.submit(task);	
		//Main thread wait until all child threads in cyclic barrier will not finish the execution.
		System.out.println("Main thread has been started when all privious threads will executed their task in cyclic barrier");
		
		service.shutdown();
		service.awaitTermination(1, TimeUnit.MINUTES);

	}

}
