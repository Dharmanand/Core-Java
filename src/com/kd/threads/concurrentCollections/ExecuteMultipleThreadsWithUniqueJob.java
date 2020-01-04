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
//		ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();//It is faster than CopyOnWriteArraySet, but in search/Iteration It will take little time.
		
		Set<Integer> set = new ConcurrentHashMap<>().newKeySet();//Herecreated cocurrentHashSet using cocurrentHashMap and newKeySet() method. It 	is faster than CopyOnWriteArraySet and ConcurrentSkipListSet.
		Set<String> set1 = new ConcurrentHashMap<>().newKeySet();//Maintain a group of all unique threads during jab executions. 

		ExecutorService service = Executors.newFixedThreadPool(10000);
		for (int i = 0; i < 10000; i++) {
			set1.add(Thread.currentThread().getName());
			service.execute(() -> {
				set1.add(Thread.currentThread().getName());
				for (int j = 0; j < 10000; j++) {
					set.add(j);
				}
			});
			service.execute(() -> {
				set1.add(Thread.currentThread().getName());
				for (int j = 100; j < 1200; j++) {
					if (set.contains(j))
						set.remove(j);
				}
			});
		}
		service.shutdown();
		service.awaitTermination(1, TimeUnit.MINUTES);
		System.out.println("Toal data : "+set.size());
		System.out.println("Toal Threads : "+set1.size());
		set1.stream().forEach(i -> System.out.println(i));

	}

}
