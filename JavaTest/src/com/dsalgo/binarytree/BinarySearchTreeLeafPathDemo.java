package com.dsalgo.binarytree;

/**
 * 
     Problem: Given a tree and a sum, return true if there is a path from the root
     down to a leaf, such that adding up all the values along the path
     equals the given sum.<br>
  
     Strategy: subtract the node value from the sum when recurring down,
     and check to see if the sum is 0 when you run out of tree.
     
 * @author srayabar
 */
public class BinarySearchTreeLeafPathDemo {
	
	static Node root;
	
	public static boolean hasPathtoLeaf(Node node, int sum){
		if(node == null){
			return (sum == 0);
		}
		
		int remainingSum = sum - node.data;
		// sum at node value is 0 and it's a leaf since both left and child are NULL  
		if(remainingSum == 0 && node.leftChild == null && node.rightChild == null){
			return true;
		}
		
		//look for left node recursively if it's present
		boolean left = false;
		if(node.leftChild != null)
			left = hasPathtoLeaf(node.leftChild, remainingSum);
		
		//look for right node recursively if it's present
		boolean right = false;
		if(node.leftChild != null)
			right = hasPathtoLeaf(node.rightChild, remainingSum);
		
		//if either of the one has path then return true
		return left || right;
	}
	
	
	public static void main(String[] args) {
		
		BinarySearchTreeLeafPathDemo pathDemo = new BinarySearchTreeLeafPathDemo();		
		pathDemo.root = new Node(15);
		pathDemo.root.leftChild = new Node(6);
		pathDemo.root.rightChild = new Node(17);
		
		boolean hasPathtoLeaf = pathDemo.hasPathtoLeaf(pathDemo.root, 22);
		System.out.println("Has path - " + hasPathtoLeaf);
	}
}

// Tree node
class Node{	
	int data;
	Node leftChild;
	Node rightChild;
	
	Node(int data){
		this.data = data;
	}
}