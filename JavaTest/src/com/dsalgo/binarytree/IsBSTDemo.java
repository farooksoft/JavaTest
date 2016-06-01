package com.dsalgo.binarytree;

/**
 * Youtube link - https://youtu.be/MILxfAbIhrE<br>
 * 
 * Given a binary tree, return true if it is binary search tree else return false.<br>
 * 
 * Solution - 
 * Keep min, max for every recursion. Initial min and max is very small and very larger
 * number. Check if root.data is in this range. When you go left pass min and root.data and 
 * for right pass root.data and max.
 * 
 * Time complexity is O(n) since we are looking at all nodes.
 * 
 * <pre>
 * Test cases:
 * Null tree
 * 1 or 2 nodes tree
 * Binary tree which is actually BST
 * Binary tree which is not a BST
 * </pre>
 * @author srayabar
 */
public class IsBSTDemo {
	
	//method to trigger check
	public static boolean isBST(TreeNode root){
		return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	//recursive function which checks for all the nodes
	private static boolean isBST(TreeNode root, int minValue, int maxValue) {
		//if root is null, it's a BST
		if(root == null){
			return true;
		}
		//if root data is equals to either of min or max then it's not valid BST
		if(root.data <= minValue || root.data > maxValue){
			return false;
		}
		//repeat for the all the nodes from the top
		return isBST(root.leftChild, minValue, root.data) && isBST(root.rightChild, root.data, maxValue);
	}
	
	//TODO - 
	private boolean isBSTNonRecursive(TreeNode root){
		return false;
	}
	
}

class TreeNode {
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