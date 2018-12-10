package com.kd.threads;

/**
 * 
 * @author Kumar 
 * 
 * Example:  
 * 		Thread-0  --> 1
 * 		Thread-1  --> 2
 * 		Thread-0  --> 3
 * 		Thread-1  --> 4 
 * 		......so on.
 */
public class ThreadsRunInAlternatively {

	public static volatile Integer i;
	static Object lock = new Object();

	public static void main(String[] args) throws InterruptedException {

		Runnable task = new Runnable() {

			@Override
			public void run() {
				try {
					execute();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		};

		Thread t1 =  new Thread(task);
		Thread t2 = new Thread(task);
		t1.start();
		t2.start();

	}

	public static void execute() throws InterruptedException {
		synchronized (lock) {
			for (i = 0; i <= 100; i++) {
				lock.notify();
				if (i > 0) {
					if (i % 2 != 0) {
						System.out.println("Thread Name: " + Thread.currentThread() + "--" + i);
					} else {
						System.out.println("Thread Name: " + Thread.currentThread() + "--" + i);
					}
					lock.wait();
				}else
					lock.wait();
			}
			lock.notify();
		}
	}
}
