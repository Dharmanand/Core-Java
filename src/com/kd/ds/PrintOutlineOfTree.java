package com.kd.ds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://www.youtube.com/watch?v=thkuu_FWFD8   @ 20 Minutes forward
public class PrintOutlineOfTree {

	int level =0;
	
	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.right.left = new Node(5);
		root.right.right = new Node(6);
		
		printOutline(root);
	}

	private static void printOutline(Node root) {

		List<Integer> list = new ArrayList<>();
		PrintOutlineOfTree tree = new PrintOutlineOfTree();
		tree.getLeftViewOfTreeUsingLevel(root.left, 1, list);
		Collections.reverse(list);
		tree.level=0;
		tree.getRightViewOfTreeUsingLevel(root, 1, list);
		System.out.println(list);
	}

	private void getLeftViewOfTreeUsingLevel(Node node, int currentLevel, List<Integer> list) {

		if (node == null)
			return;
		if (level < currentLevel) {
			list.add(node.data);
			level = currentLevel;
		}
		getLeftViewOfTreeUsingLevel(node.left, currentLevel + 1, list);
	}
	
	private void getRightViewOfTreeUsingLevel(Node node, int currentLevel, List<Integer> list) {
		
		if (node == null)
			return;
		if (level < currentLevel) {
			list.add(node.data);
			level = currentLevel;
		}
		getRightViewOfTreeUsingLevel(node.right, currentLevel + 1, list);
	}
	
}
