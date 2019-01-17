package com.kd.threads.forkAndJoin.products;

import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class ProductMain {

	public static void main(String[] args) {
		
		ProductListGenerator generator = new ProductListGenerator();
		List<Product> products = generator.generate(10000);
		
		Task task = new Task(products, 0, products.size(), 0.20);
		ForkJoinPool pool = new ForkJoinPool();
		pool.execute(task);
		
//		Write Information about the pool
		while(!task.isDone()) {
			System.out.println("********************************");
			System.out.printf("Main: Parallelism: %d\n", pool.getParallelism());
			System.out.printf("Main: Active Thread Count: %d\n", pool.getActiveThreadCount());
			System.out.printf("Main: Queued Task Count: %d\n", pool.getQueuedTaskCount());
			System.out.printf("Main: Steal Count: %d\n", pool.getStealCount());
			System.out.println("********************************");
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		pool.shutdown();
		
//		Check if the task is completed normally.
		if(task.isCompletedNormally()) {
			System.out.println("Main: The process has been completed normally!!");
		}
		
//		Print product that don't has price = 12.
		for(Product product : products) {
			if(product.getPrice() != 12) {
				System.out.println("Product wit Name: "+product.getName()+" and Price: "+product.getName());
			}
		}
		
		System.out.println("End of the Execution !!");
		
	}

}
