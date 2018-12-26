package com.kd.threads.semaphores;

import java.util.concurrent.Semaphore;
/**
 * 
 * @author Kumar
 *
 *Semaphore : A counting semaphore. Conceptually, a semaphore maintains a set of permits. 
 *			  Each acquire blocks if necessary until a permit is available, and then takes it. 
 *			  Each release adds a permit, potentially releasing a blocking acquirer. 
 *			  However, no actual permit objects are used; the Semaphore just keeps a count of 
 *			  the number available and acts accordingly.  
 *
 */
public class Connection {

	private static Connection instance = new Connection();
	private int connections = 0;

//	Creates a Semaphore with the given number of permits and the given fairness setting.
//	Here, at a time max 10 threads can execute the connection.
	private Semaphore sem = new Semaphore(10, true);

	private Connection() {

	}

	public static Connection getInstance() {
		return instance;
	}

	public void connect() {
		try {
			try {
				sem.acquire();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			doConnect();
		} finally {
			sem.release();
		}
	}

	private void doConnect() {
		synchronized (this) {
			connections++;
			System.out.println("Current connections:  " + connections);
		}

		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		synchronized (this) {
			connections--;
		}
	}

}
