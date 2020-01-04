package com.kd.threads.concurrentCollections;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecuteMultipleThreadsWithUniqueJob {
	public static void main(String[] args) throws InterruptedException {

//		CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();//Performace bies it is not good
//		ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();//It is faster than CopyOnWriteArraySet, but in search/Iteration It will take little time.
		
		Set<Integer> set = new ConcurrentHashMap<Integer, Integer>().newKeySet();//Herecreated cocurrentHashSet using cocurrentHashMap and newKeySet() method. It 	is faster than CopyOnWriteArraySet and ConcurrentSkipListSet.

		ExecutorService service = Executors.newFixedThreadPool(10000);
		for (int i = 0; i < 10000; i++) {
			service.execute(() -> {
				for (int j = 0; j < 10000; j++) {
					set.add(j);
				}
			});
			service.execute(() -> {
				for (int j = 100; j < 1200; j++) {
					if (set.contains(j))
						set.remove(j);
				}
			});
		}
		service.shutdown();
		service.awaitTermination(1, TimeUnit.MINUTES);
		System.out.println(set.size());
		Thread.sleep(10000);
		System.out.println(set.size());

	}

}
