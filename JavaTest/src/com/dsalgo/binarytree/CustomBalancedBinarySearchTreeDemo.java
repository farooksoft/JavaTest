package com.dsalgo.binarytree;

/**
 * program to create a balanced binary search tree from a sorted array
 * 
 * @author srayabar
 */
public class CustomBalancedBinarySearchTreeDemo {
	
	static int[] array = {1,2,3,4,5,6,7,8,9, 100};
	
	public static void main(String[] args) {
		TreeNode binarySearchTreeNode = createBalancedBinarySearchTree(array, 0, array.length-1);
		boolean isBst = IsBSTDemo.isBST(binarySearchTreeNode);
		System.out.println("Binary Tree is balanced - " + isBst);
	}
	
	public static TreeNode createBalancedBinarySearchTree(int[] array, int start, int end){
		
		if(start > end) return null;
		
		int mid = start + (end - start)/2;
		TreeNode node = new TreeNode(array[mid], "");
		
		node.leftChild = createBalancedBinarySearchTree(array, start, mid-1);
		node.rightChild = createBalancedBinarySearchTree(array, mid+1, end);
		
		return node;
	}
}