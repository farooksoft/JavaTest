package com.dsalgo.linkedlist;

public class LinkedListScratchMain {

	public static void main(String[] args) {

		LinkedListCustom custom = new LinkedListCustom();

		custom.add(10);
		custom.add(20);
		custom.add(30);		
		System.out.println(custom.toString());
		
		custom.remove(2);
		System.out.println(custom.toString());
		
		custom.add(40,10);
		System.out.println(custom.toString());
		
		System.out.println(custom.get(3));
		
	}
}

/**
 * custom linked list class where all the impl is there
 * 
 * @author srayabar
 *
 */
class LinkedListCustom {

	private Node head;
	private int listCount;

	public LinkedListCustom() {
		this.head = new Node(null);
		this.listCount = 0;
	}

	/**
	 * appends data node at the end of the linked list
	 * 
	 * @param data
	 */
	public void add(Object data) {

		Node temNode = new Node(data);
		Node currentHead = this.head;

		while (currentHead.getNext() != null) {
			currentHead = currentHead.getNext();
		}

		currentHead.setNext(temNode);
		this.listCount++;

	}

	/**
	 * inserts a node at specific index
	 * 
	 * @param data
	 * @param next
	 */
	public void add(Object data, int index) {

		Node temNode = new Node(data);
		Node currentHead = this.head;

		for (int i = 1; i < index && currentHead.getNext() != null; i++) {
			currentHead = currentHead.getNext();
		}

		temNode.setNext(currentHead.getNext());
		currentHead.setNext(temNode);
		this.listCount++;

	}

	public Object get(int index) {

		if (index <= 0) {// 0 or -int case
			return null;
		}

		Node currentNode = this.head.getNext();
		for (int i = 1; i < index; i++) {
			if (currentNode.getNext() == null) {
				return null;
			}

			currentNode = currentNode.getNext(); // more than 2 case
		}
		return currentNode.getData(); // default : 1 case
	}

	public boolean remove(int index) {

		// 0 or -1 case
		if (index < 1 || index > size()) {
			return false;
		}

		Node currentNode = this.head;
		for (int i = 1; i < index; i++) {// more than 2 case
			if (currentNode.getNext() == null) {
				return false;
			}

			currentNode = currentNode.getNext();
		}

		currentNode.setNext(currentNode.getNext().getNext());
		this.listCount--;

		return true;
	}

	public int size() {
		return this.listCount;
	}

	@Override
	public String toString() {

		Node currentNode = this.head.getNext();
		String outpust = "";
		while (currentNode != null) {
			outpust += currentNode.getData().toString() + ", ";
			currentNode = currentNode.getNext();
		}

		return outpust;
	}

}

/**
 * Node object to point to next Object in the chain if no link is passed then
 * null by default
 * 
 * @author srayabar
 */
class Node {

	Node next;
	Object data;

	public Node(Object data) {
		this.data = data;
		this.next = null;
	}

	public Node(Object data, Node next) {
		this.data = data;
		this.next = next;
	}

	/**
	 * @return the next
	 */
	public Node getNext() {
		return this.next;
	}

	/**
	 * @param next
	 * the next to set
	 */
	public void setNext(Node next) {
		this.next = next;
	}

	/**
	 * @return the data
	 */
	public Object getData() {
		return this.data;
	}

	/**
	 * @param data
	 * the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((next == null) ? 0 : next.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (next == null) {
			if (other.next != null)
				return false;
		} else if (!next.equals(other.next))
			return false;
		return true;
	}

}