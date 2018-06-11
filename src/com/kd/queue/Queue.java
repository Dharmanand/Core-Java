package com.kd.queue;

public class Queue {

	private int[] object;
	private int front, rear;
	private int queueSize;

	public Queue() {
		queueSize = 3;
		front = -1;
		rear = -1;
		object = new int[queueSize];
	}

	public void enqueue(int item) {
		if (rear + 1 >= queueSize)
			resize();
		object[++rear] = item;
	}

	public Integer dequeue() {
		if (rear > front)
			return object[++front];
		return null;
	}

	public boolean isEmpty() {
		return (front == rear);
	}

	public int size() {
		return (rear - front);
	}

	private void resize() {
		int[] temp = object;
		queueSize = queueSize * 2;
		object = new int[queueSize];
		int size = rear - front;
		for (int i = 0; i < size; i++) {
			object[i] = temp[++front];
		}
		front = -1;
		rear = size-1;
	}
}
