package com.dsalgo.linkedlist;

/**
 * program to create a circular linked list - implementation 2
 * 
 * @author srayabar
 */
public class CustomCircularLinkedListDemo {
	
	public static void main(String[] args) {
		CustomCircularLinkedList linkedList = new CustomCircularLinkedList();
		linkedList.insertAtFirst(10);
		linkedList.insertAtLast(20);
		linkedList.display();
	}

}

/*
 * circular linkedlist class with below methods - 
 * 
 * isEmpty
 * getSize
 * insertAtFirst
 * insertAtLast
 * deleteAtFirst
 * deleteAtLast
 * insetAtIndex
 * deleteAtIndex
 * display
 * 
 * Note: last node always points to first node
 */
class CustomCircularLinkedList{
	private CyclicNode start;
	private CyclicNode end;
	int size;
	
	public CustomCircularLinkedList() {
		this.start = null;
		this.end = null;
		this.size = 0;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public int getSize(){
		return size;
	}
	
	public void insertAtFirst(int val){		
		CyclicNode node = new CyclicNode(val,null);
		if(!isEmpty()){
			node.setNext(start);
			start = node;
			end.setNext(start);
		}else{
			start = node;
			end = start;
		}
		size ++;
		System.out.println(val + " inserted at first");
	}
	
	public void insertAtLast(int val){
		CyclicNode node = new CyclicNode(val, null);
		if(!isEmpty()){
			end.setNext(node);
			node.setNext(start);
			end = node;
		}else{
			start = node;
			end = start;
		}
		size ++;
		System.out.println(val + " inserted at last");
	}
	
	public void display(){
		if(!isEmpty()){
			
			CyclicNode node = start;
			while(node.getNext() != start){
				System.out.println(node.getData());
				node = node.getNext();
			}
			
		}else{
			System.out.println("Cyclic linked list is empty");
		}
	}	
}

//simple node class with setter/getter methods
class CyclicNode{
	
	private CyclicNode next;
	private int data;
	
	public CyclicNode() {
		this.next = null;
		this.data = 0;
	}
	
	public CyclicNode(int data, CyclicNode next) {
		this.next = next;
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	public CyclicNode getNext() {
		return next;
	}
	public void setData(int data) {
		this.data = data;
	}
	public void setNext(CyclicNode next) {
		this.next = next;
	}
}