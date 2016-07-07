package com.dsalgo.linkedlist;

/**
 * custom circular linkedlist implementation1
 * 
 * @author srayabar
 */
public class CircularLinkedImplList {
	
	private ListNode head = null;
    private int numberOfElements = 0;
    private ListNode actualElement = null;
    private int index = 0;

    public boolean isEmpty() {
        return (this.numberOfElements == 0);
    }

    public int getNumberOfElements() {
        return this.numberOfElements;
    }

    public void insertFirst(Object data) {
        if (!(isEmpty())) {
            this.index++;
        }
        ListNode listNode = new ListNode(data, this.head);
        this.head = listNode;
        this.numberOfElements++;
    }

    public void insertAfterActual(Object data) {
        ListNode listNode = new ListNode(data, this.actualElement.next);
        this.actualElement.next = listNode;
        this.numberOfElements++;
    }

    public boolean deleteFirst() {
        if (isEmpty())
            return false;
        if (this.index > 0)
            this.index--;
        this.head = this.head.next;
        this.numberOfElements--;
        return true;
    }

    public boolean deleteActualElement() {
        if (this.index > 0) {
            this.numberOfElements--;
            this.index--;
            ListNode listNode = this.head;
            while (listNode.next.equals(this.actualElement) == false)
                listNode = listNode.next;
            listNode.next = this.actualElement.next;
            this.actualElement = listNode;
            return true;
        }        
        this.actualElement = this.head.next;
        this.index = 0;
        return deleteFirst();        
    }

    public boolean goToNextElement() {
        if (isEmpty())
            return false;
        this.index = (this.index + 1) % this.numberOfElements;
        if (this.index == 0)
            this.actualElement = this.head;
        else
            this.actualElement = this.actualElement.next;
        return true;
    }

    public Object getActualElementData() {
        return this.actualElement.data;
    }

    public void setActualElementData(Object data) {
        this.actualElement.data = data;
    }

}

class ListNode{
	
	public ListNode next;
	public Object data;
	
	public ListNode(Object data, ListNode next) {
		this.data = data;
		this.next = next;
	}	
}
