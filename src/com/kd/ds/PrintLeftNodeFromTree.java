package com.kd.ds;

import java.util.ArrayList;
import java.util.List;

// https://www.youtube.com/watch?v=thkuu_FWFD8
public class PrintLeftNodeFromTree {

	int level = 0;

	public static void main(String[] args) {

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.right.left = new Node(5);
		root.right.right = new Node(6);

		new PrintLeftNodeFromTree().getLeftViewOfTreeUsingLevel(root, 1); // 1st method to get left view of Tree
		System.out.println();
		List<Integer> list = new ArrayList<>();
		collectLeftSideNodes(root, list); //	2nd method to get left view of Tree
		System.out.println(list);

	}

//	1st method to get left view of Tree, Complexity is O(N)
	private void getLeftViewOfTreeUsingLevel(Node node, int currentLevel) {

		if (node == null)
			return;
		if (level < currentLevel) {
			System.out.print(node.data+" ");
			level = currentLevel;
		}
		getLeftViewOfTreeUsingLevel(node.left, currentLevel + 1);
		getLeftViewOfTreeUsingLevel(node.right, currentLevel + 1);
	}

// 2nd method to get left view of Tree , Complexity is O(N), not considering space complexity for list
	private static void collectLeftSideNodes(Node root, List<Integer> list) {

		if (root == null)
			return;
		list.add(root.data);
		if (root.left != null) {
			collectLeftSideNodes(root.left, list);
			if (root.left.left == null && root.left.right == null && root.right != null) {
				if (root.right.left != null) {
					collectLeftSideNodes(root.right.left, list);
				} else if (root.right.right != null) {
					collectLeftSideNodes(root.right.right, list);
				}
			}
		} else if (root.left == null && root.right != null) {
			collectLeftSideNodes(root.right, list);
		}
	}

}
