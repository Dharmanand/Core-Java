package com.kd.queue;

public class QueueMain {

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(101);
		queue.enqueue(15);
		queue.enqueue(19);
		queue.enqueue(105);
		queue.enqueue(101);
		queue.enqueue(158);
		queue.enqueue(119);
		System.out.println("Queue size: "+queue.size());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println("Queue size: "+queue.size());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println("Queue size: "+queue.size());
		System.out.println("-----********----");
		queue.enqueue(51);
		queue.enqueue(65);
		queue.enqueue(71);
		queue.enqueue(91);
		queue.enqueue(911);
		System.out.println("Queue size: "+queue.size());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println("Queue size: "+queue.size());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println("Queue size: "+queue.size());
	}

}
