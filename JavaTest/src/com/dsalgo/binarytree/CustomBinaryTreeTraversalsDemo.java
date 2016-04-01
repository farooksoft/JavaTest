package com.dsalgo.binarytree;

import java.util.Stack;

/**
 * Simple Binary Tree with
  
   				40
   		20				60
   	10		30		50		70
   
 * 1. Pre Order traversal
 	Visit the node.
	Traverse the left subtree in PreOrder.
	Traverse the right subtree in PreOrder.
	
	40 20 10 30 60 50 70 
	
 * 2. Post Order traversal
	Traverse the left subtree in PostOrder.
	Traverse the right subtree in PostOrder.
	Visit the node.
	
	10 30 20 50 70 60 40 
	
 * 3. In Order traversal
	Traverse the left subtree in InOrder.
	Visit the node.
	Traverse the right subtree in InOrder.
	
	10 20 30 40 50 60 70 
	
 * @author srayabar
 */
public class CustomBinaryTreeTraversalsDemo {
	
	static TreeNode root;
	
	private void addNode(int data, String name){
		
		TreeNode newNode = new TreeNode(data, name);		
		if(root == null){			
			root = newNode;			
		} else {			
			TreeNode focusNode = root;
			TreeNode parent;
			while(true){
				parent = focusNode;
				//if the data is less than focusNode then go to it's left child
				if(data < focusNode.data){
					focusNode = focusNode.leftChild;
					//if null then we are at the leaf child - insert new node here
					if(focusNode == null){
						parent.leftChild = newNode;
						return;
					}
				} else {
					//then go to it's right child
					focusNode = focusNode.rightChild;
					//if null - insert new node here
					if(focusNode == null){
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}

	// inner static class - all variable are static on object
	public static class TreeNode {
		int data;
		String name;		
		TreeNode leftChild;
		TreeNode rightChild;

		public TreeNode(int data, String name) {
			this.data = data;
			this.name = name;
		}
		@Override
		public String toString() {
			return this.name + " has data " + this.data;
		}
	}

	public static void main(String[] args) {

		CustomBinaryTreeTraversalsDemo bTree = new CustomBinaryTreeTraversalsDemo();		
		bTree.addNode(10, "one");
		bTree.addNode(20, "two");
		bTree.addNode(30, "three");
		bTree.addNode(40, "four");
		bTree.addNode(50, "five");
		bTree.addNode(60, "six");
		bTree.addNode(70, "seven");
		
		System.out.println("----- Pre Order -----");
		System.out.println("Recursive approach");
		bTree.preOrderRecursive(bTree.root);
		
		System.out.println("\nIterative approach");
		bTree.preOrderIterative(bTree.root);
		
		System.out.println("\n\n----- Post Order -----");
		System.out.println("Recursive approach");
		bTree.postOrderRecursive(bTree.root);
		
		
		System.out.println("\n\n----- In Order -----");
		System.out.println("Recursive approach");
		bTree.inOrderRecursive(bTree.root);
	}

	private void inOrderRecursive(TreeNode tNode) {
		
		if(tNode != null){
			inOrderRecursive(tNode.leftChild);
			print(tNode);
			inOrderRecursive(tNode.rightChild);
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
			
			//push right first so that while popping left comes early
			if(pop.rightChild != null)
				stack.push(pop.rightChild);
			if(pop.leftChild != null)
				stack.push(pop.leftChild);
		}
	}

	//recursive is easy - uses implicit Stack
	private void preOrderRecursive(TreeNode tNode) {
		
		if(tNode != null){
			print(tNode);
			preOrderRecursive(tNode.leftChild);
			preOrderRecursive(tNode.rightChild);
		}		
	}
	
	private void postOrderRecursive(TreeNode tNode){		
		if(tNode != null){
			postOrderRecursive(tNode.leftChild);
			postOrderRecursive(tNode.rightChild);
			print(tNode);			
		}
	}
	

	private void print(TreeNode tNode) {
		System.out.print(tNode.data +" ");
	}
}