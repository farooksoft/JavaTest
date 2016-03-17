package com.dsalgo.binarytree;

import java.util.Stack;

/*
 * Simple Binary Tree with
 * 
 *  				40
 *  		20				60
 *  	10		30		50		70
 *  
 * 1. Pre Order traversal
 	Visit the node.
	Traverse the left subtree in PreOrder.
	Traverse the right subtree in PreOrder.
 * 2. Post Order traversal
	Traverse the left subtree in PostOrder.
	Traverse the right subtree in PostOrder.
	Visit the node.
 * 3. In Order traversal
	Traverse the left subtree in InOrder.
	Visit the node.
	Traverse the right subtree in InOrder.
 */
public class BinaryTree {

	// inner static class - all variable are static on object
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
		
		System.out.println("----- Pre Order -----");
		System.out.println("Recursive approach");
		bTree.preOrderRecursive(tNode);
		
		System.out.println("\nIterative approach");
		bTree.preOrderIterative(tNode);
		
		System.out.println("\n\n----- Post Order -----");
		System.out.println("Recursive approach");
		bTree.postOrderRecursive(tNode);
		
		
		System.out.println("\n\n----- In Order -----");
		System.out.println("Recursive approach");
		bTree.inOrderRecursive(tNode);
		
		
	}

	private void inOrderRecursive(TreeNode tNode) {
		
		if(tNode != null){
			inOrderRecursive(tNode.left);
			print(tNode);
			inOrderRecursive(tNode.right);
		}
		
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
			print(pop);			
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
	
	private void postOrderRecursive(TreeNode tNode){		
		if(tNode != null){
			postOrderRecursive(tNode.left);
			postOrderRecursive(tNode.right);
			print(tNode);			
		}
	}
	

	private void print(TreeNode tNode) {
		System.out.print(tNode.data +" ");
	}

	//TODO - creating a manual tree - need to create a balanced btree(AVL)
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