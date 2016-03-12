package com.dsalgo.binarytree;

import java.util.Stack;

/*
 * Simple Binary Tree with 
 * 1. Pre Order traversal
 	Visit the node.
	Traverse the left subtree in PreOrder.
	Traverse the right subtree in PreOrder.
 * 2. Post Order traversal
 * 
 * 
 */
public class BinaryTree {

	public static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		public TreeNode(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {

		BinaryTree bTree = new BinaryTree();
		TreeNode tNode = createBinaryTree();
		
		System.out.println("Recursive approach");
		bTree.preOrderRecursive(tNode);
		System.out.println("Iterative approach");
		bTree.preOrderIterative(tNode);
	}

	//Need to do manual - uses external Stack
	/*
		Create empty stack and push root node to it.
		Do the following when stack is not empty
		Pop a node from stack and print it
		Push right child of popped node to stack
		Push left child of popped node to stack
	 */
	private void preOrderIterative(TreeNode tNode) {
		
		if(tNode == null)
			return;
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(tNode);
		
		while(!stack.empty()){
			
			TreeNode pop = stack.pop();			
			System.out.println(pop.data);
			if(pop.right != null)
				stack.push(pop.right);			
			if(pop.left != null)
				stack.push(pop.left);
		}
	}

	//recursive is easy - uses implicit Stack
	private void preOrderRecursive(TreeNode tNode) {
		
		if(tNode != null){
			print(tNode);
			preOrderRecursive(tNode.left);
			preOrderRecursive(tNode.right);
		}
		
	}

	private void print(TreeNode tNode) {
		System.out.println(tNode.data);
	}

	//TODO - creating a manual tree - need to create a balanced btree
	private static TreeNode createBinaryTree() {

		TreeNode rootNode = new TreeNode(40);

		TreeNode node20 = new TreeNode(20);
		TreeNode node10 = new TreeNode(10);
		TreeNode node30 = new TreeNode(30);
		TreeNode node60 = new TreeNode(60);
		TreeNode node50 = new TreeNode(50);
		TreeNode node70 = new TreeNode(70);

		rootNode.left = node20;
		rootNode.right = node60;

		node20.left = node10;
		node20.right = node30;

		node60.left = node50;
		node60.right = node70;

		return rootNode;
	}

}
