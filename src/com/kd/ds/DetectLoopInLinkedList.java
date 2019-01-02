package com.kd.ds;

import java.util.HashSet;

//Java program to detect loop in a linked list

/**
 * 
 * @author Kumar
 *
 * Using Hashing: Traverse the list one by one and keep putting the node addresses 
 *				  in a Hash Table(here I used HashSet). At any point, if NULL is reached 
 *				  then return false and if next of current node points to any of the 
 *				  previously stored nodes in Hash then return true.
 *
 */

public class DetectLoopInLinkedList {

	Node head; // head of list

	/* Linked list Node */
	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	/* Inserts a new Node at front of the list. */
	public void push(int new_data) {
		/*
		 * 1 & 2: Allocate the Node & Put in the data
		 */
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	// Returns true if there is a loop in linked
	// list else returns false.
	static boolean detectLoop(Node h) {
		HashSet<Node> s = new HashSet<Node>();
		while (h != null) {
			// If we have already has this node
			// in hashmap it means their is a cycle
			// (Because you we encountering the
			// node second time).
			if (s.contains(h))
				return true;

			// If we are seeing the node for
			// the first time, insert it in hash
			s.add(h);

			h = h.next;
		}

		return false;
	}

	/* Driver program to test above function */
	public static void main(String[] args) {
		DetectLoopInLinkedList llist = new DetectLoopInLinkedList();

		llist.push(20);
		llist.push(4);
		llist.push(15);
		llist.push(10);

		/* Create loop for testing */
		llist.head.next.next.next.next = llist.head;

		if (detectLoop(llist.head))
			System.out.println("Loop found");
		else
			System.out.println("No Loop");

	}

}
