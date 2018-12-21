package com.kd.threads.reentrantLock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeedLockPrevention {

	Account account1 = new Account();
	Account account2 = new Account();

	Lock lock1 = new ReentrantLock();
	Lock lock2 = new ReentrantLock();

	private void aquireLock(Lock lock1, Lock lock2) {

		while (true) {
			boolean gotFirstLock = false;
			boolean gotSecondLock = false;
			try {
				gotFirstLock = lock1.tryLock();
				gotSecondLock = lock2.tryLock();
			} finally {
				if (gotFirstLock && gotSecondLock)
					return;
				if (gotFirstLock)
					lock1.unlock();
				if (gotSecondLock)
					lock2.unlock();
			}

		}

	}

	public void firstThreadMethod() throws InterruptedException {
		Random random = new Random();
		for (int i = 0; i < 10000; i++) {
			try {
				aquireLock(lock1, lock2);
				Account.transfer(account1, account2, random.nextInt(100));
			} finally {
				lock1.unlock();
				lock2.unlock();
			}
		}
	}

	public void secondThreadMethod() throws InterruptedException {
		Random random = new Random();
		for (int i = 0; i < 10000; i++) {
			try {
				aquireLock(lock1, lock2);
				Account.transfer(account2, account1, random.nextInt(100));
			} finally {
				lock1.unlock();
				lock2.unlock();
			}
		}
	}

	public void finished() {
		System.out.println("Account1 balance: " + account1.getBalance());
		System.out.println("Account2 balance: " + account2.getBalance());
		System.out.println("Total balance: " + (account1.getBalance() + account2.getBalance()));
	}

}
