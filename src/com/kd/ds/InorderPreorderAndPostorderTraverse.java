package com.kd.ds;

import java.util.ArrayList;
import java.util.List;

//https://www.youtube.com/watch?v=-b2lciNd2L4&ab_channel=Jenny%27slecturesCS%2FITNET%26JRF
public class InorderPreorderAndPostorderTraverse {

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

		System.out.println(inOrder(root)); // output : [8, 4, 9, 2, 10, 5, 11, 1, 12, 6, 13, 3, 14, 7, 15]
		System.out.println(preOrder(root)); // output : [1, 2, 4, 8, 9, 5, 10, 11, 3, 6, 12, 13, 7, 14, 15]
		System.out.println(postOrder(root)); // output : [8, 9, 4, 10, 11, 5, 2, 12, 13, 6, 14, 15, 7, 3, 1]
	}

	static List<Integer> inOrder(Node root) {
		List<Integer> list = new ArrayList<>();
		inOrderTraverse(root, list);
		return list;
	}

	static void inOrderTraverse(Node root, List<Integer> list) {

		if (root == null)
			return ;
		inOrderTraverse(root.left, list);
		list.add(root.data);
		inOrderTraverse(root.right, list);
	}
	
	static List<Integer> preOrder(Node root) {
		List<Integer> list = new ArrayList<>();
		preOrderTraverse(root, list);
		return list;
	}
	
	static void preOrderTraverse(Node root, List<Integer> list) {
		
		if (root == null)
			return ;
		list.add(root.data);
		preOrderTraverse(root.left, list);
		preOrderTraverse(root.right, list);
	}
	static List<Integer> postOrder(Node root) {
		List<Integer> list = new ArrayList<>();
		postOrderTraverse(root, list);
		return list;
	}
	
	static void postOrderTraverse(Node root, List<Integer> list) {
		
		if (root == null)
			return ;
		postOrderTraverse(root.left, list);
		postOrderTraverse(root.right, list);
		list.add(root.data);
	}

}
