package com.kd.threads.semaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <b>Definition :</b> Semaphore is simply a variable that is non-negative and
 * shared between threads. A semaphore is a signaling mechanism, and a thread
 * that is waiting on a semaphore can be signaled by another thread. It uses two
 * atomic operations, 1)wait, and 2) signal for the process synchronization. A
 * semaphore either allows or disallows access to the resource, which depends on
 * how it is set up. </br>
 * </br>
 * <b>Other Definition:</b> A Semaphore is a thread synchronization construct
 * that can be used either to send signals between threads to avoid missed
 * signals, or to guard a critical section like you would with a lock. Java 5
 * comes with semaphore implementations in the
 * <b><I>java.util.concurrent</I></b> package so you don't have to implement
 * your own semaphores. Still, it can be useful to know the theory behind their
 * implementation and use. Java 5 comes with a built-in Semaphore so you don't
 * have to implement your own. </br>
 * </br>
 * <b>Ref:</b> https://www.youtube.com/watch?v=shH38znT_sQ </br>
 * https://www.guru99.com/semaphore-in-operating-system.html
 * 
 */

public class SemaphoresDefinitionAndExample {

	static AtomicInteger ai = new AtomicInteger();

	public static void main(String[] args) throws InterruptedException {

		Semaphore semaphore = new Semaphore(3);
		ExecutorService service = Executors.newFixedThreadPool(50);

		for (int i = 0; i < 1000; i++) {
			service.execute(() -> {

				try {
					semaphore.acquire();
					Thread.sleep(1000);
					System.out.println("Current Thread acquired permit : " + Thread.currentThread().getName());
					System.out.println("count : " + ai.incrementAndGet());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				semaphore.release();
				System.out.println("Current Thread released permit : " + Thread.currentThread().getName());

			});
		}

		service.shutdown();
		service.awaitTermination(1, TimeUnit.MINUTES);

	}

}
