package com.kd.ds;

import java.util.ArrayList;
import java.util.List;

//Level order traversal of a tree is breadth-first traversal for the tree.
//https://practice.geeksforgeeks.org/problems/level-order-traversal/1#
//https://www.youtube.com/watch?v=Kfm00t4YKow&ab_channel=GaurAssociates

public class LevelOrderTraversal {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.left.left.left = new Node(8);
		root.left.left.right = new Node(9);
		root.left.right.left = new Node(10);
		root.left.right.right = new Node(11);
		root.right.left.left = new Node(12);
		root.right.left.right = new Node(13);
		root.right.right.left = new Node(14);
		root.right.right.right = new Node(15);

		System.out.println(traversal(root));
	}

	static List<Integer> traversal(Node node) {
		List<Node> q = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		q.add(node);

		while (!q.isEmpty()) {
			node = q.remove(0);
			list.add(node.data);

			if (node.left != null) {
				q.add(node.left);
			}

			if (node.right != null) {
				q.add(node.right);
			}
		}

		return list;
	}
}
