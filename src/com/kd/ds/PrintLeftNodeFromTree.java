package com.kd.ds;

import java.util.ArrayList;
import java.util.List;


// https://www.youtube.com/watch?v=thkuu_FWFD8
public class PrintLeftNodeFromTree {
	
	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.right.left = new Node(5);
		root.right.right = new Node(6);
		
		List<Integer> list = new ArrayList<>();
		collectLeftSideNodes(root, list);
		System.out.println(list);
	}

	
	// Using recursion, Complexity is O(N)
	private static void collectLeftSideNodes(Node root, List<Integer> list) {
		
		if(root == null)
			return ;
		list.add(root.data);
		if(root.left != null) {
			collectLeftSideNodes(root.left, list);
			if(root.left.left == null && root.left.right == null && root.right != null) {
				if(root.right.left != null) {
					collectLeftSideNodes(root.right.left, list);
				}
				else if(root.right.right != null) {
					collectLeftSideNodes(root.right.right, list);
				}
			}
		}
		else if(root.left == null && root.right != null) {
			collectLeftSideNodes(root.right, list);
		}
	}

}
