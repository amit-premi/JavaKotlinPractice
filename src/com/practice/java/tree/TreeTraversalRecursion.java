package com.practice.java.tree;

public class TreeTraversalRecursion {

	static class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;

		TreeNode(int d){
			this.data = d;
		}

		@Override
		public String toString() {
			return "TreeNode [data=" + data + ", left=" + left + ", right=" + right + "]";
		}
	}

	private static void preOrderTraverse(TreeNode node) {
		if(node != null) {
			System.out.print(node.data +"  ");
			preOrderTraverse(node.left);
			preOrderTraverse(node.right);
		}
	}

	private static void inOrderTraverse(TreeNode node) {
		if(node != null) {
			inOrderTraverse(node.left);
			System.out.print(node.data +"  ");
			inOrderTraverse(node.right);
		}
	}

	private static void postOrderTraverse(TreeNode node) {
		if(node != null) {
			postOrderTraverse(node.left);
			postOrderTraverse(node.right);
			System.out.print(node.data +"  ");
		}
	}

	public static void main(String[] args) {

		TreeNode rootNode = new TreeNode(40);
		TreeNode node20 = new TreeNode(20);
		TreeNode node60 = new TreeNode(60);
		TreeNode node10 = new TreeNode(10);
		TreeNode node30 = new TreeNode(30);
		TreeNode node50 = new TreeNode(50);
		TreeNode node70 = new TreeNode(70);

		rootNode.left = node20;
		rootNode.right = node60;

		node20.left = node10;
		node20.right = node30;

		node60.left = node50;
		node60.right = node70;

		//System.out.println("Tree Structure: "+rootNode.toString());
		System.out.print("PreOrder Tree Traversal: ");
		preOrderTraverse(rootNode);
		System.out.print("\nInOrder Tree Traversal: ");
		inOrderTraverse(rootNode);
		System.out.print("\nPostOrder Tree Traversal: ");
		postOrderTraverse(rootNode);
	}
}
